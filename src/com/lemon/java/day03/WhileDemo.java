package com.lemon.java.day03;
/*
      while循环：
            do{
                ...
            }while(条件1);

            while(条件2){
                ...
            }
            二者区别：do...while...不管条件满不满足，他是先执行，再判断条件，所以代码至少执行一次
                       while...只有条件满足时才会取执行

       常见的条件控制语句：
               switch语句；
                        switch(变量a){ //变量a符合哪个条件就执行哪个条件后的代码，break结束后面的执行，default都不符合时执行
                        //switch不支持long类型的变量
                        case a:
                               ...;
                               break;
                        case b:
                               ...;
                               break;
                         default:
                               ...;
                               break;
                               }
               if...else...语句；
               if...else if...else语句；
               if...if...if...语句
 */
public class WhileDemo {
    public static void main(String[] args) {
        int x = 1;
        do {
            System.out.println(x);//打印-1-5
            x++;
        }while(x>=0&&x<=5);

        while (x>=0&&x<=5){
            System.out.println(x);//不会执行
            x++;
        }
         x=1;
        switch (x){
            case 1:
                System.out.println("存");
                break;
            default:
                System.out.println("取");
        }
    }
}
