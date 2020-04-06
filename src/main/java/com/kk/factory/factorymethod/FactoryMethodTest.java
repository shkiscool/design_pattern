package com.kk.factory.factorymethod;

import com.kk.factory.ICourse;

/**
 * 工厂方法模式 Factory Method Pattern
 *     是指定义一个创建对象的接口，但让实现这个接口的类来决定实例化哪个类，工厂方法让类的实例化推迟到了子类中进行。
 * 场景：
 *     1、创建对象需要大量重复的代码 可以在把接口工厂类变为一个抽象类 实现一些公共代码
 *     2、客户端（应用层） 不依赖于产品类实例如何被创建，实现等细节
 *     3、一个类通过其他子类来指定创建哪个对象。
 * 优点：用户只需要关心所需产品对应的工厂，无需关心创建细节。加入新的产品符合开闭原则，提高了系统的可扩展性
 *
 * 缺点：类的个数容易过多，增加了代码结构的复杂度，增加了系统的抽象性和理解难度。
 */
public class FactoryMethodTest {
    public static void main(String[] args) {
        ICourseFactory iCourseFactory = new PythonCourseFactory();
        ICourse iCourse = iCourseFactory.create();
        iCourse.record();
        // LoggerFactory 日志
        //LoggerFactory.getLogger();
    }
}
