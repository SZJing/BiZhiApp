package com.example.bizhiapp;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.DownloadManager;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AnimationSet;
import android.widget.ImageView;
import android.widget.Toast;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {

    private String mCategroey = "0";
    private String mSize = "0";
    private String mColor = "0";
    private String mPage = "1";
    private List<HtmlInfo> lists;
    private RecyclerView recy;
    private static final int UPDATE = 0;
    private static final int MESSAGE = 1;
    private ImageView next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recy = (RecyclerView) findViewById(R.id.recycler);
        next = (ImageView) findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int page = Integer.valueOf(mPage) + 1;
                mPage = String.valueOf(page);
                RequestInfo();
                ObjectAnimator animator = ObjectAnimator.ofFloat(next,"scaleX",1f,0.8f,0.5f,0.8f,1f);
                ObjectAnimator animator1 = ObjectAnimator.ofFloat(next,"scaleY",1f,0.8f,0.5f,0.8f,1f);
                AnimatorSet set = new AnimatorSet();
                set.playTogether(animator,animator1);
                set.setDuration(800);
                set.start();
            }
        });


        //请求网络获取网页
        RequestInfo();
    }

    private void RequestInfo(){
        Request request = new Request.Builder()
                .url("http://www.win4000.com/mobile_" + mCategroey + "_" + mColor + "_" + mSize + "_" +mPage + ".html")
                .build();
        OkHttpClient client = new OkHttpClient();
        Call call = client.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                if (response.isSuccessful()){
                    String result = response.body().string();
                    Log.d("获取的信息",result);
                    parseHtml(result);
                }else{
                    handler.sendEmptyMessage(MESSAGE);
                }
            }
        });
    }

    private void parseHtml(String html){
        Document document = Jsoup.parse(html);
        Elements elements = document.select("div.Left_bar ul li");
        lists = new ArrayList<>();
        HtmlInfo htmlInfo;
        for (Element element:elements){
            String image = element.select("a").first().children().first().attr("data-original");
            String url = element.select("a").first().attr("href");
            String title = element.select("a").first().attr("title");
            Log.d("图片",image);
            Log.d("连接",url);
            Log.d("标题",title);
            htmlInfo = new HtmlInfo();
            htmlInfo.setImage(image);
            htmlInfo.setUrl(url);
            htmlInfo.setTitle(title);
            lists.add(htmlInfo);
            handler.sendEmptyMessage(UPDATE);
        }
    }

    private Handler handler = new Handler(){
        public void handleMessage(Message msg){
            super.handleMessage(msg);
            switch (msg.what){
                case UPDATE:
                    initRecycler();
                    break;
                case MESSAGE:
                    Toast.makeText(MainActivity.this,"已经到头了，看看别的壁纸吧",Toast.LENGTH_SHORT).show();
                    break;
            }
        }
    };

    private void initRecycler(){
        StaggeredGridLayoutManager layoutM = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        recy.setLayoutManager(layoutM);
        ImageAdapter adapter = new ImageAdapter(this,lists);
        recy.setAdapter(adapter);
    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.categroy,menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.cate:
                Intent intent = new Intent(this,CategroyActivity.class);
                startActivityForResult(intent,1);
        }
        return true;
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (requestCode){
            case 1:
                if (resultCode == RESULT_OK){
                    String mCate = data.getStringExtra("CATE");
                    int number = Integer.valueOf(mCate);
                    if (number > 20||number == 0){
                        mPage = "1";
                        mCategroey = mCate;
                        RequestInfo();
                    }else {
                        mPage = "1";
                        mColor = mCate;
                        RequestInfo();
                    }
                }
        }
    }

}
