package com.example.lite.ui.image;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.graphics.Bitmap.Config;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lite.R;
import com.example.lite.config.Constant;
import com.example.lite.databinding.FragmentImageloaderBinding;
import com.example.lite.event.ChangeEvent;
import com.example.lite.model.User;
import com.nostra13.universalimageloader.cache.disc.naming.Md5FileNameGenerator;
import com.nostra13.universalimageloader.cache.memory.impl.UsingFreqLimitedMemoryCache;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.DisplayImageOptions.Builder;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.nostra13.universalimageloader.core.assist.QueueProcessingType;
import com.nostra13.universalimageloader.core.display.CircleBitmapDisplayer;
import com.nostra13.universalimageloader.core.download.BaseImageDownloader;

/**
 * ©2016-2017 kmhealthcloud.All Rights Reserved <p/>
 * Created by: L  <br/>
 * Description:
 */

public class ImageLoaderFragment extends Fragment {
    Context mContext;
    private User mUser;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mContext = getActivity();
        FragmentImageloaderBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_imageloader, container, false);

        initImageLoader();

        DisplayImageOptions options1 = new Builder()
                .showImageForEmptyUri(R.mipmap.ic_launcher)
                .showImageOnFail(R.mipmap.error)
                .cacheInMemory(true)
                .cacheOnDisk(true)
                .bitmapConfig(Config.RGB_565)
                .build();
        ImageLoader.getInstance().displayImage(Constant.IMAGE_1, binding.iv1,options1);

        DisplayImageOptions options2 = new Builder()
                .showImageForEmptyUri(R.mipmap.ic_launcher)
                .showImageOnFail(R.mipmap.error)
                .cacheInMemory(true)
                .cacheOnDisk(true)
                .bitmapConfig(Config.RGB_565)
                .build();
        ImageLoader.getInstance().displayImage(Constant.IMAGE_1, binding.iv2,options2);

        DisplayImageOptions options3 = new Builder()
                .showImageForEmptyUri(R.mipmap.ic_launcher)
                .showImageOnFail(R.mipmap.error)
                .cacheInMemory(true)
                .cacheOnDisk(true)
                .bitmapConfig(Config.RGB_565)
                .displayer(new CircleBitmapDisplayer())
                .build();
        ImageLoader.getInstance().displayImage(Constant.IMAGE_1, binding.iv3,options3);


        mUser = new User("Arthas", Constant.IMAGE_1);
        ChangeEvent event = new ChangeEvent(mUser);
        binding.setUser(mUser);
        binding.setEvent(event);
        return binding.getRoot();
    }

    private void initImageLoader() {
        ImageLoaderConfiguration config = new ImageLoaderConfiguration
                .Builder(mContext)
                .memoryCacheExtraOptions(480, 800) // max width, max height，即保存的每个缓存文件的最大长宽
                .threadPoolSize(3)//线程池内加载的数量
                .threadPriority(Thread.NORM_PRIORITY - 2)
                .denyCacheImageMultipleSizesInMemory()
                .memoryCache(new UsingFreqLimitedMemoryCache(2 * 1024 * 1024)) // You can pass your own memory cache implementation/你可以通过自己的内存缓存实现
                .memoryCacheSize(2 * 1024 * 1024)
                .discCacheSize(50 * 1024 * 1024)
                .discCacheFileNameGenerator(new Md5FileNameGenerator())//将保存的时候的URI名称用MD5 加密
                .tasksProcessingOrder(QueueProcessingType.LIFO)
                .discCacheFileCount(100) //缓存的文件数量
                .defaultDisplayImageOptions(DisplayImageOptions.createSimple())
                .imageDownloader(new BaseImageDownloader(mContext, 5 * 1000, 30 * 1000)) // connectTimeout (5 s), readTimeout (30 s)超时时间
                .writeDebugLogs() // Remove for release app
                .build();//开始构建

        ImageLoader.getInstance().init(config);
    }
}
