package com.juhezi.jandroidlib.image;

import android.widget.ImageView;

/**
 * Created by qiao1 on 2016/10/31.
 * 抽象建造者
 */
public abstract class ABuilder {
    private static String TAG = "ABuilder";

    protected String url;

    protected ImageView imageView;

    public abstract ABuilder loadFrom(String url);

    public abstract ABuilder attachTo(ImageView imageView);

    public abstract <T extends AImageLoader> T build();
}
