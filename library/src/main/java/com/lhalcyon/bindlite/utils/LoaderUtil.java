package com.lhalcyon.bindlite.utils;

import com.lhalcyon.bindlite.adapter.image.BitmapLoader;
import com.lhalcyon.bindlite.adapter.image.BitmapLoaderFactory;

/**
 * ©2016-2017 kmhealthcloud.All Rights Reserved <p/>
 * Created by: L  <br/>
 * Description:
 */

public class LoaderUtil {

    private final static boolean HAS_GLIDE = canHasClass("com.bumptech.glide.Glide");
    private final static boolean HAS_PICASSO = canHasClass("com.squareup.picasso.Picasso");
    private final static boolean HAS_UIL = canHasClass("com.nostra13.universalimageloader.core.ImageLoader");

    public static BitmapLoader resolveBitmapLoader(){
        if (HAS_GLIDE) {
            return BitmapLoaderFactory.glide();
        }
        if (HAS_PICASSO) {
            return BitmapLoaderFactory.picasso();
        }
        if (HAS_UIL) {
            return BitmapLoaderFactory.imageLoader();
        }
        throw new IllegalStateException(" a BitmapLoader must be provided .");
    }

    private static boolean canHasClass(String className) {
        try {
            Class.forName(className);
            return true;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return false;
    }
}
