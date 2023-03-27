package com.rania.quizapp_isic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //step1
    EditText etMail, etPassword;

    Button bLogin;
    TextView tvRegister;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //step2
        etMail = findViewById(R.id.etMail);
        etPassword = findViewById(R.id.etPassword);
        bLogin= findViewById(R.id.bLogin);
        tvRegister = findViewById(R.id.tvRegister);

        //step3
        bLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //step4
                String mail= etMail.getText().toString();
                String pswd= etPassword.getText().toString();

                if(mail.equals("rania@gmail.com") && pswd.equals("123") ){

                    startActivity(new Intent(MainActivity.this, Quiz1.class));

                }else{
                    Toast.makeText(getApplicationContext(),"Login or password incorrect !",Toast.LENGTH_SHORT).show();

                }
            }
        });
        tvRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Step 4: Traitement
                startActivity(new Intent(MainActivity.this, Register.class));
            }
        });

    }
}