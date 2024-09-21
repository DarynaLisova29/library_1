package com.example.mylibrary4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.mylibrary.Toaster;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toaster toaster=new Toaster();
        Log.d("MainActivity", "Toast викликано start");
//        Toast.makeText(this, "Hello world", Toast.LENGTH_LONG).show();
        toaster.showMessage("Hello world",this);
    }
}