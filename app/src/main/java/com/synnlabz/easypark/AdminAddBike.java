package com.synnlabz.easypark;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class AdminAddBike extends AppCompatActivity {

    private Button mAdd;
    private EditText mName, mPrice , mExtra;

    private String bikeID, bikeName, bikePrice, bikeExtra ;

    private FirebaseAuth mAuth;
    private DatabaseReference mBikeDatabase;

    private Uri resultUri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_add_bike);

        mAdd = (Button) findViewById(R.id.addBicycle);

        mName = (EditText) findViewById(R.id.bikeName);
        mPrice = (EditText) findViewById(R.id.price);
        mExtra = (EditText) findViewById(R.id.extra);

        mBikeDatabase = FirebaseDatabase.getInstance().getReference().child("Bikes");

        mAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                saveBikeInformation();
            }
        });
    }

    private void saveBikeInformation() {
        bikeName = mName.getText().toString();
        bikePrice = mPrice.getText().toString();
        bikeExtra = mExtra.getText().toString();

        DatabaseReference newMessageDb = mBikeDatabase.push();

        final Map bikeInfo = new HashMap();

        bikeInfo.put("Name", bikeName);
        bikeInfo.put("Price", bikePrice);
        bikeInfo.put("Extra", bikeExtra);

        newMessageDb.setValue(bikeInfo);
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
