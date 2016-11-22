package com.lhalcyon.bindlite.adapter.image.config;

/**
 * ©2016-2017 kmhealthcloud.All Rights Reserved <p/>
 * Created by: L  <br/>
 * Description:
 */

public enum BitmapShape {
    SQUARE(0),CIRCLE(1);

    private int value;

    BitmapShape(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

}
