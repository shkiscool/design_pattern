package com.kk.factory.abstractfactory;

import com.kk.factory.ICourse;
import com.kk.factory.JavaCourse;

public class JavaFactory implements ICourseFactory {
    public ICourse createCourse() {
        return new JavaCourse();
    }

    public INote createNote() {
        return new JavaNote();
    }

    public IVideo createVideo() {
        return new JavaVideo();
    }
}
