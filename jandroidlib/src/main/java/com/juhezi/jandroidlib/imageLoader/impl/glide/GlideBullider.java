package com.juhezi.jandroidlib.imageLoader.impl.glide;

import android.content.Context;
import android.widget.ImageView;

import com.juhezi.jandroidlib.imageLoader.ABuilder;

/**
 * GlideImgLoader的Bulider
 * <p>
 * Created by qiao1 on 2016/10/31.
 */
public class GlideBullider extends ABuilder {

    private static String TAG = "GlideBullider";

    private GlideImgLoader glideImgLoader;

    @Override
    public ABuilder loadFrom(String url) {
        this.url = url;
        return this;
    }

    @Override
    public ABuilder attachTo(ImageView imageView) {
        this.imageView = imageView;
        return this;
    }

    @Override
    public ABuilder with(Context context) {
        this.context = context;
        return this;
    }

    @Override
    public GlideImgLoader build() {
        glideImgLoader = new GlideImgLoader(context, imageView, url);
        return glideImgLoader;
    }
}
