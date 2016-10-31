package com.juhezi.jandroidlib.image.impl.glide;

import android.widget.ImageView;

import com.juhezi.jandroidlib.image.AImageLoader;

/**
 * Created by qiao1 on 2016/10/31.
 */
public class GlideImgLoader extends AImageLoader {
    private static String TAG = "GlideImgLoader";

    public GlideImgLoader(ImageView imageView, String url) {
        super(imageView, url);
    }

    @Override
    public void load() {

    }
}
