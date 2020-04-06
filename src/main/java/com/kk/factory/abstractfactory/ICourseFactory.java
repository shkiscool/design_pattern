package com.kk.factory.abstractfactory;

import com.kk.factory.ICourse;

/**
 * 需要所有的子工厂都实现这个工厂
 * （一个品牌的抽象）
 */
public interface ICourseFactory {
    ICourse createCourse();
    INote createNote();
    IVideo createVideo();
}
