package com.example.lite.event;

import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.lite.config.Constant;
import com.example.lite.model.User;

/**
 * ©2016-2017 kmhealthcloud.All Rights Reserved <p/>
 * Created by: L  <br/>
 * Description:
 */

public class ChangeEvent {

    private User mUser;
    private int mIndex;
    public ChangeEvent(User user) {
        mUser = user;
    }

    public void onChange(View v){
        Button btn = (Button) v;
        Log.e("onChange",btn.getText().toString());
        mUser.other(++mIndex % Constant.IMAGE_NAME.length);
    }
}
