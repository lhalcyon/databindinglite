package com.example.sample;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.sample.databinding.ActivitySimpleUsageBinding;
import com.example.sample.model.Area;

public class SimpleUsageActivity extends AppCompatActivity {
    private Area mArea;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivitySimpleUsageBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_simple_usage);
        mArea = new Area();
        mArea.setName("Northrend");
        binding.setArea(mArea);

    }
}
