package com.lemon.java.day03;
/*
运算符：
    算术运算符：算术运算符只能运用在数值类型数据之间{+；-；*；/；%；++；--；}
    关系运算符：关系运算符只能运用在数值类型数据之间的运算，运算结果时布尔类型的值{==;!=;>;<;>=;<=}
    逻辑运算符：逻辑运算符只能运用再布尔类型的数据之间运算{&；&&；|（两者都会进行判断）；||（前者不成立后者直接不进行判断）；！}
    赋值运算符：{=；+=；-=；*=；/=；（%）=}
    其他运算符：条件运算符（A?B:C）三目运算符  ？：表示疑问“成不成立”   :：表示否者
    运算符运算顺序：
            1.++；--
            2.括号
            3.*；/；%（同级优先级，从左至右）
            4.+；-（同级优先级，从左至右）
            注意：同级优先级，从左至右，运算复杂需一步步拆解运算
 */

public class Operator {
    public static void main(String [] args){
        int a = 1;
        int b = 2;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a/b);
        System.out.println(a*b);
        System.out.println(a%b);
        a++;//先赋值再运算
        ++a;//先运算再赋值
        System.out.println(a);
        a--;
        System.out.println(a);
        //关系运算符
        System.out.println(a==3);
        int c = 3;
        System.out.println((a>b)&(b>c));
    }
}

class Operators {
    public static void main(String [] args){
        int x = 1;
        int y = 2;
        int z = 3;
        System.out.println(x/y);// 值：0   因为int是整数类型
        System.out.println(y/x);
        System.out.println(x%y);
        System.out.println(y%x);
        System.out.println((++x)+y);//值：4  x先自增然后与y相加
        System.out.println(x+(y++));//值：4  y先自增然后与x相加
        System.out.println(x+(--z));//值：4  z先

         // 自减然后与x相加

    }
}
