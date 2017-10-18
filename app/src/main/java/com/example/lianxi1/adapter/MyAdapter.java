package com.example.lianxi1.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lianxi1.Demo;
import com.example.lianxi1.R;
import com.example.lianxi1.YesterdayBean;

import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by 你瞅啥 on 2017/10/12.
 */
public class MyAdapter extends BaseAdapter {
    private List<YesterdayBean> list;
    private Context context;

    public MyAdapter(List<YesterdayBean> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder h;
        if(view==null){
            h=new ViewHolder();
            view= LayoutInflater.from(context).inflate(R.layout.item,null);
            h.content= (TextView) view.findViewById(R.id.content);
            h.name= (TextView) view.findViewById(R.id.name);
            h.img= (ImageView) view.findViewById(R.id.img);
            view.setTag(h);
        }else{
            h= (ViewHolder) view.getTag();
        }
        h.content.setText(list.get(i).getContent());
        h.name.setText(list.get(i).getName());
        h.img.setImageResource(R.mipmap.ic_launcher);
        return view;
    }
    class ViewHolder{
        ImageView img;
        TextView name;
        TextView content;
    }
}
