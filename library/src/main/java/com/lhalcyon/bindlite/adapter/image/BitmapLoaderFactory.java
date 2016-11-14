package com.lhalcyon.bindlite.adapter.image;

/**
 * ©2016-2017 kmhealthcloud.All Rights Reserved <p/>
 * Created by: L  <br/>
 * Description:
 */

public class BitmapLoaderFactory {

    public static BitmapLoader glide() {
        return GlideSingleton.singleton;
    }

    public static BitmapLoader picasso() {
        return null;
    }

    public static BitmapLoader imageLoader() {
        return null;
    }

    private static class GlideSingleton {
        private static final GlideBitmapLoader singleton = new GlideBitmapLoader();
    }
}
