package com.example.admin.libraryproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONException;
import org.json.JSONObject;

public class signup_page extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup_page);

    }

    public void signup(View view) {

        EditText name = (EditText) findViewById(R.id.lib);

        String name1 = name.getText().toString();

        EditText pass = (EditText) findViewById(R.id.lib2);

        String pass1 = pass.getText().toString();

        EditText confirm_pass = (EditText) findViewById(R.id.lib3);

        String confirm = confirm_pass.getText().toString();

        EditText confirm_mail = (EditText) findViewById(R.id.lib4);

        String id = confirm_mail.getText().toString();

        EditText phone_no = (EditText) findViewById(R.id.lib5);

        String number = phone_no.getText().toString();


        if(name1.equals(""))
        {
            Toast.makeText(signup_page.this,"please enter name",Toast.LENGTH_SHORT).show();
            return;
        }

        if(pass1.equals(""))
        {
            Toast.makeText(signup_page.this,"please enter password",Toast.LENGTH_SHORT).show();
            return;
        }

        if (confirm.equals(""))

        {
            Toast.makeText(signup_page.this,"please enter confirm password",Toast.LENGTH_SHORT).show();
            return;
        }

        if (id.equals(""))

        {
            Toast.makeText(signup_page.this,"please enter E-mail id",Toast.LENGTH_SHORT).show();
            return;
        }

        if (number.equals(""))

        {
            Toast.makeText(signup_page.this, "please enter phone no.", Toast.LENGTH_SHORT).show();
            return;
        }

        if( ! pass1.equals(confirm))
        {
            Toast.makeText(signup_page.this, "password do not match", Toast.LENGTH_SHORT).show();
            return;


        }

        JSONObject obj = new JSONObject();

        try {
            obj.put("n", name1);
            obj.put("p", pass1);
            obj.put("c", confirm);
            obj.put("e", id);
            obj.put("ph", number);

        }
        catch (JSONException e)
        {

            e.printStackTrace();
        }

        System.out.println(obj);

        JsonObjectRequest jobjreq = new JsonObjectRequest("http//192.168.0.45/user.php", obj, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        } );


        jobjreq.setRetryPolicy(new DefaultRetryPolicy(20000 , 3 ,2));

        AppController ap = new AppController(signup_page.this);

        ap.addToRequestQueue(jobjreq);








    }

}





