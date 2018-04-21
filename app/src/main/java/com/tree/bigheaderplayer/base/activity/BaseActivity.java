package com.tree.bigheaderplayer.base.activity;

/*
 *  @项目名：  BigHeaderPlayer 
 *  @包名：    com.tree.bigheaderplayer.base
 *  @文件名:   BaseActivity
 *  @创建者:   Administrator
 *  @创建时间:  2018/4/21 15:27
 *  @描述：    MVP模式的Base Activity
 */

import com.tree.bigheaderplayer.R;
import com.tree.bigheaderplayer.base.presenter.AbstractPresenter;
import com.tree.bigheaderplayer.base.view.BaseView;
import com.tree.bigheaderplayer.util.CommonUtils;

public abstract class BaseActivity<T extends AbstractPresenter>
        extends AbstractSimpleActivity
        implements BaseView
{

    public T mPresenter;

    @Override
    protected void onViewCreated() {
        super.onViewCreated();
        initInject();
        if (mPresenter==null){
            //内部获取第一个类泛型参数的真实类型  ，反射new出对象
            mPresenter=CommonUtils.getT(this,0);
        }
        if (mPresenter != null) {
            mPresenter.attachView(this);
        }
    }

    @Override
    protected void onDestroy() {
        if (mPresenter != null) {
            mPresenter.detachView();
        }
        super.onDestroy();
    }

    @Override
    public void showErrorMsg(String errorMsg) {
        CommonUtils.showSnackMessage(this, errorMsg);
    }

    @Override
    public void showCollectFail() {
        CommonUtils.showSnackMessage(this, getString(R.string.collect_fail));
    }

    @Override
    public void showCancelCollectFail() {
        CommonUtils.showSnackMessage(this, getString(R.string.cancel_collect_fail));
    }

    @Override
    public void showCollectSuccess() {

    }

    @Override
    public void showCancelCollectSuccess() {

    }

    @Override
    public void showLoginView() {

    }

    @Override
    public void showLogoutView() {

    }

    @Override
    public void showNormal() {

    }

    @Override
    public void showError() {

    }

    @Override
    public void showLoading() {

    }

    @Override
    public void reload() {

    }

    /**
     * 注入当前Activity所需的依赖
     */
    protected abstract void initInject();
}
