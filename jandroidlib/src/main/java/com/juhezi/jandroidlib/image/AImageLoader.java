package com.juhezi.jandroidlib.image;

import android.content.Context;
import android.widget.ImageView;

/**
 * 图片加载抽象类
 * Created by qiao1 on 2016/10/25.
 */
public abstract class AImageLoader {
    private static String TAG = "AImageLoader";

    protected ImageView imageView;
    protected String url;
    protected Context context;

    public AImageLoader(Context context, ImageView imageView, String url) {
        this.context = context;
        this.imageView = imageView;
        this.url = url;
    }

    public ImageView getImageView() {
        return imageView;
    }

    public void setImageView(ImageView imageView) {
        this.imageView = imageView;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    /**
     * 开始加载图片
     */
    public abstract void load();

}
