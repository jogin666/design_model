package com.zy.designmodel.frontController;

public class TestMain {

    public static void main(String args[]){
        FrontController frontController=new FrontController();
        frontController.handleRequest("/homeUI");
        frontController.handleRequest("/oaUI");
    }
}
