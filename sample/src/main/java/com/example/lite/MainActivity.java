package com.example.lite;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void imageViewUsage(View v){
        navigate(ImageViewUsageActivity.class);
    }

    protected void navigate(Class activityClass){
        startActivity(new Intent(this,ImageViewUsageActivity.class));
    }
}
