package com.zy.designmodel.frontController;

import com.zy.designmodel.frontController.UI.HomeUI;
import com.zy.designmodel.frontController.UI.OAUI;

public class Dispatcher {

    private HomeUI homeUI;
    private OAUI oaUI;

    public Dispatcher(){
        homeUI=new HomeUI();
        oaUI=new OAUI();
    }

    public void dispatcher(String url){
        if (url.contains("home")){
            homeUI.show();
        }else if (url.contains("oaUI")){
            oaUI.show();
        }else{
            // todo
        }
    }
}
