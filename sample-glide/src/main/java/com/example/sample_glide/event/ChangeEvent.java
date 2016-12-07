package com.example.sample_glide.event;

import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.sample_glide.config.Constant;
import com.example.sample_glide.model.Picture;

/**
 * ©2016-2017 kmhealthcloud.All Rights Reserved <p/>
 * Created by: L  <br/>
 * Description:
 */

public class ChangeEvent {

    private Picture mPicture;
    private int mIndex;
    public ChangeEvent(Picture picture) {
        mPicture = picture;
    }

    public void onChange(View v){
        Button btn = (Button) v;
        Log.e("onChange",btn.getText().toString());
        mPicture.other(++mIndex % Constant.IMAGE_NAME.length);
    }
}
