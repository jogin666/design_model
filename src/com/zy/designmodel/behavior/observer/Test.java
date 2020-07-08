package com.zy.designmodel.behavior.observer;

import com.zy.designmodel.behavior.observer.observer.Observer;
import com.zy.designmodel.behavior.observer.observer.User;
import com.zy.designmodel.behavior.observer.observerable.WeChatServer;

public class Test {

    public static void main(String args[]){
        //公众号
        WeChatServer server = new WeChatServer();
        //用户
        Observer userZhang = new User("ZhangSan");
        Observer userLi = new User("LiSi");
        Observer userWang = new User("WangWu");
        //关注公众号
        server.addObserver(userZhang);
        server.addObserver(userLi);
        server.addObserver(userWang);
        server.sendMessage("PHP是世界上最好用的语言！");
        //zhangsan取关
        server.removeObserver(userZhang);
        System.out.println("----------------------------------------------");
        server.sendMessage("JAVA是世界上最好用的语言！");
    }
}
