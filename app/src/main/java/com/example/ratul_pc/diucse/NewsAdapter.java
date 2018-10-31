package com.example.ratul_pc.diucse;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class NewsAdapter extends BaseAdapter {

    String[] nName;
    String[] nNameLink;
    int[] nPic;
    Context context;

    LayoutInflater inflater;

    NewsAdapter(Context context, String[] nName, String[] nNameLink, int[] nPic){
        this.nName = nName;
        this.nNameLink =nNameLink;
        this.nPic = nPic;
        this.context = context;
    }

    @Override
    public int getCount() {
        return nName.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null){
            inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.news_sample_view,parent,false);
        }

        ImageView imageView = convertView.findViewById(R.id.newsImageViewId);
        TextView textView = convertView.findViewById(R.id.news_Name_TextViewid);
        TextView textView1 = convertView.findViewById(R.id.news_Link_Name_TextViewid);

        imageView.setImageResource(nPic[position]);
        textView.setText(nName[position]);
        textView1.setText(nNameLink[position]);

        return convertView;
    }
}
