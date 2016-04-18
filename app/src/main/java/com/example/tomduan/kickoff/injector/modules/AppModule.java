package com.example.tomduan.kickoff.injector.modules;

import com.example.tomduan.kickoff.BaseApplication;
import com.example.tomduan.kickoff.model.LocalData;
import com.example.tomduan.kickoff.model.Repository;
import com.example.tomduan.kickoff.model.rest.RestLocalData;
import com.example.tomduan.kickoff.model.rest.RestRepository;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by tomduan on 16-3-10.
 */
@Module
public class AppModule {

    private final BaseApplication mApplication;

    public AppModule(BaseApplication mApplication) {
        this.mApplication = mApplication;
    }

    @Provides
    @Singleton
    BaseApplication provideApplicationContext(){
        return mApplication;
    }

    @Provides
    @Singleton
    Repository provideRepository(RestRepository repository){
        return repository;
    }

    @Provides
    @Singleton
    LocalData provideLocalData(RestLocalData localData){
        return localData;
    }
}
