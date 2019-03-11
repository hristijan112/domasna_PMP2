package com.example.domasna_pmp2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnInsert = (Button) findViewById(R.id.button4);
        Button btnDelete = (Button) findViewById(R.id.button5);
        Button btnTranslate = findViewById(R.id.button2);
        final EditText editTxt = (EditText) findViewById(R.id.editText);

        btnInsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, InsertingNewWords.class));
            }
        });

        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, DeleteWords.class));
            }
        });

        final TextView txtView = (TextView) findViewById(R.id.textView);

        btnTranslate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Scanner scanner = new Scanner(getResources().openRawResource(R.raw.text));
                String txtToCompare = editTxt.getText().toString();
                boolean isFound = false;

                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    String[] delovi = line.split("/t");
                    if (delovi[0].equals(txtToCompare)) {
                        txtView.setText(delovi[1]);
                        isFound = true;
                        break;
                    }
                }
                if (isFound == false){
                    txtView.setText("Nema pronajdeni prevodi --- No Translations found");
                }
            }
        });
    }
}
