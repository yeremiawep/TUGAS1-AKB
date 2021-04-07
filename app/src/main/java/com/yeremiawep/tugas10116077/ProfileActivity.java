// 06 April 2021
// 10116077
// Yeremia Wahyu
// AKB Ulang


package com.yeremiawep.tugas10116077;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ProfileActivity extends AppCompatActivity {

    private Button LogoutButton;
    private Button BackButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        LogoutButton = findViewById(R.id.LogoutButton);
        LogoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intentLogout = new Intent(ProfileActivity.this, LoginActivity.class);
                startActivity(intentLogout);

            }
        });

        BackButton = findViewById(R.id.BackButton);
        BackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intentBack = new Intent(ProfileActivity.this, MainActivity.class);
                startActivity(intentBack);

            }
        });
    }
}