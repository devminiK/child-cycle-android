package com.ccgirls.knu.childcycle.adapter;

/**
 * Created by Eunji on 2016. 11. 7..
 */

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.ccgirls.knu.childcycle.R;
import com.ccgirls.knu.childcycle.item.UserListviewItem;

import java.util.ArrayList;

/**
 * Created by Eunji on 2016. 10. 13..
 */

public class UserListviewAdapter extends BaseAdapter {
    private LayoutInflater inflater;
    private ArrayList<UserListviewItem> data;
    private int layout;
    private ImageView icon;
    private TextView name;
    private ImageButton add;

    public UserListviewAdapter(Context context, int layout, ArrayList<UserListviewItem> data){
        this.inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.data = data;
        this.layout = layout;
    }

    @Override
    public int getCount(){
        return data.size();
    }

    @Override
    public String getItem(int position){
        return data.get(position).getName();
    }


    @Override
    public long getItemId(int position){
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        if ( convertView == null ){
            convertView = inflater.inflate(layout,parent,false);
        }

        UserListviewItem userlistviewItem = data.get(position);

        icon = (ImageView) convertView.findViewById(R.id.app_user);
        icon.setImageResource(userlistviewItem.getIcon());

        name = (TextView) convertView.findViewById(R.id.user_name);
        name.setText(userlistviewItem.getName());

        add = (ImageButton) convertView.findViewById(R.id.add_user);
        add.setImageResource(userlistviewItem.getAdd());

        return convertView;
    }

}