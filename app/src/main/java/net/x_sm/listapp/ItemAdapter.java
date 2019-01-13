package net.x_sm.listapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import net.x_sm.listapp.R;

import static android.content.Context.LAYOUT_INFLATER_SERVICE;

public class ItemAdapter extends BaseAdapter {

    String[] items;
    String[] prices;
    String[] descriptions;

    LayoutInflater mInflator;

    public ItemAdapter(Context c, String[] i, String[] p, String[] d){
        items = i;
        prices = p;
        descriptions = d;
        mInflator = (LayoutInflater)c.getSystemService(LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return items.length;
   }

    @Override
    public Object getItem(int position) {
        return items[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        @SuppressLint("ViewHolder") View v = mInflator.inflate(R.layout.my_listview_detail, null);
        TextView  nameTextView = (TextView)v.findViewById(R.id.nameTextView);
        TextView  descriptionTextView = (TextView)v.findViewById(R.id.descriptionTextView);
        TextView  priceTextView = (TextView)v.findViewById(R.id.priceTextView);

        String name = items[position];
        String desc = descriptions[position];
        String cost = prices[position];

        nameTextView.setText(name);
        descriptionTextView.setText(desc);
        priceTextView.setText(cost);
        return v;
    }
}
