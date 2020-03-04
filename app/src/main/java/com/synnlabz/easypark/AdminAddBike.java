package com.synnlabz.easypark;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AdminAddBike extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_add_bike);
    }

    public void goToOrders(View view) {
        Intent intent = new Intent(AdminAddBike.this, AdminOrders.class);
        startActivity(intent);
    }

    public void goToMap(View view) {
        Intent intent = new Intent(AdminAddBike.this, AdminLocation.class);
        startActivity(intent);
    }

    public void goToAccount(View view) {
        Intent intent = new Intent(AdminAddBike.this, Available.class);
        startActivity(intent);
    }

    public void logoutUser(View view) {
    }
}
