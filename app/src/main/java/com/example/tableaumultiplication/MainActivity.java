package com.example.tableaumultiplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn_reinitialiser,btn_QUITTER,btn_afficher;
    TextView tv_affichage;
    EditText ET_number;

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


                tv_affichage =findViewById(R.id.tv_affichage);
                StringBuilder r = new StringBuilder();
                for (int i = 0; i <= 10 ; i++) {
                    r.append(String.format("? x %d = ? \n", i));
                }
                tv_affichage.setText(r.toString());
                ET_number =findViewById(R.id.ET_number);
                ET_number.setText("") ;
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

    }
}