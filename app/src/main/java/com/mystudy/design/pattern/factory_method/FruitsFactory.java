package com.mystudy.design.pattern.factory_method;

/**
 * Created by Administrator on 2017/7/18 0018.
 */


//静态工厂，直接调用
public class FruitsFactory {

    public static Fruits createApple() {
        return new FruitApple();
    }

    public static Fruits createBanana() {
        return new FruitBanana();
    }
}
