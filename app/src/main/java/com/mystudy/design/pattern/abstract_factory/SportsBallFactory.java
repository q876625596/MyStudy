package com.mystudy.design.pattern.abstract_factory;

/**
 * Created by Administrator on 2017/7/18 0018.
 */

//可默认写一个工厂，再额外写一个FactoryProvider的工厂接口以作扩展
public class SportsBallFactory {

    public static Sports createFootBall() {
        return new SportFootBall();
    }

    public static Sports createBaseBall() {
        return new SportBaseBall();
    }
}
