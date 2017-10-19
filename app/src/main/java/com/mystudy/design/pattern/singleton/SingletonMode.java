package com.mystudy.design.pattern.singleton;

/**
 * Created by Administrator on 2017/7/18 0018.
 */

public class SingletonMode {

    //懒汉
    private static Singleton singletonOne;

    //恶汉
    private static Singleton singletonTwo = new Singleton();


    //懒汉模式
    public static Singleton getInstanceOne() {

        if (singletonOne == null) {
            //锁住以防多线程同时创建单例对象
            synchronized (Singleton.class) {
                if (singletonOne == null) {
                    singletonOne = new Singleton();
                }
            }
        }
        return singletonOne;
    }

    //恶汉模式
    public static Singleton getSingletonTwo() {
        return singletonTwo;
    }

}
