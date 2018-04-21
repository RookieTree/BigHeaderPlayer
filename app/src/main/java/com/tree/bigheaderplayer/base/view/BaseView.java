package com.tree.bigheaderplayer.base.view;

/*
 *  @项目名：  BigHeaderPlayer 
 *  @包名：    com.tree.bigheaderplayer.base.presenter
 *  @文件名:   BaseView
 *  @创建者:   Administrator
 *  @创建时间:  2018/4/21 15:47
 *  @描述：    mvp view基类
 */

public interface BaseView {
    /**
     * 显示错误信息
     *
     * @param errorMsg error message
     */
    void showErrorMsg(String errorMsg);

    /**
     * 正常显示
     */
    void showNormal();

    /**
     * 显示 error
     */
    void showError();

    /**
     * 显示loading
     */
    void showLoading();

    /**
     * 重新加载数据
     */
    void reload();

    /**
     * 显示登录界面
     */
    void showLoginView();

    /**
     * 显示退出界面
     */
    void showLogoutView();

    /**
     * 显示收藏失败
     */
    void showCollectFail();

    /**
     * 显示取消收藏失败
     */
    void showCancelCollectFail();

    /**
     * 显示收藏成功
     */
    void showCollectSuccess();

    /**
     * 显示取消收藏成功
     */
    void showCancelCollectSuccess();
}

