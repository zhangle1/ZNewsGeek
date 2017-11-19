package zhangle1.com.github.znewsgeek;

import android.app.Activity;
import android.app.Application;
import android.content.Context;

import java.util.Stack;

/**
 * Created by lezi on 2017/11/15.
 */

public class App extends Application {


    private static App mApp;
    public Stack<Activity> store;



    @Override
    public void onCreate() {
        super.onCreate();

        mApp = this;
    }



    public static App getAppContext(){
       return  mApp;
    }


    /**
     * 获取当前的Activity
     *
     * @return
     */
    public Activity getCurActivity() {
        return store.lastElement();
    }
}
