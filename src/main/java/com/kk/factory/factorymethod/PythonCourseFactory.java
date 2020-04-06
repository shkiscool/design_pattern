package com.kk.factory.factorymethod;

import com.kk.factory.ICourse;
import com.kk.factory.JavaCourse;
import com.kk.factory.PythonCourse;

public class PythonCourseFactory implements ICourseFactory {
    public ICourse create() {
        return new PythonCourse();
    }
}
