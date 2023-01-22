package com.example.tableaumultiplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn_reinitialiser,btn_QUITTER,btn_afficher,btn_white,btn_yellow,btn_pink;
    TextView tv_affichage;
    EditText ET_number;
    Activity activity1;

    public void setActivityColor(int color) {
        View view = this.getWindow().getDecorView();
        view.setBackgroundColor(color);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_reinitialiser = findViewById(R.id.btn_reinitialiser);
        btn_reinitialiser.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            tv_affichage =findViewById(R.id.tv_affichage);
            tv_affichage.setText("\\? * 1 = \\?\\n\\? * 2 = \\?\\n\\? * 3 = \\?\\n\\? * 4 = \\?\\n\\? * 5 = \\?\\n\\? * 6 = \\?\\n\\? * 7 = \\?\\n\\? * 8 = \\?\\n\\? * 9 = \\?\\n\\? * 10 = \\?\\n");

            ET_number =findViewById(R.id.ET_number);
            ET_number.setText("") ;
           }
        }
        );
        btn_QUITTER = findViewById(R.id.btn_QUITTER);
        btn_QUITTER.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                System.exit(0);
            }
        });


        btn_pink = findViewById(R.id.btn_pink);
        btn_yellow = findViewById(R.id.btn_yellow);
        btn_white= findViewById(R.id.btn_white);

        btn_pink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setActivityColor(Color.RED);
            }
        });
        btn_yellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setActivityColor(Color.YELLOW);
            }
        });
        btn_white.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setActivityColor(Color.WHITE);
            }
        });

//        .setGravity(Gravity.CENTER);
//    tv_affichage.setGravity(Gravity.CENTER);
    }
}