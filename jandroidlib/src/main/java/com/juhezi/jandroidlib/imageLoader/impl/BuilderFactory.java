package com.juhezi.jandroidlib.imageLoader.impl;

import com.juhezi.jandroidlib.imageLoader.ABuilder;
import com.juhezi.jandroidlib.imageLoader.impl.glide.GlideBullider;

/**
 * Created by qiao1 on 2016/10/31.
 */
public class BuilderFactory {
    
    private static String TAG = "BuilderFactory";

    private final static Class defaultClass = GlideBullider.class;

    public static <T extends ABuilder> T createBuilder(Class<T> clazz) {
        ABuilder builder = null;
        try {
            builder = (ABuilder) Class.forName(clazz.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) builder;
    }

    /**
     * 创建默认地Bulider
     *
     * @return
     */
    public static ABuilder createDefaultBulider() {
        return createBuilder(defaultClass);
    }
}
