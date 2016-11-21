package com.example.lite.ui.image;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.example.lite.R;
import com.example.lite.config.Constant;
import com.example.lite.databinding.FragmentGlideBinding;

/**
 * ©2016-2017 kmhealthcloud.All Rights Reserved <p/>
 * Created by: L  <br/>
 * Description:
 */

public class GlideImageFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentGlideBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_glide, container, false);
        Glide
                .with(this)
                .load(Constant.IMAGE_1)
                .centerCrop()
                .into(binding.iv1);
        Glide
                .with(this)
                .load(Constant.IMAGE_1)
                .fitCenter()
                .into(binding.iv2);
        Glide
                .with(this)
                .load(Constant.IMAGE_1)
                .into(binding.iv3);
        return binding.getRoot();
    }
}
