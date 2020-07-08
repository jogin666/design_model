package com.zy.designmodel.behavior.observer.observerable;

import com.zy.designmodel.behavior.observer.observer.Observer;

public interface Observerable {
    //关注
    void addObserver(Observer observer);
    //取关
    void removeObserver(Observer observer);
    //通知
    void notifyObserver();
}
