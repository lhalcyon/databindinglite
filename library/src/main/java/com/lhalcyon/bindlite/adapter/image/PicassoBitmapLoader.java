package com.lhalcyon.bindlite.adapter.image;

import android.widget.ImageView;

import com.lhalcyon.bindlite.adapter.image.config.BitmapShape;
import com.lhalcyon.bindlite.adapter.image.config.ScaleType;
import com.lhalcyon.bindlite.adapter.image.transform.PicassoCircleTransform;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;

/**
 * Created by Administrator on 2016/11/23.
 */
public class PicassoBitmapLoader implements BitmapLoader {

    @Override
    public void load(ImageView target, String url, int placeHolder, int error, BitmapShape shape, ScaleType scaleType) {
        RequestCreator builder = Picasso
                .with(target.getContext())
                .load(url)
                .placeholder(placeHolder)
                .error(error);
        if (scaleType == ScaleType.CenterCrop) {
            builder = builder
                    .fit()
                    .centerCrop();
        }
        if(shape == BitmapShape.CIRCLE){
            builder = builder.transform(new PicassoCircleTransform());
        }
        builder.into(target);
    }
}
