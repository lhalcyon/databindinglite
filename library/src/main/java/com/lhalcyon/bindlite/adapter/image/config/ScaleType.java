package com.lhalcyon.bindlite.adapter.image.config;

/**
 * ©2016-2017 kmhealthcloud.All Rights Reserved <p/>
 * Created by: L  <br/>
 * Description:
 */

public enum ScaleType {
    FitCenter(0),CenterCrop(1);

    private int value;

    ScaleType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

}
