package com.synnlabz.easypark;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class chooseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);
    }

    public void goToRegistration(View view) {
        Intent intent = new Intent(chooseActivity.this, Register.class);
        startActivity(intent);
    }

    public void goToLogin(View view) {
        Intent intent = new Intent(chooseActivity.this, Login.class);
        startActivity(intent);
    }
}
