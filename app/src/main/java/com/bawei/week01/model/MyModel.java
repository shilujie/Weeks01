package com.bawei.week01.model;
/*
 *@auther:史陆杰
 *@Date: 2019/12/2
 *@Time:14:48
 *@Description:${DESCRIPTION}
 **/


import com.bawei.week01.contract.IMyContract;
import com.bawei.week01.model.bean.NewsBean;
import com.bawei.week01.util.NetUtil;
import com.google.gson.Gson;

public class MyModel {
    public void getMyData(final IMyContract.IModelCallback iModelCallback){
        NetUtil.getInstance().getJson("http://blog.zhaoliang5156.cn/api/shop/shop1.json", new NetUtil.MyCallback() {
            @Override
            public void onGetJson(String json) {
                NewsBean newsBean = new Gson().fromJson(json, NewsBean.class);
                iModelCallback.onMySuccess(newsBean);
            }

            @Override
            public void onError(Throwable throwable) {
                iModelCallback.onMyFailure(throwable);
            }
        });
    }
}
