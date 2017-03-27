package com.example.admin.libraryproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class admin_login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_login);

        TextView btn = (TextView) findViewById(R.id.submit);
    }

    public void submit(View v)
    {
        Intent i = new Intent(admin_login.this, admin_page.class);
        startActivity(i);
    }
}
