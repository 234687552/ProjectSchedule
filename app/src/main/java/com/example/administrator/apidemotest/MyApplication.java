package com.example.administrator.apidemotest;

import android.app.Application;
import android.util.Log;

import com.hyphenate.EMCallBack;
import com.hyphenate.chat.EMClient;
import com.hyphenate.chat.EMOptions;


/**
 * Created by Administrator on 2016/7/27 0027.
 */
public class MyApplication extends Application {
    private String userName="user1";
    private String password="1";


    @Override
    public void onCreate() {
        EMOptions options = new EMOptions();
        // 默认添加好友时，是不需要验证的，改成需要验证
        options.setAcceptInvitationAlways(false);
        //初始化
        EMClient.getInstance().init(this, options);
        //false取消自动登录
        options.setAutoLogin(false);
        //在做打包混淆时，关闭debug模式，避免消耗不必要的资源
        EMClient.getInstance().setDebugMode(false);
        super.onCreate();

    }
}
