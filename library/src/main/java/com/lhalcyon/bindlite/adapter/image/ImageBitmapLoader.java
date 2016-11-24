package com.lhalcyon.bindlite.adapter.image;

import android.graphics.Bitmap.Config;
import android.widget.ImageView;

import com.lhalcyon.bindlite.adapter.image.config.BitmapShape;
import com.lhalcyon.bindlite.adapter.image.config.ScaleType;
import com.lhalcyon.bindlite.adapter.image.transform.CircleDisplayer;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.DisplayImageOptions.Builder;
import com.nostra13.universalimageloader.core.ImageLoader;

/**
 * Created by Administrator on 2016/11/23.
 */

public class ImageBitmapLoader implements BitmapLoader {

    @Override
    public void load(ImageView target, String url, int placeHolder, int error, BitmapShape shape, ScaleType scaleType) {
        Builder builder = new Builder()
                .showImageForEmptyUri(placeHolder)
                .showImageOnFail(error)
                .cacheInMemory(true)
                .cacheOnDisk(true)
                .bitmapConfig(Config.RGB_565);

        //handle scale type
        if(scaleType == ScaleType.CenterCrop){
            target.setScaleType(ImageView.ScaleType.CENTER_CROP);
        }else if (scaleType == ScaleType.FitCenter){
            target.setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
        //handle transform(shape)
        if(shape == BitmapShape.CIRCLE){
            builder = builder.displayer(new CircleDisplayer());
        }
        DisplayImageOptions options = builder.build();
        ImageLoader.getInstance().displayImage(url,target,options);
    }
}
