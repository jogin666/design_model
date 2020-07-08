package com.zy.designmodel.frontController;

public class FrontController {

    private Dispatcher dispatcher;

    public FrontController(){
        this.dispatcher=new Dispatcher();
    }

    private boolean isAuthenticUser(String url){
        boolean t=false;
        //todo
        //业务流程
        t=true;

        return  t;
    }

    private void tractUrl(String url){
        System.out.println("记录 url->"+url);
    }

    public void handleRequest(String url){
        tractUrl(url);
        if (isAuthenticUser(url)){
            dispatcher.dispatcher(url);
        }
    }
}
