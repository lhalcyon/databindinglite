package com.lhalcyon.bindlite.adapter.image;

import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * ©2016-2017 kmhealthcloud.All Rights Reserved <p/>
 * Created by: L  <br/>
 * Description:
 */

public class GlideBitmapLoader implements BitmapLoader {

//    private final BitmapTransformation mTransformation;

    public GlideBitmapLoader() {
//        mTransformation = null;
    }

    /*public GlideBitmapLoader(BitmapTransformation transformation) {
        this.mTransformation = transformation;
    }*/

    @Override
    public void load(String url, ImageView target) {
        Glide
                .with(target.getContext())
                .load(url)
                .into(target);
    }

    /*@Override
    public void load(@Nullable Object model, @NonNull ImageView target, @DrawableRes int placeholder, @DrawableRes int error) {
        Glide
                .with(target.getContext())
                .load(model)
                .placeholder(placeholder)
                .error(error)
                .transform(mTransformation)
                .into(target);
    }*/
}
