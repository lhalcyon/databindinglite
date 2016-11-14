package com.lhalcyon.bindlite.adapter.image;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.lhalcyon.bindlite.utils.LoaderUtil;

/**
 * ©2016-2017 kmhealthcloud.All Rights Reserved <p/>
 * Created by: L  <br/>
 * Description:
 */

public class ViewBindingAdapter {

    @BindingAdapter(value = {"uri","placeholder","error","memory","diskCache"}, requireAll = false)
    public static void setImageUri(Object model,final ImageView target,int placeHolder,int error){
        LoaderUtil.resolveBitmapLoader().load(model,target,placeHolder,error);
    }
}
