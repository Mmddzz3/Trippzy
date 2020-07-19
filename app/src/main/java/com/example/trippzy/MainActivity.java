package com.example.trippzy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void butn_register(View view) {
        startActivity(new Intent(getApplicationContext(),Register.class));
    }

    public void butn_login(View view) {
        startActivity(new Intent(getApplicationContext(),Login.class));
    }
}
