package com.example.jostores;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class logIn_store extends AppCompatActivity {
EditText email,password;
Button logIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.log_in_store);

        email=findViewById(R.id.email_id);
        password=findViewById(R.id.password_id);
        logIn=findViewById(R.id.log_in_id);


        logIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String email_s="";
                email_s=email.getText().toString();
                String pass=password.getText().toString();
                if (email_s.equals("ahmadalqdome")&&pass.equals("12345")) {
                    Intent a = new Intent(logIn_store.this, product.class);
                    startActivity(a);
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Wrong Email Or Password",Toast.LENGTH_LONG).show();
                }
            }
        });




    }
}