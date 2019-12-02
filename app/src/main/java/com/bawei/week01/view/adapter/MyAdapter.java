package com.bawei.week01.view.adapter;
/*
 *@auther:史陆杰
 *@Date: 2019/12/2
 *@Time:14:15
 *@Description:${DESCRIPTION}
 **/


import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bawei.week01.R;
import com.bawei.week01.model.bean.NewsBean;
import com.bawei.week01.util.NetUtil;

import java.util.List;

public class MyAdapter extends BaseAdapter {
    private List<NewsBean.DataBean> data;

    public MyAdapter(List<NewsBean.DataBean> data) {

        this.data = data;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHoulder houlder;
        if (view == null){
            view = View.inflate(viewGroup.getContext(), R.layout.item_layout,null);
            houlder = new ViewHoulder();
            houlder.images = view.findViewById(R.id.images);
            houlder.name = view.findViewById(R.id.name);
            view.setTag(houlder);
        }else {
            houlder = (ViewHoulder) view.getTag();
        }
        houlder.name.setText(data.get(i).getGoods_name());
        NetUtil.getInstance().getPhoto(data.get(i).getGoods_thumb(),houlder.images);
        return view;
    }
    class ViewHoulder{
        ImageView images;
        TextView name;
    }
}
