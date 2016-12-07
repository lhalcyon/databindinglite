package com.example.sample_glide;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.bumptech.glide.Glide;
import com.example.sample_glide.config.Constant;
import com.example.sample_glide.databinding.ActivityMainBinding;
import com.example.sample_glide.event.ChangeEvent;
import com.example.sample_glide.model.Picture;
import com.lhalcyon.bindlite.adapter.image.transform.GlideCircleTransform;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        Picture picture = new Picture("pic", Constant.IMAGE_1);
        ChangeEvent event = new ChangeEvent(picture);

        binding.setPicture(picture);
        binding.setEvent(event);
        //glide manipulate load centerCrop
        Glide
                .with(this)
                .load(Constant.IMAGE_1)
                .centerCrop()
                .into(binding.iv1);
        //glide manipulate load centerCrop&circle
        Glide
                .with(this)
                .load(Constant.IMAGE_1)
                .centerCrop()
                .transform(new GlideCircleTransform(this))
                .into(binding.iv2);
        //glide manipulate load fitCenter
        Glide
                .with(this)
                .load(Constant.IMAGE_1)
                .fitCenter()
                .into(binding.iv3);
        //glide manipulate load fitCenter&circle
        Glide
                .with(this)
                .load(Constant.IMAGE_1)
                .fitCenter()
                .transform(new GlideCircleTransform(this))
                .into(binding.iv4);
        //glide manipulate load default
        Glide
                .with(this)
                .load(Constant.IMAGE_1)
                .into(binding.iv5);
        //glide manipulate load default&circle
        Glide
                .with(this)
                .load(Constant.IMAGE_1)
                .transform(new GlideCircleTransform(this))
                .into(binding.iv6);
    }
}
