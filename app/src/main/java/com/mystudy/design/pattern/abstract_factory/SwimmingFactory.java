package com.mystudy.design.pattern.abstract_factory;

/**
 * Created by Administrator on 2017/7/18 0018.
 */

//工厂的扩展实现类
public class SwimmingFactory implements FactoryProvider {
    @Override
    public Sports produce() {
        return new SportSwimming();
    }
}
