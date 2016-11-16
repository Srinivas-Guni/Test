package app.webelement.com.employeetracker.rd;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

import app.webelement.com.employeetracker.R;
import app.webelement.com.employeetracker.model.Row;

/**
 * Created by ADMIN on 11/16/16.
 */
public class ListHiglightExample extends AppCompatActivity {

    private ListView listView;
    private Button btnGet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_list);

        setViews();


    }

    private void setViews() {
        listView = (ListView) findViewById(R.id.list);
        ArrayList<Row> rowlist = new ArrayList<>();
        rowlist.add(new Row("1", "Row1"));
        rowlist.add(new Row("2", "Row2"));
        rowlist.add(new Row("3", "Row3"));
        rowlist.add(new Row("4", "Row4"));


        listView.setAdapter(new TestListAdapter(this, rowlist));

        btnGet = (Button) findViewById(R.id.btnGet);
        btnGet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.d("click", "working");
                Row row = (Row) listView.getAdapter().getItem(listView.getCheckedItemPosition());
                Log.d("row selected :", row.toString());

            }
        });

    }
}
