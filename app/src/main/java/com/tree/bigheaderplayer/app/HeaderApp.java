package com.tree.bigheaderplayer.app;

/*
 *  @项目名：  BigHeaderPlayer 
 *  @包名：    com.tree.bigheaderplayer.app
 *  @文件名:   HeaderApp
 *  @创建者:   Administrator
 *  @创建时间:  2018/4/17 14:07
 *  @描述：    TODO
 */

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.Logger;
import com.orhanobut.logger.PrettyFormatStrategy;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.DefaultRefreshFooterCreator;
import com.scwang.smartrefresh.layout.api.DefaultRefreshHeaderCreator;
import com.scwang.smartrefresh.layout.api.RefreshFooter;
import com.scwang.smartrefresh.layout.api.RefreshHeader;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.footer.ClassicsFooter;
import com.scwang.smartrefresh.layout.header.ClassicsHeader;
import com.tree.bigheaderplayer.R;

public class HeaderApp
        extends Application
{

    private static HeaderApp headerApp;

    //static 代码段可以防止内存泄露
    static {
        //设置全局的Header构建器
        SmartRefreshLayout.setDefaultRefreshHeaderCreator(new DefaultRefreshHeaderCreator() {
            @Override
            public RefreshHeader createRefreshHeader(Context context, RefreshLayout layout) {
                layout.setPrimaryColorsId(R.color.colorPrimary, android.R.color.white);//全局设置主题颜色
                return new ClassicsHeader(context);//.setTimeFormat(new DynamicTimeFormat("更新于 %s"));//指定为经典Header，默认是 贝塞尔雷达Header
            }
        });
        //设置全局的Footer构建器
        SmartRefreshLayout.setDefaultRefreshFooterCreator(new DefaultRefreshFooterCreator() {
            @Override
            public RefreshFooter createRefreshFooter(Context context, RefreshLayout layout) {
                //指定为经典Footer，默认是 BallPulseFooter
                return new ClassicsFooter(context).setDrawableSize(20);
            }
        });
    }

    public static HeaderApp getInstance() {
        if (headerApp == null) { headerApp = new HeaderApp(); }
        return headerApp;
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }


    @Override
    public void onCreate() {
        super.onCreate();

        initLogger();
    }

    private void initLogger() {

        Logger.addLogAdapter(new AndroidLogAdapter(PrettyFormatStrategy.newBuilder()
                                                                       .tag(getString(R.string.app_name))
                                                                       .build()));
        //
        //把log存到本地
        //        Logger.addLogAdapter(new DiskLogAdapter(TxtFormatStrategy.newBuilder()
        //                                                                 .tag(getString(R.string.app_name))
        //                                                                 .build(getPackageName(),
        //                                                                        getString(R.string.app_name))));
    }
}

