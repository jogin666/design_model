package com.zy.designmodel.bulid.single;

public class LazyBrid {
    private static LazyBrid brid=null;

    private LazyBrid(){};

    private static class BridHelper{
        private static LazyBrid brid=new LazyBrid();
    }

    public static LazyBrid getInstance(){
        return BridHelper.brid;
    }

//
//    public static LazyBrid getInstance(){
//        if (brid==null){
//            brid=new LazyBrid();
//        }
//        return brid;
//    }

    //双重检测  加锁
//    public static LazyBrid getInstance(){
//        if (brid==null){
//            synchronized (LazyBrid.class){
//                if (brid==null){
//                    brid=new LazyBrid();
//                }
//            }
//        }
//        return brid;
//    }


}
