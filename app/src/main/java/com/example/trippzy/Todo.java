package com.example.trippzy;

import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Todo extends AppCompatActivity {
    List<String> toDolist;
    ArrayAdapter<String> arrayAdapter;
    ListView listView;
    EditText editText;
    Button butn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_todo);
        toDolist = new ArrayList<>();
        arrayAdapter = new ArrayAdapter<>(this,R.layout.list_view,toDolist);
        listView = findViewById(R.id.list_v);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView textView = (TextView) view;
                textView.setPaintFlags(textView.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
            }
        });

        editText = findViewById(R.id.tdedtxt);

    }
    public void additemlist (View view)
    {
       toDolist.add(editText.getText().toString());
       arrayAdapter.notifyDataSetChanged();
       editText.setText(" ");
    }
}
