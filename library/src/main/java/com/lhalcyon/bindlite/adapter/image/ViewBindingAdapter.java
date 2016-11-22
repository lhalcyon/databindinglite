package com.lhalcyon.bindlite.adapter.image;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.lhalcyon.bindlite.adapter.image.config.BitmapShape;
import com.lhalcyon.bindlite.adapter.image.config.ScaleType;
import com.lhalcyon.bindlite.utils.LoaderUtil;

/**
 * ©2016-2017 kmhealthcloud.All Rights Reserved <p/>
 * Created by: L  <br/>
 * Description:
 */

public class ViewBindingAdapter {

    @BindingAdapter(value = {
            "url",
            "placeholder",
            "error",
            "transform",
            "scaleType"
    }, requireAll = false)
    public static void load(final ImageView target,
                            String url,
                            int placeHolder,
                            int error,
                            BitmapShape transform,
                            ScaleType scaleType) {
        LoaderUtil.resolveBitmapLoader().load(target, url, placeHolder, error, transform, scaleType);
    }

}
