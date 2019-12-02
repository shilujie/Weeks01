package com.bawei.week01.view.fragment;
/*
 *@auther:史陆杰
 *@Date: 2019/12/2
 *@Time:14:18
 *@Description:${DESCRIPTION}
 **/


import android.view.View;
import android.widget.Button;

import com.bawei.week01.R;
import com.bawei.week01.base.BaseFragment;
import com.bawei.week01.view.activity.MainActivity;

public class NewsFragment extends BaseFragment {

    private Button button;

    @Override
    protected void initView(View inflate) {
        button = inflate.findViewById(R.id.but);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity activity = (MainActivity) getActivity();
                activity.tiao();
            }
        });

    }

    @Override
    protected int layoutId() {
        return R.layout.fragment_news;
    }

    @Override
    protected void initData() {

    }
}
