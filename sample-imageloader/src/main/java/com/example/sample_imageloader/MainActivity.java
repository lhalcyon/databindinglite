package com.example.sample_imageloader;

import android.databinding.DataBindingUtil;
import android.graphics.Bitmap.Config;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.sample_imageloader.config.Constant;
import com.example.sample_imageloader.databinding.ActivityMainBinding;
import com.example.sample_imageloader.event.ChangeEvent;
import com.example.sample_imageloader.model.Picture;
import com.nostra13.universalimageloader.cache.disc.naming.Md5FileNameGenerator;
import com.nostra13.universalimageloader.cache.memory.impl.UsingFreqLimitedMemoryCache;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.DisplayImageOptions.Builder;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.nostra13.universalimageloader.core.assist.QueueProcessingType;
import com.nostra13.universalimageloader.core.display.CircleBitmapDisplayer;
import com.nostra13.universalimageloader.core.download.BaseImageDownloader;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initImageLoader();
        ActivityMainBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        Picture picture = new Picture("pic", Constant.IMAGE_1);
        ChangeEvent event = new ChangeEvent(picture);

        binding.setPicture(picture);
        binding.setEvent(event);

        //ImageLoader manipulate load centerCrop
        DisplayImageOptions options1 = new Builder()
                .showImageForEmptyUri(R.mipmap.ic_launcher)
                .showImageOnFail(R.mipmap.error)
                .cacheInMemory(true)
                .cacheOnDisk(true)
                .bitmapConfig(Config.RGB_565)
                .build();
        ImageLoader.getInstance().displayImage(Constant.IMAGE_1, binding.iv1,options1);

        //ImageLoader manipulate load centerCrop/circle
        DisplayImageOptions options2 = new Builder()
                .showImageForEmptyUri(R.mipmap.ic_launcher)
                .showImageOnFail(R.mipmap.error)
                .cacheInMemory(true)
                .cacheOnDisk(true)
                .bitmapConfig(Config.RGB_565)
                .displayer(new CircleBitmapDisplayer())
                .build();
        ImageLoader.getInstance().displayImage(Constant.IMAGE_1, binding.iv2,options2);



        //ImageLoader manipulate load fitCenter
        DisplayImageOptions options3 = new Builder()
                .showImageForEmptyUri(R.mipmap.ic_launcher)
                .showImageOnFail(R.mipmap.error)
                .cacheInMemory(true)
                .cacheOnDisk(true)
                .bitmapConfig(Config.RGB_565)
                .build();
        ImageLoader.getInstance().displayImage(Constant.IMAGE_1, binding.iv3,options3);


        //ImageLoader manipulate load fitCenter/circle
        DisplayImageOptions options4 = new Builder()
                .showImageForEmptyUri(R.mipmap.ic_launcher)
                .showImageOnFail(R.mipmap.error)
                .cacheInMemory(true)
                .cacheOnDisk(true)
                .bitmapConfig(Config.RGB_565)
                .displayer(new CircleBitmapDisplayer())
                .build();
        ImageLoader.getInstance().displayImage(Constant.IMAGE_1, binding.iv4,options4);


        //ImageLoader manipulate load default
        DisplayImageOptions options5 = new Builder()
                .showImageForEmptyUri(R.mipmap.ic_launcher)
                .showImageOnFail(R.mipmap.error)
                .cacheInMemory(true)
                .cacheOnDisk(true)
                .bitmapConfig(Config.RGB_565)
                .build();
        ImageLoader.getInstance().displayImage(Constant.IMAGE_1, binding.iv5,options5);


        //ImageLoader manipulate load default/circle
        DisplayImageOptions options6 = new Builder()
                .showImageForEmptyUri(R.mipmap.ic_launcher)
                .showImageOnFail(R.mipmap.error)
                .cacheInMemory(true)
                .cacheOnDisk(true)
                .bitmapConfig(Config.RGB_565)
                .displayer(new CircleBitmapDisplayer())
                .build();
        ImageLoader.getInstance().displayImage(Constant.IMAGE_1, binding.iv6,options6);

    }

    private void initImageLoader() {
        ImageLoaderConfiguration config = new ImageLoaderConfiguration
                .Builder(getApplicationContext())
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
                .imageDownloader(new BaseImageDownloader(getApplicationContext(), 5 * 1000, 30 * 1000)) // connectTimeout (5 s), readTimeout (30 s)超时时间
                .writeDebugLogs() // Remove for release app
                .build();//开始构建

        ImageLoader.getInstance().init(config);
    }
}
