package com.juhezi.jandroidlib.imageLoader.impl.glide;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.juhezi.jandroidlib.imageLoader.AImageLoader;

/**
 * Created by qiao1 on 2016/10/31.
 */
public class GlideImgLoader extends AImageLoader {
    private static String TAG = "GlideImgLoader";

    public GlideImgLoader(Context context, ImageView imageView, String url) {
        super(context, imageView, url);
    }

    @Override
    public void load() {
        Glide.with(context)
                .load(url)
                .into(imageView);
    }
}
