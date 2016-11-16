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
    /*@BindingAdapter("url")
    public static void load(final ImageView target,String url){
        LoaderUtil.resolveBitmapLoader().load(target,url);
    }*/

    @BindingAdapter(value={"url","placeholder","error"},requireAll = false)
    public static void load(final ImageView target,String url,int placeHolder,int error){
        LoaderUtil.resolveBitmapLoader().load(target,url,placeHolder,error);
    }

   /* @BindingAdapter(value = {"url","placeholder","error"}, requireAll = false)
    public static void setImageUrl(final ImageView target,String url, int placeHolder, int error){
        LoaderUtil.resolveBitmapLoader().load(url,target,placeHolder,error);
    }*/
}
