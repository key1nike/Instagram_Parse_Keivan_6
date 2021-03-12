package com.example.instagram_parse_keivan;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    //Initializes Parse SDK as soon as the application is created
    @Override
    public void onCreate() {
        super.onCreate();


        //Register your parse models
        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("fzxVHzgVnH70KtT1BbHLf6g9h0wkNi50AyfYYtMF")
                .clientKey("HeAGV34oIRKHVVc44JKoTXIjNMRzK8L8Cdtij1Qh")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}

