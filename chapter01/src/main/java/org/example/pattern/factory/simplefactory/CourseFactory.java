package org.example.pattern.factory.simplefactory;

/**
 * @author yyl
 * @version 1.0
 * @date 2020/12/24 21:35
 */
public class CourseFactory {
    public ICourse create(String className){
        if (!className.equals("")||className!=null){
            try {
                return (ICourse) Class.forName(className).newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
