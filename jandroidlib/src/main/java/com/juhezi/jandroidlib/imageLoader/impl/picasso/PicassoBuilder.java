package com.juhezi.jandroidlib.imageLoader.impl.picasso;

import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;

import com.juhezi.jandroidlib.imageLoader.ABuilder;
import com.juhezi.jandroidlib.imageLoader.AImageLoader;

/**
 * Created by qiao1 on 2016/11/2.
 */
public class PicassoBuilder extends ABuilder {
    private static String TAG = "PicassoBuilder";
    private PicassoImgLoader picassoImgLoader;

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
    public <T extends AImageLoader> T build(){
        picassoImgLoader = new PicassoImgLoader(context,imageView,url);
        return (T) picassoImgLoader;
    }
}
