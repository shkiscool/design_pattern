package com.kk.factory.abstractfactory;

import com.kk.factory.ICourse;

/**
 *
 *
 *场景：
 *    1、客户端（应用层）不依赖于产品类的实例如何被创建、实现等细节
 *    2、强调一系列相关的产品对象（属于同一个产品族相当于同一个品牌）一起使用创建对象需要大量重复的代码。
 *    3、提供一个产品类的库，所有的产品以同样的接口出现，从而使客户不依赖具体实现。
 * 优点： 具体产品在应用层代码隔离，无需关心创建细节
 *        将一个系列的产品族统一到一起创建
 * 缺点：
 *      规定了所有可能被创建的产品集合，产品族中扩展新的产品困难，需要修改抽象工厂的接口
 *      增加了系统的抽象性和理解难度
 * 不符合开闭原则
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        JavaFactory javaFactory = new JavaFactory();
        ICourse course = javaFactory.createCourse();
        INote note = javaFactory.createNote();
        IVideo video = javaFactory.createVideo();

        course.record();
    }
}
