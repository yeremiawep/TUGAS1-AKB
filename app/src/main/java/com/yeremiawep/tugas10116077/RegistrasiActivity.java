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

public class RegistrasiActivity extends AppCompatActivity {

    private Button RegistButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrasi);

        RegistButton = findViewById(R.id.RegistButton);

        RegistButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intentRegist = new Intent(RegistrasiActivity.this, LoginActivity.class);

                startActivity(intentRegist);

            }
        });
    }
}