package com.mystudy.design.pattern.abstract_factory;

import com.mystudy.LogUtils;

/**
 * Created by Administrator on 2017/7/18 0018.
 */

//产品的实现类
public class SportBaseBall implements Sports {
    @Override
    public void getSport() {
        LogUtils.e("I'm baseBall");
    }
}
