package com.zy.designmodel.behavior.memorandum;

public class UserStateManagement {

    private UserCarer userCarer=new UserCarer();
    private User user;

    public UserStateManagement(){ }

    //保存撤销之前的状态
    private void saveUserNowState(User user){
        setUser(user);
        userCarer.saveUserNowState(user);
    }

    //保存下一步操作之前的当前状态
    private void saveUserPreciousState(User user){
        setUser(user);
        userCarer.saveUserPreviousState(user);
    }

    //撤销，恢复操作
    public void operation(String operationStr){
        //撤回
        if ("Ctrl+z".equals(operationStr)){
            saveUserNowState(user);
            user=userCarer.getUserPreviousState();
        }else if ("Ctrl+y".equals(operationStr)){  //恢复
            saveUserPreciousState(user);
            user=userCarer.getUserBackstate();
        }else if ("next".equals(operationStr)){
            saveUserPreciousState(user);
        }
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public static void main(String args[]){
        UserStateManagement management=new UserStateManagement();
        User user=new User("张三",19);
        management.setUser(user);
        management.operation("next");

        user=new User("xiaoming",18);
        management.setUser(user);
        management.operation("next");

        user=new User("lihua",17);
        management.setUser(user);
        System.out.println("当前状态->"+user);
        System.out.println("");
        //返回当前状态的上一个状态
        management.operation("Ctrl+z");
        System.out.println("Ctrl+z->"+management.getUser());
        System.out.println("");
        //返回下一个状态
        management.operation("Ctrl+y");
        System.out.println("Ctrl+y->"+management.getUser());
        System.out.println("");
        //返回当前状态的上一个状态
        management.operation("Ctrl+z");
        System.out.println("Ctrl+z->"+management.getUser());
        System.out.println("");
        //返回当前状态的上一个状态
        management.operation("Ctrl+z");
        System.out.println("Ctrl+z->"+management.getUser());
    }
}
