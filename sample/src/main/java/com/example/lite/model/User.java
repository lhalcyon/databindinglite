package com.example.lite.model;

import android.databinding.ObservableField;

import com.example.lite.config.Constant;
import com.lhalcyon.bindlite.adapter.image.config.BitmapShape;
import com.lhalcyon.bindlite.adapter.image.config.ScaleType;

import java.util.Random;

/**
 * ©2016-2017 kmhealthcloud.All Rights Reserved <p/>
 * Created by: L  <br/>
 * Description:
 */

public class User {


    public ObservableField<String> mName = new ObservableField<>();
    public ObservableField<String> mAvatar = new ObservableField<>();
    public ObservableField<BitmapShape> mShape = new ObservableField<>();
    public ObservableField<ScaleType> mScaleType = new ObservableField<>();

    public User(String name, String avatar) {
        mName.set(name);
        mAvatar.set(avatar);
        mShape.set(BitmapShape.SQUARE);
        mScaleType.set(ScaleType.FitCenter);
    }

    public void setShape(BitmapShape shape) {
        mShape.set(shape);
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
        mShape.set(i % 2 != 0 ? BitmapShape.SQUARE : BitmapShape.CIRCLE);
        mScaleType.set(i % 2 != 0 ? ScaleType.CenterCrop : ScaleType.FitCenter);
        return this;
    }
}
