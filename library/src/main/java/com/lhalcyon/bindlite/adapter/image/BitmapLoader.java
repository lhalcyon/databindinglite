package com.lhalcyon.bindlite.adapter.image;

import android.widget.ImageView;

/**
 * ©2016-2017 kmhealthcloud.All Rights Reserved <p/>
 * Created by: L  <br/>
 * Description:
 */

public interface BitmapLoader {


    /*void load(
            @Nullable Object model,
            @NonNull ImageView target,
            @DrawableRes int placeholder,
            @DrawableRes int error
    );*/

    void load(String url,ImageView target);

}
