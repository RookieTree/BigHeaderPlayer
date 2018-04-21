package com.tree.bigheaderplayer.base.presenter;

/*
 *  @项目名：  BigHeaderPlayer 
 *  @包名：    com.tree.bigheaderplayer.base.presenter
 *  @文件名:   BasePresenter
 *  @创建者:   Administrator
 *  @创建时间:  2018/4/21 15:55
 *  @描述：    管理事件流订阅的生命周期
 */

import com.tree.bigheaderplayer.base.view.BaseView;

public class BasePresenter<T extends BaseView>
        implements AbstractPresenter<T>
{

    private T mView;

    @Override
    public void attachView(T view) {
        mView = view;
    }

    @Override
    public void detachView() {
        mView = null;
    }

    public T getView() {
        return mView;
    }
}
