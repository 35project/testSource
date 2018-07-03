package com.example.c.myapplication;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
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


        final EditText editText = findViewById(R.id.edit_todo);

        if(editText != null) Toast.makeText(getApplicationContext(), "Test OK!", Toast.LENGTH_SHORT).show();

        /*setContentView(R.layout.edit_row);

        //キーボードを閉じたいEditTextオブジェクト
        final EditText editText = findViewById(R.id.edit_todo);

        //キーボード表示を制御するためのオブジェクト
        final InputMethodManager inputMethodManager =  (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);

        //EditTextにリスナーをセット
        editText.setOnKeyListener(new View.OnKeyListener() {

            //コールバックとしてonKey()メソッドを定義
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                //イベントを取得するタイミングには、ボタンが押されてなおかつエンターキーだったときを指定
                if((event.getAction() == KeyEvent.ACTION_DOWN) && (keyCode == KeyEvent.KEYCODE_ENTER)){
                    //キーボードを閉じる
                    inputMethodManager.hideSoftInputFromWindow(editText.getWindowToken(), InputMethodManager.RESULT_UNCHANGED_SHOWN);

                    return true;
                }

                return false;
            }
        });*/


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


        LinearLayout li = findViewById(R.id.editable_row);


        getLayoutInflater().inflate(R.layout.edit_row, layout);

    }


    public void changeToPlainRow(View view){

        LinearLayout layout = (LinearLayout)findViewById(R.id.editable_row);

        layout.removeView(view);

        getLayoutInflater().inflate(R.layout.edit_row, layout);


    }


}
