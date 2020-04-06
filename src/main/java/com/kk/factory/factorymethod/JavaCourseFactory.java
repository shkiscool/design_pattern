package com.kk.factory.factorymethod;

import com.kk.factory.ICourse;
import com.kk.factory.JavaCourse;

public class JavaCourseFactory implements ICourseFactory {
    public ICourse create() {
        return new JavaCourse();
    }
}
