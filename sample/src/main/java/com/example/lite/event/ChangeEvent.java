package com.example.lite.event;

import android.util.Log;
import android.view.View;

import com.example.lite.model.User;

/**
 * ©2016-2017 kmhealthcloud.All Rights Reserved <p/>
 * Created by: L  <br/>
 * Description:
 */

public class ChangeEvent {

    private User mUser;
    private int index = 0;
    public ChangeEvent(User user) {
        mUser = user;
    }

    public void onChange(View v){
        Log.e("button","clicked");
    }
}
