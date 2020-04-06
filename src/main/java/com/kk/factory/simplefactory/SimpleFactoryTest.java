package com.kk.factory.simplefactory;


import com.kk.factory.ICourse;
import com.kk.factory.JavaCourse;

/**
 * 举例 原始社会知己知足 -》 农耕社会小作坊（简单工厂） -》工厂流水线生产 -》现代产业链代工厂
 *
 * 简单工厂 ：适合比较简单的对象创建比较固定的
 * 场景：
 *     1、工厂类负责创建的对象较少
 *     2、客户端只需要传入工厂类的参数，对于如何创建对象的逻辑不需要关系
 * 优点：只需要传入一个正确的参数，就可以获取你所需要的的对象无需知道其创建的细节
 * 缺点：
 *     1、工厂类的职责相对过重，增加新的产品时需要修改工厂类的判断逻辑，违背开闭原则
 *     2、不易于扩展过于复杂的产品结构
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {
        CourseFactory courseFactory = new CourseFactory();
       // ICourse course = courseFactory.create("java");
       // ICourse course = courseFactory.create("com.kk.factory.JavaCourse");
        ICourse course = courseFactory.create(JavaCourse.class);
        course.record();
        /*
        java 中的简单工厂类举例
        日期处理类 Calendar
         */
        //Calendar instance = Calendar.getInstance();

    }
}
