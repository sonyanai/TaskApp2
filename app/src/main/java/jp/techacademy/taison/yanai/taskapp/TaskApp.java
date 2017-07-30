package jp.techacademy.taison.yanai.taskapp;

import android.app.Application;

import io.realm.Realm;

/**
 * Created by taiso on 2017/07/30.
 */

public class TaskApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);
    }
}