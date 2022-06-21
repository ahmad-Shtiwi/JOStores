package com.example.jostores;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class logInCustomers extends AppCompatActivity {
Button login,guest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.log_in_customers);
   guest=findViewById(R.id.guest_button_id);

   guest.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View view) {
           Intent  a=new Intent(logInCustomers.this,product.class);
           startActivity(a);

       }
   });

    }
}