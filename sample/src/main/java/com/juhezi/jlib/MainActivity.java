package com.juhezi.jlib;

import android.os.Bundle;
import android.widget.ImageView;

import com.juhezi.jandroidlib.activities.JBaseActivity;
import com.juhezi.jandroidlib.imageLoader.impl.BuilderFactory;
import com.juhezi.jandroidlib.imageLoader.impl.picasso.PicassoBuilder;

public class MainActivity extends JBaseActivity {

    private ImageView mImgShow1;
    private ImageView mImgShow2;

    private String url1 = "https://upload.wikimedia.org/wikipedia/commons/e/ea/Aqua_Spout.jpg";
    private String url2 = "https://upload.wikimedia.org/wikipedia/commons/d/db/Cijin_District_view_from_Mt_QiHou.jpg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mImgShow1 = (ImageView) findViewById(R.id.img_show_1);
        mImgShow2 = (ImageView) findViewById(R.id.img_show_2);

        BuilderFactory.createDefaultBulider()
                .attachTo(mImgShow1)
                .loadFrom(url1)
                .with(this)
                .build()
                .load();

        BuilderFactory.createBuilder(PicassoBuilder.class)
                .attachTo(mImgShow2)
                .loadFrom(url2)
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
