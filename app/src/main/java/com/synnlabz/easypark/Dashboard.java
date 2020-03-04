package com.synnlabz.easypark;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
    }

    public void goToAvailable(View view) {
        Intent intent = new Intent(Dashboard.this, Available.class);
        startActivity(intent);
    }

    public void goToGallery(View view) {
        Intent intent = new Intent(Dashboard.this, Gallery.class);
        startActivity(intent);
    }

    public void goToLogin(View view) {
        Intent intent = new Intent(Dashboard.this, Login.class);
        startActivity(intent);
    }
}
