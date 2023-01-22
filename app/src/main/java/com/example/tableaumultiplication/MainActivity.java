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
import android.widget.Toast;

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
        Toast toast;
        toast =Toast.makeText(MainActivity.this,"VEUILLEZ SAISIR UN ENTIER !!",Toast.LENGTH_SHORT);
        btn_reinitialiser = findViewById(R.id.btn_reinitialiser);

        btn_reinitialiser.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View view) {

            try {


                int Number = Integer.parseInt(ET_number.getText().toString());
                String s="";
                for (int i=1;i<=10;i++) {
                    int r= Number*i;
                    s+=String.format(" %d * %d= %d \n",Number,i,r);
                    r=0;

                }
                tv_affichage.setText(s);



            }catch (NumberFormatException e){
                toast.show();
                btn_reinitialiser.callOnClick();


            }

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


        btn_afficher = findViewById(R.id.btn_afficher);
        btn_afficher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ET_number =findViewById(R.id.ET_number);

                tv_affichage =findViewById(R.id.tv_affichage);
                int Nbr = Integer.parseInt(ET_number.getText().toString());
                String s="";
                for (int i=1;i<=10;i++) {
                    int r= Nbr*i;
                    s+=String.format(" %d * %d= %d \n",Nbr,i,r);
                    r=0;

                }
                tv_affichage.setText(s);

            }
        });



        btn_pink = findViewById(R.id.btn_pink);
        btn_yellow = findViewById(R.id.btn_yellow);
        btn_white= findViewById(R.id.btn_white);

        btn_pink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setActivityColor(0x7A5C4444);
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