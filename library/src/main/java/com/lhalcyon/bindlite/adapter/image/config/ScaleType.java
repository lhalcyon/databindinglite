package com.lhalcyon.bindlite.adapter.image.config;


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
