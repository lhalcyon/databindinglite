package com.lhalcyon.bindlite.adapter.image;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.widget.ImageView;

import com.lhalcyon.bindlite.adapter.image.config.BitmapShape;
import com.lhalcyon.bindlite.adapter.image.config.ScaleType;
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
        ImageLoader.getInstance().displayImage(url,target,);
    }
}
