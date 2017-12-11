package com.example.staffonechristian.demosql;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Register extends AppCompatActivity {

    EditText e_name,e_password,e_contact,e_country;
    Button b_insert;
    String name,password,contact,country;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        e_name = findViewById(R.id.name);
        e_password = findViewById(R.id.password);
        e_contact = findViewById(R.id.contact);
        e_country = findViewById(R.id.country);
        b_insert =findViewById(R.id.insertData);


        b_insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name = e_name.getText().toString().trim();
                password = e_password.getText().toString().trim();
                contact = e_contact.getText().toString().trim();
                country = e_country.getText().toString().trim();

                String method = "register";
                BackgroundTask backgroundTask = new BackgroundTask(getApplicationContext());
                backgroundTask.execute(method,name,password,contact,country);
              //  finish();
            }
        });
    }

}
