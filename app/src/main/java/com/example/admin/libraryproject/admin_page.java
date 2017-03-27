package com.example.admin.libraryproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class admin_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_page);

        TextView txt = (TextView) findViewById(R.id.add_book);

        TextView txt1 = (TextView) findViewById(R.id.issue_book);

        TextView txt2 = (TextView) findViewById(R.id.return_book);

    }

    public void addbook(View v)
    {
        Intent i = new Intent(admin_page.this, addnew_bookdetails.class);
        startActivity(i);
    }

    public void issue(View v)
    {
        Intent i = new Intent(admin_page.this, book_issue.class);
        startActivity(i);
    }

    public void returnbook(View v)

    {
        Intent i = new Intent(admin_page.this, book_return.class);
        startActivity(i);
    }

}
