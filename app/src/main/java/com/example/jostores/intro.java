package com.example.jostores;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class intro extends AppCompatActivity {

    Button getStarted;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intro_page);


        /* connect intro page with section page   */

             getStarted=findViewById(R.id.get_started_id);
          getStarted.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {

                  Intent a = new Intent(intro.this, sections.class);
                  startActivity(a);

              }
          });


    }
}