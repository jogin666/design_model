package com.zy.designmodel.MVC;

public class View {

    public void output(Student stu){
        System.out.println(stu.toString());
    }

    public void login(String str){
        if ("true".equals(str)){
            System.out.println("输入正确！");
        }
        System.out.println("输入错误！");
    }

    public Student input(){
       return new Student("lihua","12345678912");
    }

    public static void main(String args[]){
        Control control=new Control(new View());
        //从Model获取学生信息，view输出
        control.showStuInfo();
        //从view中输入，model判断，view输出结果
        control.confrim();
    }

}
