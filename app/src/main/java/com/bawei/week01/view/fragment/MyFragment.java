package com.bawei.week01.view.fragment;
/*
 *@auther:史陆杰
 *@Date: 2019/12/2
 *@Time:14:18
 *@Description:${DESCRIPTION}
 **/


import android.view.View;
import android.widget.GridView;
import android.widget.Toast;

import com.bawei.week01.R;
import com.bawei.week01.base.BaseFragment;
import com.bawei.week01.contract.IMyContract;
import com.bawei.week01.model.bean.NewsBean;
import com.bawei.week01.presenter.MyPresenter;
import com.bawei.week01.view.adapter.MyAdapter;

public class MyFragment extends BaseFragment implements IMyContract.IView {

    private GridView gv;
    private MyPresenter myPresenter;

    @Override
    protected void initView(View inflate) {
        gv = inflate.findViewById(R.id.gv);
    }

    @Override
    protected int layoutId() {
        return R.layout.fragment_my;
    }

    @Override
    protected void initData() {
        myPresenter = new MyPresenter();
        myPresenter.getMyData(this);
    }

    @Override
    public void onMySuccess(NewsBean newsBean) {
        gv.setAdapter(new MyAdapter(newsBean.getData()));
        Toast.makeText(getActivity(), "成功", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onMyFailure(Throwable throwable) {
        Toast.makeText(getActivity(), throwable.toString(), Toast.LENGTH_SHORT).show();
    }
}
