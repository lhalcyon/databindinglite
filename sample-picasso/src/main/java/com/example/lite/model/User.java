package com.example.lite.model;

import android.databinding.ObservableField;
import android.util.Log;

import com.example.lite.config.Constant;

import java.util.Random;

/**
 * ©2016-2017 kmhealthcloud.All Rights Reserved <p/>
 * Created by: L  <br/>
 * Description:
 */

public class User {


    public ObservableField<String> mName = new ObservableField<>();
    public ObservableField<String> mAvatar = new ObservableField<>();

    public User(String name, String avatar) {
        mName.set(name);
        mAvatar.set(avatar);
    }


    public User random() {
        int i = new Random().nextInt(2);
        mName.set(Constant.IMAGE_NAME[i]);
        mAvatar.set(Constant.IMAGE_RES[i]);
        return this;
    }

    public User other(int i) {
        mName.set(Constant.IMAGE_NAME[i]);
        mAvatar.set(Constant.IMAGE_RES[i]);
        Log.e("after change",toString());
        return this;
    }

    @Override
    public String toString() {
        return mName.get();
    }
}
