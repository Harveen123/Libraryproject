package com.example.admin.libraryproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class book_search extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.book_search);
    }
    public void search(View v)
    {
        Intent i = new Intent(book_search.this, addnew_bookdetails.class);
        startActivity(i);
    }

}
