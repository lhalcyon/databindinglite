package com.lhalcyon.bindlite.adapter.image.config;


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
