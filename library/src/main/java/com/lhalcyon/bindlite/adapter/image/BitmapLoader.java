package com.lhalcyon.bindlite.adapter.image;

import android.widget.ImageView;

/**
 * ©2016-2017 kmhealthcloud.All Rights Reserved <p/>
 * Created by: L  <br/>
 * Description:
 */

public interface BitmapLoader {

    void load(ImageView target,String url,int placeHolder,int error);
}
