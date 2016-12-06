package com.example.lite.ui.image;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

import com.example.lite.R;
import com.example.lite.databinding.ActivityImageViewUsageBinding;
import com.example.lite.ui.adapter.FragmentAdapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ImageViewUsageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityImageViewUsageBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_image_view_usage);

        List<String> tabList = Arrays.asList(getResources().getStringArray(R.array.loaders));
        List<Fragment> fragmentList = new ArrayList<>();
        fragmentList.add(new GlideImageFragment());
        fragmentList.add(new PicassoImageFragment());
        fragmentList.add(new ImageLoaderFragment());
        binding.viewPager.setAdapter(new FragmentAdapter(getSupportFragmentManager(),fragmentList,tabList));
        binding.tabLayout.setupWithViewPager(binding.viewPager);


    }
}
