// 06 April 2021
// 10116077
// Yeremia Wahyu
// AKB Ulang

package com.yeremiawep.tugas10116077;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    private Button LoginButton;
    private Button RegButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        LoginButton = findViewById(R.id.LoginButton);
        LoginButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){

            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(intent);

            }

        });


        RegButton = findViewById(R.id.RegButton);
        RegButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intentReg = new Intent(LoginActivity.this, RegistrasiActivity.class);
                startActivity(intentReg);

            }
        });
    }
}

