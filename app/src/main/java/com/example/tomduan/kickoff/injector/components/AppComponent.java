package com.example.tomduan.kickoff.injector.components;

import com.example.tomduan.kickoff.BaseApplication;
import com.example.tomduan.kickoff.injector.modules.AppModule;
import com.example.tomduan.kickoff.model.LocalData;
import com.example.tomduan.kickoff.model.Repository;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by tomduan on 16-3-10.
 */
@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {

    BaseApplication application();
    Repository repository();
    LocalData localdata();
}
