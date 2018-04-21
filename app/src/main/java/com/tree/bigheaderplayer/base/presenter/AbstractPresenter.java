package com.tree.bigheaderplayer.base.presenter;

/*
 *  @项目名：  BigHeaderPlayer 
 *  @包名：    com.tree.bigheaderplayer.base.presenter
 *  @文件名:   AbstractPresenter
 *  @创建者:   Administrator
 *  @创建时间:  2018/4/21 15:50
 *  @描述：    mvp模式 presenter基类
 */

import com.tree.bigheaderplayer.base.view.BaseView;

public interface AbstractPresenter<T extends BaseView> {
    /**
     * 注入View
     *
     * @param view view
     */
    void attachView(T view);

    /**
     * 回收View
     */
    void detachView();
}
