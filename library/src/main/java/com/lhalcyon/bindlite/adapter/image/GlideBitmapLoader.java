package com.lhalcyon.bindlite.adapter.image;

import android.widget.ImageView;

import com.bumptech.glide.DrawableRequestBuilder;
import com.bumptech.glide.Glide;
import com.lhalcyon.bindlite.adapter.image.config.BitmapShape;
import com.lhalcyon.bindlite.adapter.image.config.ScaleType;
import com.lhalcyon.bindlite.adapter.image.transform.GlideCircleTransform;

/**
 * ©2016-2017 kmhealthcloud.All Rights Reserved <p/>
 * Created by: L  <br/>
 * Description:
 */

public class GlideBitmapLoader implements BitmapLoader {


    public GlideBitmapLoader() {
    }

    @Override
    public void load(ImageView target, String url, int placeHolder, int error, BitmapShape shape, ScaleType scaleType) {
        DrawableRequestBuilder<String> builder = Glide
                .with(target.getContext())
                .load(url)
                .placeholder(placeHolder)
                .error(error);
        if(ScaleType.CenterCrop == scaleType){
            builder = builder.centerCrop();
        }
        if(BitmapShape.CIRCLE == shape){
            builder = builder.transform(new GlideCircleTransform(target.getContext()));
        }
        builder.into(target);
    }
}
