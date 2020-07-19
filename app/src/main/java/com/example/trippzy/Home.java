package com.example.trippzy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void butn_notes(View view) {
        startActivity(new Intent(getApplicationContext(),TripNotes.class));
    }

    public void butn_todo(View view) {
        startActivity(new Intent(getApplicationContext(),Todo.class));
    }
}
