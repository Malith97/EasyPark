package com.synnlabz.easypark;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CountDown extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_count_down);
    }

    public void goToAvailable(View view) {
        Intent intent = new Intent(CountDown.this, Available.class);
        startActivity(intent);
    }

    public void goToAccount(View view) {
        Intent intent = new Intent(CountDown.this, Account.class);
        startActivity(intent);
    }

    public void back(View view) {
        finish();
    }
}
