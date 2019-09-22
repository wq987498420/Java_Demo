package com.lemon.java.day05;

import java.util.SplittableRandom;
/*
重载参数：
    函数名字同名但参数列表不一样
        参数个数不一样
        参数类型不一样
        参数类型顺序不一样

java内存：

 */

public class Mobilephone {
    String brand;
    String generation;
    int price;
    public  void  sendMessage(String name){
        System.out.println(name + "晚上有空吗，一起吃饭");
        System.out.println("-----此短信通过【" + this.brand+this.generation+"】手机发出");
    }
    public Mobilephone(){

    }

    public Mobilephone(String brand, String generation, int price){//形参
        this.brand = brand;
        this.generation = generation;
        this.price = price;
    }

    public static void main(String[] args){
        Mobilephone mobilephone = new Mobilephone("华为","P20",8888);
        String name = "小明";
        mobilephone.sendMessage(name);
        Mobilephone mobilephone1 = new Mobilephone();
        String name1 = "小红";
        mobilephone1.sendMessage(name1);
    }

}
