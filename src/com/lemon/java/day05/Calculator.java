package com.lemon.java.day05;
import java.util.Scanner;
public class Calculator {
    //简易计算器  两位数加减乘除
    public double add(double a,double b){
        return a+b;
    }
    public double sub(double a,double b){
        return a-b;
    }
    public  double ride(double a, double b){
        return a*b;
    }
    public double exc(double a, double b){
        return a/b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数据：");
        double a = scanner.nextDouble();
        System.out.println("请输入运算符：");
        String operator = scanner.next();
        System.out.println("请输入第二个数据：");
        double b = scanner.nextDouble();
        Calculator calculator = new Calculator();
        double result = 0;
        if ("+".equals(operator)){
            result = calculator.add(a, b);
        }else if ("+".equals(operator)){
            result = calculator.add(a, b);
        }else if ("+".equals(operator)){
            result = calculator.add(a, b);
        }else if ("+".equals(operator)){
            result = calculator.add(a, b);
        }
        System.out.println("结果为："+result);


    }


}
