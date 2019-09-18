package com.lemon.java.day03;

public class HomeWork {
    public static void main(String[] args) {
        //奇数偶数和
        int OddNumber = 0;
        int EvenNumbers = 0;
        for(int i=0; i<=100;i++){
            if(i%2==1){
                OddNumber +=i;
            }else {
                EvenNumbers +=i;
            }
        }
        System.out.println(OddNumber);
        System.out.println(EvenNumbers);
        //冒泡排序
        int [] Array={4,1,3,2,5};
        for (int i = 1; i<Array.length;i++){
            for (int j = 0; j<Array.length-i;j++){
                if(Array[j]>Array[j+1]){
                    int temp =Array[j];
                    Array[j]=Array[j+1];
                    Array[j+1]=temp;
                }
            }

        }
        for (int i = 0; i<Array.length;i++){
            System.out.println(Array[i]);
        }
        //打印三角形
        for (int i=1;i<=5;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //打印等边三角形
        for (int i=1;i<=5;i++){
            for (int j=5;j>i;j--){
                System.out.print(" ");
            }
            for (int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
