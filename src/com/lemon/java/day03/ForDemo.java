package com.lemon.java.day03;
/*
    for循环语句：
            基础语法：
                for(int i =1;i<=10;i++){
                    System.out.print(i); //打印每一个变量i的值
                }
            语法解释：
                i：代表循环开始的值
                i<=10：代表的是循环条件，满足条件才会继续循环
                i++：代表走完了一次循环，i自增1
                ；：用来分隔条件
             执行顺序：
                i被初始化为1
                i<=10成立，执行循环体
                i++自增大于10时停止循环
      增强for循环：for(内部元素类型  变量名:集合){...}
      循环控制：忽略本次 conitue   结束循环 break
 */
public class ForDemo {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        //求1-100的和
        int resultl = 0;
        for(int i=1;i<=100;i++) {
        resultl+=i;
        }
        System.out.println(resultl);

        String [] name = {"aa","bb","vv"};
        for (int i = 0;i<name.length;i++){
            System.out.println(name[i]);
        }
        for (String string:name) {
            System .out.println(string);
        }

    }
}
