package com.example.lite.ui.image;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lite.R;
import com.example.lite.config.Constant;
import com.example.lite.databinding.FragmentPicassoBinding;
import com.example.lite.event.ChangeEvent;
import com.example.lite.model.User;
import com.squareup.picasso.Picasso;

/**
 * ©2016-2017 kmhealthcloud.All Rights Reserved <p/>
 * Created by: L  <br/>
 * Description:
 */

public class PicassoImageFragment extends Fragment {

    Context mContext;
    private User mUser;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mContext = getActivity();
        FragmentPicassoBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_picasso,container,false);
        Picasso
                .with(mContext)
                .load(Constant.IMAGE_1)
                .fit()
                .centerCrop()
                .into(binding.iv1);
        Picasso
                .with(mContext)
                .load(Constant.IMAGE_1)
                .fit()
                .centerInside()
                .into(binding.iv2);
        Picasso
                .with(mContext)
                .load(Constant.IMAGE_1)
                .into(binding.iv3);
        mUser = new User("Arthas",Constant.IMAGE_1);
        ChangeEvent event = new ChangeEvent(mUser);
        binding.setUser(mUser);
        binding.setEvent(event);

        return binding.getRoot();
    }
}
