package com.mystudy.design.pattern.abstract_factory;

/**
 * Created by Administrator on 2017/7/18 0018.
 */

//工厂的抽象类
//通过实现该类，重写抽象方法来扩展不同的工厂
interface FactoryProvider {
    Sports produce();
}
