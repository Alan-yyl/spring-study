package org.example.pattern.factory.simplefactory;

/**
 * @author yyl
 * @version 1.0
 * @date 2020/12/24 21:44
 */
public class Main {
    public static void main(String[] args) {
        CourseFactory factory = new CourseFactory();
        ICourse iCourse=factory.create("org.example.simplefactorypattern.JavaCourse");
        iCourse.record();
    }
}
