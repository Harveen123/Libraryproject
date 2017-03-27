package com.example.admin.libraryproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class login_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_page);

        TextView txt = (TextView) findViewById(R.id.login_btn);

        TextView txt1 = (TextView) findViewById(R.id.register_btn);

        TextView txt2 = (TextView) findViewById(R.id.forgot);

    }

    public void signup(View v)
    {

        Intent i = new Intent(login_page.this , signup_page.class);

        startActivity(i);
    }

    public void login(View v)
    {
        Intent i = new Intent(login_page.this , library2_app.class);

        startActivity(i);
    }



}
