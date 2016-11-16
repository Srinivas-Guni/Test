package app.webelement.com.employeetracker.rd;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import app.webelement.com.employeetracker.R;
import app.webelement.com.employeetracker.model.Row;

/**
 * Created by ADMIN on 11/16/16.
 */
public class TestListAdapter extends BaseAdapter {
    private final Context context;
    private final ArrayList<Row> rowList;

    public TestListAdapter(Context context, ArrayList<Row> rowlist) {
        this.context = context;
        this.rowList = rowlist;
    }

    @Override
    public int getCount() {
        return rowList.size();
    }

    @Override
    public Row getItem(int position) {
        return rowList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);


        convertView = inflater.inflate(R.layout.item_main, null);

        TextView txtView = (TextView) convertView.findViewById(R.id.text);
        txtView.setText(rowList.get(position).getName());


        return convertView;
    }
}
