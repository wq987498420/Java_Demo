package com.lemon.java.day04;
/*
变量：
    类型划分：
        基本数据类型变量
        引用类型数据变量
    作用域范围划分：
        局部变量：
            定义在函数体内
            定义再函数参数列表里
            代码块中{}
            作用域：此变量的作用域限于最近的一堆{}
            注意：局部变量时无法使用修饰符取修饰的
        全局变量（成员变量）：
            定义再类体内
            在函数外
            在代码块外
            作用域：同时满足以上几个条件的变量都是全局变量，此变量的作用域为整个类

类：模板，描述的时具有共性的一类事物，这类事物包含静止的属性（变量）和动态的行为（函数），类时抽象的概念
对象：类的具象
函数：遵循特定语法，具有特定功能的一段代码，描述的时类的行为（简单点来讲就是我这个类能做什么事情）
    分类：
        构造函数
            构造函数时用来构造对象的函数
            分类：
                无参构造函数：
                     语法：修饰符+函数名（）{...}
                            public Member(){
                                ...
                                    }
                带参构造函数：
                    语法：修饰符+函数名（参数类型 参数名...）{...}
                            public Member(String mobilephone, String password){
                                ...
                            }
                注意：
                    不需要显示声明函数返回值
                    函数名必须跟类名保持一致

        非构造函数（普通函数）
            语法：修饰符+函数返回值类型+函数名（函数类型 参数名）{函数体}
            举例：请用一个函数实现两个整数的加法
            public int add（int a,int b）{
                return a+b;
            }
            修饰符：分为（public，protected，默认修饰符，private）这几种类型，从左向右权限逐步降低，public的访问你权限最大。private类型的访问权限最小
            函数返回值类型：八大基本类型/引用类型/空类型（void）
            函数名：随便定义，语法要求第一个字母小写，函数名要见名知意
            参数类型：就是一个变量的类型（八大基本类型/引用类型）
 */
public class Mobile {
    public  String brand;
    public int price;
    public void sendMessage(String name){
        System.out.println(name+"你在家吗，我周末而不可以去你家玩");
        System.out.println("-----发自价格为："+price+",品牌为："+brand+"的手机");
    }
    /*
    返回手机信息函数return
     */
    public String getMobileInfo(){
        return "手机品牌："+this.brand+".手机价格"+this.price;
    }
    /*
    无参构造函数，作用：创建一个原始的对象
     */
    public Mobile(){

    }
    /*
    代餐构造函数，作用：能按照我们的意愿来初始化一个对象
       @param name
       @param money
     */
    public Mobile(String name,int money){ //形参
        this.brand = name;
        this.price = money;
    }
    public static void main(String [] args){
        //通过调用无参构造函数，创建一个原始对象
        Mobile mobile1 = new Mobile();
        //调用带参构造函数，创建一个对象，品牌：华为，价格：8888
        Mobile mobile2 = new Mobile("华为",8888);//实参
        //显示手机1的品牌信息和价格信息
        String info1 = mobile1.getMobileInfo();
        //显示手机2的品牌信息和价格信息
        String info2 = mobile2.getMobileInfo();
        System.out.println(info1);
        System.out.println(info2);
        mobile2.sendMessage("子非鱼");
    }
}
