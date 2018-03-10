package com.example.bizhiapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CategroyActivity extends AppCompatActivity implements View.OnClickListener{
    private Button buttonAll;
    private Button buttonMingxing;
    private Button buttonMeinv;
    private Button buttonQiche;
    private Button buttonFengjing;
    private Button buttonKeai;
    private Button buttonWeimei;
    private Button buttonDongman;
    private Button buttonAiqing;
    private Button buttonYouxi;
    private Button buttonYingshi;
    private Button buttonDongwu;
    private Button buttonZhiwu;
    private Button buttonTiyu;
    private Button buttonMeishi;
    private Button buttonChuangyi;
    private Button buttonYellow;
    private Button buttonOrange;
    private Button buttonRed;
    private Button buttonPink;
    private Button buttonZise;
    private Button buttonGreen;
    private Button buttonBlue;
    private Button buttonHuise;
    private Button buttonBlack;
    private Button buttonWhite;
    private String cate;
    private String color;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categroy);
        buttonAll = (Button) findViewById(R.id.button_all);
        buttonMingxing = (Button) findViewById(R.id.button_mingxing);
        buttonMeinv = (Button) findViewById(R.id.button_meinv);
        buttonQiche = (Button) findViewById(R.id.button_qiche);
        buttonFengjing = (Button) findViewById(R.id.button_fengjing);
        buttonKeai = (Button) findViewById(R.id.button_keai);
        buttonWeimei = (Button) findViewById(R.id.button_weimei);
        buttonDongman = (Button) findViewById(R.id.button_dongman);
        buttonAiqing = (Button) findViewById(R.id.button_aiqing);
        buttonYouxi = (Button) findViewById(R.id.button_youxi);
        buttonYingshi = (Button) findViewById(R.id.button_yingshi);
        buttonDongwu = (Button) findViewById(R.id.button_dongwu);
        buttonZhiwu = (Button) findViewById(R.id.button_zhiwu);
        buttonTiyu = (Button) findViewById(R.id.button_tiyu);
        buttonMeishi = (Button) findViewById(R.id.button_meishi);
        buttonChuangyi = (Button) findViewById(R.id.button_chuangyi);
        buttonYellow = (Button) findViewById(R.id.button_yellow);
        buttonOrange = (Button) findViewById(R.id.button_orange);
        buttonRed = (Button) findViewById(R.id.button_red);
        buttonPink = (Button) findViewById(R.id.button_pink);
        buttonZise = (Button) findViewById(R.id.button_zise);
        buttonGreen = (Button) findViewById(R.id.button_green);
        buttonBlue = (Button) findViewById(R.id.button_bule);
        buttonHuise = (Button) findViewById(R.id.button_huise);
        buttonBlack = (Button) findViewById(R.id.button_black);
        buttonWhite = (Button) findViewById(R.id.button_white);

        buttonAll.setOnClickListener(this);
        buttonMingxing.setOnClickListener(this);
        buttonMeinv.setOnClickListener(this);
        buttonQiche.setOnClickListener(this);
        buttonFengjing.setOnClickListener(this);
        buttonKeai.setOnClickListener(this);
        buttonWeimei.setOnClickListener(this);
        buttonDongman.setOnClickListener(this);
        buttonAiqing.setOnClickListener(this);
        buttonYouxi.setOnClickListener(this);
        buttonYingshi.setOnClickListener(this);
        buttonDongwu.setOnClickListener(this);
        buttonZhiwu.setOnClickListener(this);
        buttonTiyu.setOnClickListener(this);
        buttonMeishi.setOnClickListener(this);
        buttonChuangyi.setOnClickListener(this);
        buttonYellow.setOnClickListener(this);
        buttonOrange.setOnClickListener(this);
        buttonRed.setOnClickListener(this);
        buttonPink.setOnClickListener(this);
        buttonZise.setOnClickListener(this);
        buttonGreen.setOnClickListener(this);
        buttonBlue.setOnClickListener(this);
        buttonHuise.setOnClickListener(this);
        buttonBlack.setOnClickListener(this);
        buttonWhite.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button_all:
               cate = String.valueOf(0);
                Intent intent = new Intent();
                intent.putExtra("CATE",cate);
                setResult(RESULT_OK,intent);
                finish();
                break;
            case R.id.button_mingxing:
                cate = String.valueOf(2338);
                Intent intent1 = new Intent();
                intent1.putExtra("CATE",cate);
                setResult(RESULT_OK,intent1);
                finish();
                break;
            case R.id.button_meinv:
                cate = String.valueOf(2340);
                Intent intent2 = new Intent();
                intent2.putExtra("CATE",cate);
                setResult(RESULT_OK,intent2);
                finish();
                break;
            case R.id.button_qiche:
                cate = String.valueOf(2342);
                Intent intent3 = new Intent();
                intent3.putExtra("CATE",cate);
                setResult(RESULT_OK,intent3);
                finish();
                break;
            case R.id.button_fengjing:
                cate = String.valueOf(2341);
                Intent intent4 = new Intent();
                intent4.putExtra("CATE",cate);
                setResult(RESULT_OK,intent4);
                finish();
                break;
            case R.id.button_keai:
                cate = String.valueOf(2343);
                Intent intent5 = new Intent();
                intent5.putExtra("CATE",cate);
                setResult(RESULT_OK,intent5);
                finish();
                break;
            case R.id.button_weimei:
                cate = String.valueOf(2344);
                Intent intent6 = new Intent();
                intent6.putExtra("CATE",cate);
                setResult(RESULT_OK,intent6);
                finish();
                break;
            case R.id.button_dongman:
                cate = String.valueOf(2346);
                Intent intent7 = new Intent();
                intent7.putExtra("CATE",cate);
                setResult(RESULT_OK,intent7);
                finish();
                break;
            case R.id.button_aiqing:
                cate = String.valueOf(2347);
                Intent intent8 = new Intent();
                intent8.putExtra("CATE",cate);
                setResult(RESULT_OK,intent8);
                finish();
                break;
            case R.id.button_youxi:
                cate = String.valueOf(2353);
                Intent intent9 = new Intent();
                intent9.putExtra("CATE",cate);
                setResult(RESULT_OK,intent9);
                finish();
                break;
            case R.id.button_yingshi:
                cate = String.valueOf(2354);
                Intent intent10 = new Intent();
                intent10.putExtra("CATE",cate);
                setResult(RESULT_OK,intent10);
                finish();
                break;
            case R.id.button_dongwu:
                cate = String.valueOf(2355);
                Intent intent11 = new Intent();
                intent11.putExtra("CATE",cate);
                setResult(RESULT_OK,intent11);
                finish();
                break;
            case R.id.button_zhiwu:
                cate = String.valueOf(2356);
                Intent intent12 = new Intent();
                intent12.putExtra("CATE",cate);
                setResult(RESULT_OK,intent12);
                finish();
                break;
            case R.id.button_tiyu:
                cate = String.valueOf(2360);
                Intent intent13 = new Intent();
                intent13.putExtra("CATE",cate);
                setResult(RESULT_OK,intent13);
                finish();
                break;
            case R.id.button_meishi:
                cate = String.valueOf(2362);
                Intent intent14 = new Intent();
                intent14.putExtra("CATE",cate);
                setResult(RESULT_OK,intent14);
                finish();
                break;
            case R.id.button_chuangyi:
                cate = String.valueOf(2352);
                Intent intent15 = new Intent();
                intent15.putExtra("CATE",cate);
                setResult(RESULT_OK,intent15);
                finish();
                break;
            case R.id.button_yellow:
                color = String.valueOf(1);
                Intent intent16 = new Intent();
                intent16.putExtra("CATE",color);
                setResult(RESULT_OK,intent16);
                finish();
                break;
            case R.id.button_orange:
                color = String.valueOf(2);
                Intent intent17 = new Intent();
                intent17.putExtra("CATE",color);
                setResult(RESULT_OK,intent17);
                finish();
                break;
            case R.id.button_red:
                color = String.valueOf(3);
                Intent intent18 = new Intent();
                intent18.putExtra("CATE",color);
                setResult(RESULT_OK,intent18);
                finish();
                break;
            case R.id.button_pink:
                color = String.valueOf(4);
                Intent intent19 = new Intent();
                intent19.putExtra("CATE",color);
                setResult(RESULT_OK,intent19);
                finish();
                break;
            case R.id.button_zise:
                color = String.valueOf(5);
                Intent intent20 = new Intent();
                intent20.putExtra("CATE",color);
                setResult(RESULT_OK,intent20);
                finish();
                break;
            case R.id.button_green:
                color = String.valueOf(6);
                Intent intent21 = new Intent();
                intent21.putExtra("CATE",color);
                setResult(RESULT_OK,intent21);
                finish();
                break;
            case R.id.button_bule:
                color = String.valueOf(7);
                Intent intent22 = new Intent();
                intent22.putExtra("CATE",color);
                setResult(RESULT_OK,intent22);
                finish();
                break;
            case R.id.button_huise:
                color = String.valueOf(8);
                Intent intent23 = new Intent();
                intent23.putExtra("CATE",color);
                setResult(RESULT_OK,intent23);
                finish();
                break;
            case R.id.button_black:
                color = String.valueOf(9);
                Intent intent24 = new Intent();
                intent24.putExtra("CATE",color);
                setResult(RESULT_OK,intent24);
                finish();
                break;
            case R.id.button_white:
                color = String.valueOf(11);
                Intent intent25 = new Intent();
                intent25.putExtra("CATE",color);
                setResult(RESULT_OK,intent25);
                finish();
                break;

        }
    }
}
