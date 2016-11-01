package com.juhezi.jandroidlib.image;

/**
 * no use now
 * Created by qiao1 on 2016/10/31.
 */
public abstract class AFactory {

    /**
     * 工厂模式创建Builder
     * @param clazz
     * @param <T>
     * @return
     */
    public abstract <T extends ABuilder> T createBuilder(Class<T> clazz);
}
