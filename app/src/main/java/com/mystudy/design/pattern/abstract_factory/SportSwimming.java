package com.mystudy.design.pattern.abstract_factory;

import com.mystudy.LogUtils;

/**
 * Created by Administrator on 2017/7/18 0018.
 */

public class SportSwimming implements Sports {
    @Override
    public void getSport() {
        LogUtils.e("I'm Swimming!");
    }
}
