package com.juhezi.jandroidlib.image.impl.glide;

import android.text.TextUtils;
import android.widget.ImageView;

import com.juhezi.jandroidlib.image.ABuilder;
import com.juhezi.jandroidlib.image.AImageLoader;

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
    public GlideImgLoader build() {
        glideImgLoader = new GlideImgLoader(imageView, url);
        return glideImgLoader;
    }
}
