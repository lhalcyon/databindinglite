package com.example.lite;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.lite.config.Constant;
import com.example.lite.databinding.ActivityMainBinding;
import com.example.lite.event.ChangeEvent;
import com.example.lite.model.Picture;
import com.lhalcyon.bindlite.adapter.image.transform.PicassoCircleTransform;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        Picture picture = new Picture("pic", Constant.IMAGE_1);
        ChangeEvent event = new ChangeEvent(picture);

        binding.setPicture(picture);
        binding.setEvent(event);
        //picasso manipulate load centerCrop
        Picasso
                .with(this)
                .load(Constant.IMAGE_1)
                .fit()
                .centerCrop()
                .into(binding.iv1);
        //picasso manipulate load centerCrop&circle
        Picasso
                .with(this)
                .load(Constant.IMAGE_1)
                .fit()
                .centerCrop()
                .transform(new PicassoCircleTransform())
                .into(binding.iv2);
        //picasso manipulate load fitCenter
        Picasso
                .with(this)
                .load(Constant.IMAGE_1)
                .fit()
                .centerInside()
                .into(binding.iv3);
        //picasso manipulate load fitCenter&circle
        Picasso                .with(this)
                .load(Constant.IMAGE_1)
                .fit()
                .centerInside()
                .transform(new PicassoCircleTransform())
                .into(binding.iv4);
        //glide manipulate load default
        Picasso
                .with(this)
                .load(Constant.IMAGE_1)
                .into(binding.iv5);
        //glide manipulate load default&circle
        Picasso
                .with(this)
                .load(Constant.IMAGE_1)
                .transform(new PicassoCircleTransform())
                .into(binding.iv6);
    }

}
