package com.juhezi.jlib;

import android.os.Bundle;
import android.widget.ImageView;

import com.juhezi.jandroidlib.activities.JBaseActivity;
import com.juhezi.jandroidlib.imageLoader.impl.BuilderFactory;

public class MainActivity extends JBaseActivity {

    private ImageView mImgShow1;

    private String url = "http://tse1.mm.bing.net/th?id=OIP.Mc734fe5b13c5116748ce0505ae01681bo0&pid=15.1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mImgShow1 = (ImageView) findViewById(R.id.img_show_1);

        BuilderFactory.createDefaultBulider()
                .attachTo(mImgShow1)
                .loadFrom(url)
                .with(this)
                .build()
                .load();

    }

    @Override
    protected void initVariables() {

    }

    @Override
    protected void initViews() {

    }

    @Override
    protected void initData() {

    }
}
