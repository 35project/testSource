package com.example.c.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import com.example.c.myapplication.model.RowData;
import com.example.c.myapplication.adapter.CasarealRecycleViewAdapter;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rv = (RecyclerView) findViewById(R.id.casarealRecyclerView);
        CasarealRecycleViewAdapter adapter = new CasarealRecycleViewAdapter(this.createDataset());

        LinearLayoutManager llm = new LinearLayoutManager(this);

        rv.setHasFixedSize(true);

        rv.setLayoutManager(llm);

        rv.setAdapter(adapter);
    }

    private List<RowData> createDataset() {

        List<RowData> dataset = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            RowData data = new RowData();
            data.setBody("TodoList No " + i);


            dataset.add(data);
        }
        return dataset;
    }

    public void changeToEditRow(View view){

        LinearLayout layout = (LinearLayout)findViewById(R.id.plain_list);

        layout.removeView(view);


        LinearLayout li = findViewById(R.id.editable_list);


        getLayoutInflater().inflate(R.layout.edit_row, layout);

    }


    public void changeToPlainRow(View view){

        LinearLayout layout = (LinearLayout)findViewById(R.id.editable_list);

        layout.removeView(view);

        getLayoutInflater().inflate(R.layout.edit_row, layout);


    }


}
