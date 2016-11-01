package com.juhezi.jlib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.juhezi.jandroidlib.activities.JBaseActivity;
import com.juhezi.jandroidlib.image.ABuilder;
import com.juhezi.jandroidlib.image.AImageLoader;
import com.juhezi.jandroidlib.image.impl.BuilderFactory;
import com.juhezi.jandroidlib.image.impl.glide.GlideBullider;

public class MainActivity extends JBaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BuilderFactory.createDefaultBulider()
                .attachTo(null)
                .loadFrom("Builder")
                .build()
                .load();

        BuilderFactory.createBuilder(GlideBullider.class)
                .attachTo(null)
                .loadFrom("url")
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
