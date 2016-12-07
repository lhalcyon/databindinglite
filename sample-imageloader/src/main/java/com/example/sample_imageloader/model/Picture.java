package com.example.sample_imageloader.model;

import android.databinding.ObservableField;
import android.util.Log;

import com.example.sample_imageloader.config.Constant;


/**
 * Created by lh_ha on 2016/12/7.
 */

public class Picture {

    public ObservableField<String> mName = new ObservableField<>();
    public ObservableField<String> mUrl = new ObservableField<>();

    public Picture(String name, String url) {
        mName.set(name);
        mUrl.set(url);
    }

    public Picture other(int i) {
        mName.set(Constant.IMAGE_NAME[i]);
        mUrl.set(Constant.IMAGE_RES[i]);
        Log.e("after change",toString());
        return this;
    }

    @Override
    public String toString() {
        return mName.get();
    }
}
