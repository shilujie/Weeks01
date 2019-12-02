package com.bawei.week01.presenter;
/*
 *@auther:史陆杰
 *@Date: 2019/12/2
 *@Time:15:20
 *@Description:${DESCRIPTION}
 **/


import com.bawei.week01.contract.IMyContract;
import com.bawei.week01.model.MyModel;
import com.bawei.week01.model.bean.NewsBean;

public class MyPresenter {
    private MyModel myModel;
    public void getMyData(final IMyContract.IView iView){
        myModel = new MyModel();
        myModel.getMyData(new IMyContract.IModelCallback() {
            @Override
            public void onMySuccess(NewsBean newsBean) {
                iView.onMySuccess(newsBean);
            }

            @Override
            public void onMyFailure(Throwable throwable) {
                iView.onMyFailure(throwable);
            }
        });
    }
}
