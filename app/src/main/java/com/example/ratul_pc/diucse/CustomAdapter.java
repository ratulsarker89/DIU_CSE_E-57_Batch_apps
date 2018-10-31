package com.example.ratul_pc.diucse;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    String[] header_Name;
    String[] header_Link;
    int[] icone;
    Context context;

    LayoutInflater inflater;

    CustomAdapter(Context context,String[] header_Name,String[] header_Link,int[] icone){

        this.header_Name= header_Name;
        this.header_Link = header_Link;
        this.icone = icone;
        this.context =context;
    }

    @Override
    public int getCount() {
        return header_Name.length;
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
            convertView = inflater.inflate(R.layout.sample_view,parent,false);
        }

        ImageView imageView =convertView.findViewById(R.id.imageViewId);
        TextView textView =convertView.findViewById(R.id.text_NameId);
        TextView textView1 =convertView.findViewById(R.id.text_LinkId);

        imageView.setImageResource(icone[position]);
        textView.setText(header_Name[position]);
        textView1.setText(header_Link[position]);

        return convertView;
    }
}
