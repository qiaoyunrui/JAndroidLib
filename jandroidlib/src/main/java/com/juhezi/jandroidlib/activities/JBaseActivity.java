package com.juhezi.jandroidlib.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by qiao1 on 2016/10/25.
 */
public abstract class JBaseActivity extends AppCompatActivity {
    private static String TAG = "JBaseActivity";


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initVariables();

        initViews();

        initData();

    }

    /**
     * 初始化变量
     */
    protected abstract void initVariables();

    /**
     * 加载layout布局文件，初始化控件，为控件添加事件方法
     */
    protected abstract void initViews();

    /**
     * 初始化数据
     */
    protected abstract void initData();

}
