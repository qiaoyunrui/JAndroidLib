package com.juhezi.jandroidlib.image.impl;

import com.juhezi.jandroidlib.image.ABuilder;
import com.juhezi.jandroidlib.image.AFactory;
import com.juhezi.jandroidlib.image.impl.glide.GlideBullider;

/**
 * Created by qiao1 on 2016/10/31.
 */
public class BuilderFactory extends AFactory {
    private static String TAG = "BuilderFactory";

    private final Class defaultClass = GlideBullider.class;

    @Override
    public <T extends ABuilder> T createBuilder(Class<T> clazz) {
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
    public ABuilder createDefaultBulider() {
        return createBuilder(defaultClass);
    }
}
