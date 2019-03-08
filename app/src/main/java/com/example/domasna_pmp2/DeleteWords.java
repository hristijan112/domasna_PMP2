package com.example.domasna_pmp2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DeleteWords extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete_words);

        Button btnTranslate = (Button) findViewById(R.id.button9);
        Button btnInsert = (Button) findViewById(R.id.button10);

        btnTranslate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DeleteWords.this, MainActivity.class));
            }
        });

         btnInsert.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 startActivity(new Intent(DeleteWords.this, InsertingNewWords.class));
             }
         });

    }
}
