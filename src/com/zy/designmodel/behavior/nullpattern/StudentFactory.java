package com.zy.designmodel.behavior.nullpattern;

import com.zy.designmodel.behavior.nullpattern.core.NullStudent;
import com.zy.designmodel.behavior.nullpattern.core.Students;

public class StudentFactory {

    public static Students returnStudent(Name name){
        switch (name){
            case xiaoming:
                return new Student("小明",19);
            case lihuan:
                return new Student("李华",20);
            case xiaolizi:
                return new Student("小李子",21);
            default:
                    return new NullStudent();
        }
    }

    enum Name{
        xiaoming,lihuan,xiaolizi,xihua;
    }

    public static void main(String args[]){
        Students stu1= (Students) StudentFactory.returnStudent(Name.xiaoming);
        if (!stu1.isNull()){
            System.out.println(stu1.getStuInfo());
        }

        Students stu2= (Students) StudentFactory.returnStudent(Name.xihua);
        if (stu2.isNull()) {
            System.out.println("该对象不存在");
        }else{
            System.out.println(stu2.getStuInfo());
        }
    }
}
