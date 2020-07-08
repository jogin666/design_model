package com.zy.designmodel.MVC;

public class Control {

    private View view;
    private Model model;

    public Control(View view){
        this.view=view;
        this.model=new Model();
    }

    public void  confrim(){
        Student stu=view.input();
        if (model.confrim(stu)){
            view.login("true");
        }
        view.login("false");
    }

    public void showStuInfo(){
        Student stu=model.getStuIfno();
        view.output(stu);
    }
}
