package com.example.trippzy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    Button btnLog;
    LoginDataBaseAdapter loginDataBaseAdapter;
    EditText eduname, edpass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().setTitle("Login");
        loginDataBaseAdapter=new LoginDataBaseAdapter(this);
        loginDataBaseAdapter=loginDataBaseAdapter.open();
        eduname =(EditText) findViewById(R.id.eduname);
        edpass = (EditText) findViewById(R.id.edpass);
        btnLog = (Button) findViewById(R.id.log);
        btnLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userName = eduname.getText().toString();
                String password = edpass.getText().toString();
                String storedPassword=loginDataBaseAdapter.getSinlgeEntry(userName);
                if(password.equals(storedPassword))
                {
                    Toast.makeText(Login.this, "Congrats: Login Successfull", Toast.LENGTH_LONG).show();
                    startActivity(new Intent(getApplicationContext(),Home.class));

                }
                else
                {
                    Toast.makeText(Login.this, "Username or Password does not match", Toast.LENGTH_LONG).show();
                }
            }
        });

    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        loginDataBaseAdapter.close();
    }

}
