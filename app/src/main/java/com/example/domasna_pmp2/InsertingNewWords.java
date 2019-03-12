package com.example.domasna_pmp2;

import android.content.Intent;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.util.Scanner;



public class InsertingNewWords extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inserting_new_words);

        Button btnTranslate = (Button) findViewById(R.id.button7);
        Button btnDelete = (Button) findViewById(R.id.button8);

        final EditText editMk = findViewById(R.id.editText2);
        final EditText editEng = findViewById(R.id.editText3);

        Button btnInsert = findViewById(R.id.button3);

        btnTranslate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(InsertingNewWords.this, MainActivity.class));
            }
        });

        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(InsertingNewWords.this, DeleteWords.class));
            }
        });

        btnInsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PrintStream output = new PrintStream(openFileOutput("text.txt" ,MODE_PRIVATE));
                String prevod = editMk.getText() + " /t " + editEng.getText();
                output.println(prevod);
                output.close();


            }
        });
    }
}
