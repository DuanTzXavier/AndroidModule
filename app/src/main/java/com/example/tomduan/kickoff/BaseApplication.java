package com.example.tomduan.kickoff;

import android.app.Application;

import com.example.tomduan.kickoff.injector.components.AppComponent;
import com.example.tomduan.kickoff.injector.modules.AppModule;

/**
 * Created by tomduan on 16-2-22.
 */
public class BaseApplication extends Application {

    private AppComponent mAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        initializeInjector();
    }

    private void initializeInjector() {
//        mAppComponent = DaggerAppComponent.builder()
//                .appModule(new AppModule(this))
//                .build();
    }
    //hello


    public AppComponent getmAppComponent() {
        return mAppComponent;
    }
}
