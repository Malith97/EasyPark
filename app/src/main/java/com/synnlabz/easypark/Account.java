package com.synnlabz.easypark;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Account extends AppCompatActivity {

    private FirebaseAuth mAuth;
    private DatabaseReference mUserDatabase;

    private String userId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);

        mAuth = FirebaseAuth.getInstance();
        userId = mAuth.getCurrentUser().getUid();

        mUserDatabase = FirebaseDatabase.getInstance().getReference().child("Users").child(userId);
    }

    public void logoutUser(View view) {
        mAuth.signOut();
        Intent intent = new Intent(Account.this, Dashboard.class);
        startActivity(intent);
        finish();
        return;
    }

    public void goToAvailable(View view) {
        Intent intent = new Intent(Account.this, Available.class);
        startActivity(intent);
    }

    public void goToHome(View view) {
        Intent intent = new Intent(Account.this, CountDown.class);
        startActivity(intent);
    }

}
