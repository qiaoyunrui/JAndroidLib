package com.juhezi.jandroidlib.imageLoader.impl.picasso;

import android.content.Context;
import android.widget.ImageView;

import com.juhezi.jandroidlib.imageLoader.AImageLoader;
import com.squareup.picasso.Picasso;

/**
 * Created by qiao1 on 2016/11/2.
 */
public class PicassoImgLoader extends AImageLoader{
    private static String TAG = "PicassoImgLoader";

    public PicassoImgLoader(Context context, ImageView imageView, String url) {
        super(context, imageView, url);
    }

    @Override
    public void load() {
        Picasso.with(context)
                .load(url)
                .into(imageView);
    }
}
