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
    public void load(ImageView target, String url, int placeHolder, int error, int shape, int scaleType) {
        DrawableRequestBuilder<String> builder = Glide
                .with(target.getContext())
                .load(url)
                .placeholder(placeHolder)
                .error(error);
        if(BitmapShape.CIRCLE.getValue() == shape){
            builder = builder.transform(new GlideCircleTransform(target.getContext()));
        }
        if(ScaleType.CenterCrop.getValue() == scaleType){
            builder = builder.centerCrop();
        }
        builder.into(target);
    }


}
