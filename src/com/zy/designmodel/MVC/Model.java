package com.zy.designmodel.MVC;

/**
 * 处理数据，一般是在数据数据库
 */
public class Model {

    public Model(){

    }

    public Student getStuIfno(){
        Student stu=new Student("xiaoming","20161111000");
        return stu;
    }

    //处理数据
    public boolean confrim(Student stu){
        if ("zhangshan".equals(stu.getName())){
            return true;
        }
        return false;
    }
}
