package com.example.lite;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.example.lite.databinding.ActivityImageViewUsageBinding;
import com.example.lite.event.ChangeEvent;
import com.example.lite.model.User;
import com.squareup.picasso.Picasso;

public class ImageViewUsageActivity extends AppCompatActivity {

    public static final String res[] = new String[]{
            "http://img14.360buyimg.com/cms/s390x130_jfs/t3583/348/1585950854/29159/1e8180c4/582ad14aN76d0aad4.jpg",
            "http://img11.360buyimg.com/cms/s390x130_jfs/t3397/37/1503046916/21781/c9a9592d/582ad0abN628d6acf.jpg",
            null
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityImageViewUsageBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_image_view_usage);
        User user = new User("Arthas", res[2]);
        ChangeEvent event = new ChangeEvent(user);
        binding.setUser(user);
        binding.setEvent(event);
        Glide.with(this).load(res[0]).into(binding.iv1);
        Glide.with(this).load(res[1]).into(binding.iv2);
        Glide.with(this).load(res[2])
                .placeholder(R.mipmap.ic_launcher)
                .error(R.mipmap.error)
                .into(binding.iv3);
        Picasso.with(this)
                .load(res[0])
                .placeholder(R.mipmap.ic_launcher)
                .error(R.mipmap.error)
                .into(binding.iv4);

    }
}
