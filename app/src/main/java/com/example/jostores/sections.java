package com.example.jostores;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class sections extends AppCompatActivity {
TextView store , user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sections_page);

        /* connect button store with log in and sign up page */

        store=findViewById(R.id.store_section_id);
        store.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            Intent a=new Intent(sections.this,logIn_store.class);
            startActivity(a);
            }
        });

        /* connect button Customer  with log in and sign up and Gust page */

        user=findViewById(R.id.user_section_id);

    }
}