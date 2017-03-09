package com.example.vietanh.contact_lv.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.vietanh.contact_lv.R;
import com.example.vietanh.contact_lv.model.PhoneNumber;

import java.util.ArrayList;

/**
 * Created by Lenovo G480-16 on 2/27/2017.
 */

public class CustomAdapter extends ArrayAdapter<PhoneNumber> {
     private Context context;
     private int resource;
     private ArrayList<PhoneNumber>  arrPhone;
    public CustomAdapter(Context context, int resource, ArrayList<PhoneNumber> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.arrPhone = objects;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if(convertView == null)
        {
            convertView = LayoutInflater.from(context).inflate(R.layout.row_contact,parent,false);
            holder = new ViewHolder();
            holder.tv_name = (TextView) convertView.findViewById(R.id.tv_name);
            holder.tv_number = (TextView) convertView.findViewById(R.id.tv_number);
            holder.tv_color = (TextView) convertView.findViewById(R.id.tv_color);

            convertView.setTag(holder);
        }
        else
        {
             holder = (ViewHolder) convertView.getTag();
        }

        PhoneNumber pn = arrPhone.get(position);

        holder.tv_name.setText(pn.getmName());
        holder.tv_number.setText(pn.getmNumber());
        holder.tv_color.setBackgroundColor(pn.getmColor());
        holder.tv_color.setText((position+1) + "");
        return convertView;
    }

    public class ViewHolder {
        private TextView tv_name;
        private TextView tv_number;
        private TextView tv_color;
    }
}
