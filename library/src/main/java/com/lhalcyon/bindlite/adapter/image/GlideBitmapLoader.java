package com.lhalcyon.bindlite.adapter.image;

import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.BitmapTransformation;

/**
 * ©2016-2017 kmhealthcloud.All Rights Reserved <p/>
 * Created by: L  <br/>
 * Description:
 */

public class GlideBitmapLoader implements BitmapLoader {

    private final BitmapTransformation mTransformation;

    public GlideBitmapLoader() {
        mTransformation = null;
    }

    public GlideBitmapLoader(BitmapTransformation transformation) {
        this.mTransformation = transformation;
    }

    @Override
    public void load(@Nullable Object model, @NonNull ImageView target, @DrawableRes int placeholder, @DrawableRes int error) {
        Glide
                .with(target.getContext())
                .load(model)
                .placeholder(placeholder)
                .error(error)
                .transform(mTransformation)
                .into(target);
    }
}
