package com.juhezi.jandroidlib.image.impl.glide;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.juhezi.jandroidlib.image.AImageLoader;

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
        //最简单的图片加载
        Glide.with(context)
                .load(url)
                .into(imageView);
    }
}
