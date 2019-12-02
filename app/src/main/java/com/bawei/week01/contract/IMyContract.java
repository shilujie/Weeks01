package com.bawei.week01.contract;
/*
 *@auther:史陆杰
 *@Date: 2019/12/2
 *@Time:14:49
 *@Description:${DESCRIPTION}
 **/


import com.bawei.week01.model.bean.NewsBean;

public interface IMyContract {

    interface IView{
        void onMySuccess(NewsBean newsBean);
        void onMyFailure(Throwable throwable);
    }

    interface IModelCallback {
        void onMySuccess(NewsBean newsBean);
        void onMyFailure(Throwable throwable);
    }
}
