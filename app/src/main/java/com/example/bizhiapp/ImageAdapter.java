package com.example.bizhiapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by sl on 2018/3/9.
 */

public class ImageAdapter extends RecyclerView.Adapter<ImageAdapter.ViewHolder> {
    private Context mContext;
    private List<HtmlInfo> mList;

    public ImageAdapter(Context context, List<HtmlInfo> list){
        this.mContext = context;
        this.mList = list;
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView Image;
        private TextView Title;
        private RelativeLayout mLayout;

        public ViewHolder(View itemView) {
            super(itemView);
            Image = (ImageView) itemView.findViewById(R.id.image_item);
            Title = (TextView) itemView.findViewById(R.id.title);
            mLayout = (RelativeLayout) itemView;
        }
    }

    @Override
    public ImageAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.layout_item,parent,false);
        final ImageAdapter.ViewHolder holder = new ImageAdapter.ViewHolder(view);
        holder.mLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int postion = holder.getAdapterPosition();
                Intent intent = new Intent(mContext,ImageActivity.class);
                intent.putExtra("Url",mList.get(postion).getUrl());
                mContext.startActivity(intent);
            }
        });

        return holder;
    }

    @Override
    public void onBindViewHolder(ImageAdapter.ViewHolder holder, int position) {
        Glide.with(mContext).load(mList.get(position).getImage()).placeholder(R.mipmap.load4).into(holder.Image);
        holder.Title.setText(mList.get(position).getTitle());
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }
}
