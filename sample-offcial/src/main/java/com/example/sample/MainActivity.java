package com.example.sample;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.sample.databinding.ActivityMainBinding;
import com.example.sample.model.Area;

public class MainActivity extends AppCompatActivity {
    private Area mArea;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        mArea = new Area();
        mArea.setName("中国");
        binding.setArea(mArea);
    }
}
