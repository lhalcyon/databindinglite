# databindinglite


一款轻量级的 `ImageView` Databinding工具.支持通过 [ImageLoader](https://github.com/nostra13/Android-Universal-Image-Loader),[Picasso](https://github.com/square/picasso) 或 [Glide](https://github.com/bumptech/glide)自动加载图片.具体视其在应用在应用中被使用到了



### 下载

通过 Maven:

```xml
<dependency>
  <groupId>com.lhalcyon</groupId>
  <artifactId>databindinglite</artifactId>
  <version>1.0.1</version>
  <type>pom</type>
</dependency>
```

或 Gradle:

```groovy
compile 'com.lhalcyon:databindinglite:1.0.1'
```



### 使用

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

__不要忘记__ 导入相关的类.  例如:

配置 `scaleType`, 需要

```xml
<import type="com.lhalcyon.bindlite.adapter.image.config.ScaleType"/>
```

配置 `transform`, 需要

```xml
<import type="com.lhalcyon.bindlite.adapter.image.config.BitmapShape"/>
```

__注意__ 一旦 `transform` 被设置为非默认,`scaleType` 将不会有效果. 



可以参考samples了解更多细节:)