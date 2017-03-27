package com.example.admin.libraryproject;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

public class page_first extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_first);


        TextView txt = (TextView) findViewById(R.id.user_first);

        TextView txt1 = (TextView) findViewById(R.id.admin_first);


    }

    public void userr(View v)

    {
        Intent i = new Intent(page_first.this, login_page.class);
        startActivity(i);
    }


    public void admin(View v)


    {
        Intent i = new Intent(page_first.this, admin_login.class);
        startActivity(i);

    }
}




