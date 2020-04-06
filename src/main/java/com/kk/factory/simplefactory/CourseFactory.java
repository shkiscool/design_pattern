package com.kk.factory.simplefactory;

import com.kk.factory.ICourse;

public class CourseFactory {
  /*  public ICourse create(String name){
        if(name != null && name.equals("java")){
            return new JavaCourse();
        }else{
            return null;
        }
    }*/

//    public ICourse create(String className){
//        try {
//            if(StringUtils.isNoneBlank()){
//                return (ICourse) Class.forName(className).newInstance();
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return null;
//    }

    public ICourse create(Class clazz){
        try {
            if(clazz != null){
                return (ICourse) clazz.newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
