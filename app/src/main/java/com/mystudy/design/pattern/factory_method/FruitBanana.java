package com.mystudy.design.pattern.factory_method;

import com.mystudy.LogUtils;

/**
 * Created by Administrator on 2017/7/18 0018.
 */

//产品的实现类
public class FruitBanana implements Fruits {
    @Override
    public void getFruit() {
        LogUtils.e("I'm banana!");
    }
}
