package com.example.a12abit.sellhometth;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.json.JSONObject;

import java.util.List;

public class customlish extends BaseAdapter {
    Context mContext;
    String[] strName,d;
    int[] resId;
    int i;
    String[] member_arr;
    JSONObject c;

    public customlish(Context context, int i, String[] member_arr) {
        this.mContext= context;
        this.member_arr = member_arr;
        Log.d("gggg","");

    }

    public int getCount() {
        return strName.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater mInflater =
                (LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if(view == null)
            view = mInflater.inflate(R.layout.customlayout, parent, false);

        TextView textView = (TextView)view.findViewById(R.id.textView1);
        textView.setText(member_arr[position]);

        TextView textView2 = (TextView)view.findViewById(R.id.textView2);
        textView.setText(strName[position]);

        ImageView imageView = (ImageView)view.findViewById(R.id.imageView1);
        imageView.setBackgroundResource(resId[position]);

        return view;
    }
}
