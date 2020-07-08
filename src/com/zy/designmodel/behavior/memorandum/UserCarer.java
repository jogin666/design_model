package com.zy.designmodel.behavior.memorandum;

import java.util.Stack;

public class UserCarer {

    //前一个状态
    private Stack<User> userStack1=new Stack<User>();
    //后一个状态
    private Stack<User> userStack_2=new Stack<User>();

    public void saveUserPreviousState(User user){
        userStack1.push(user);
    }

    public User getUserPreviousState(){
        User user=userStack1.pop();
        return user;
    }

    public void saveUserNowState(User user){
        userStack_2.push(user);
    }

    public User getUserBackstate(){
        User user=userStack_2.pop();
        return user;
    }
}
