package com.example.admin.libraryproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class book_return extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.book_return);

   TextView txt2 =(TextView) findViewById(R.id.next_text);


    }

    public void textnext()
    {
        Intent i = new Intent(book_return.this , return_page.class);
        startActivity(i);
    }
}
