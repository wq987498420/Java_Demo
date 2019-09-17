package com.lemon.java.day01;
/*
JAVA简介：编译型语言
        1.java是一门后台开发语言
        2.大型web系统，app后台服务器首选开发语言
        3.java特点：跨平台，安全性高，有丰富的类库
        4.核心思想：面向对象
为什么要安装jdk:
        1.因为jdk是java开发工具
        2.jdk提供了丰富的命令，比如编译，执行
        3.jdk提供jre（java运行环境）和丰富的类库
为什么要配置环境变量：
        1.配置了环境变量就能够保证我们在系统的任意目录调用到java命令（javac,java）
java执行的原理：
        1.java程序在执行前会经过编译器编译得到class文件（.java-->.class）
        2.类加载器将class文件加载到虚拟机
        3.java虚拟机能够解释执行代码
 */

/*
package：
通过package来管理不同模块的类
java程序的单位-->class类
用class关键字来声明类（定义类）
关键字：java中具有特殊含义的单词，不能用来定义类，变量，方法
代码编写：代码写在类体里面
 */

/*
java的第一个HelloWorld程序
@author Administrator
 */
public class HelloWorld {
    //类的声明
    //代码必须写在类体中
    public static void main(String [] args){
        //定义一个变量a，给一个初始值1
        int a = 1;
        //定义一个变量b，给一个初始值2
        int b = 2;
        //输出语句
        System.out.println(a+b);
        //字符串-->一串文字（数字，中文，特殊字符）
        System.out.println("第一个HelloWorld程序");
    }
}
/*
总结：
    1.必须按照规范来。Java project-->packa-->class
    2.所有命名都必须用英文字母或者单词，不能用中文
    3.类名第一个字母要大写（驼峰）
    4.包名最好是多个英文单词以‘.’作为分隔
    5.注意，代码是以‘;’结束，而且括号都是成对出现的
 */

