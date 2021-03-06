# databindinglite
[中文版](https://github.com/lhalcyon/databindinglite/blob/master/README-CN.md)

A  Databinding tool for `ImageView` .It supports image auto loading  via [ImageLoader](https://github.com/nostra13/Android-Universal-Image-Loader),[Picasso](https://github.com/square/picasso) or [Glide](https://github.com/bumptech/glide),depending on which you use in your app.



### Download

Grab via Maven:

```xml
<dependency>
  <groupId>com.lhalcyon</groupId>
  <artifactId>databindinglite</artifactId>
  <version>1.0.1</version>
  <type>pom</type>
</dependency>
```

or Gradle:

```groovy
compile 'com.lhalcyon:databindinglite:1.0.1'
```



### Usage

```xml
<ImageView
                    android:layout_width="80dp"
                    android:layout_height="80dp"
                    app:error="@{R.mipmap.error}"
                    app:placeholder="@{R.mipmap.ic_launcher}"
                    app:url="@{picture.mUrl}"
                    app:scaleType="@{ScaleType.CenterCrop}"
                    app:transform="@{BitmapShape.CIRCLE}"
                    />
```

__Don't forget__ import related class.  eg:

to config `scaleType`, need 

```xml
<import type="com.lhalcyon.bindlite.adapter.image.config.ScaleType"/>
```

to config `transform`, need

```xml
<import type="com.lhalcyon.bindlite.adapter.image.config.BitmapShape"/>
```

__Note that__ once `transform` is configed,`scaleType` will not work. 



for further details ,you may see samples for help:)