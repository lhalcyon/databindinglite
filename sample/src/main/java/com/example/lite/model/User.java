package com.example.lite.model;

import android.databinding.ObservableField;

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
}
