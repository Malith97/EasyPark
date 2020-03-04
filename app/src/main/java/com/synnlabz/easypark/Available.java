package com.synnlabz.easypark;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Available extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_available);
    }

    public void goToAccount(View view) {
        Intent intent = new Intent(Available.this, Account.class);
        startActivity(intent);
    }

    public void goToDashboard(View view) {
        Intent intent = new Intent(Available.this, Dashboard.class);
        startActivity(intent);
    }

    public void goToLocation(View view) {
        Intent intent = new Intent(Available.this, CountDown.class);
        startActivity(intent);
    }
}
