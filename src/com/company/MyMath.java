package com.company;

public class MyMath {
    static void helloWorld(String a){
        System.out.println("Hello " + a);
    }

    static void one(int a, int b){
        int c = a + b;
        System.out.println(c);
    }
    static void two(int a, int b, int c){
        int d = a + b + c;
        System.out.println(d);
    }
    static void three(int a, int b){
        int c = a - b;
        System.out.println(c);
    }
    static void four(int a, int b, int c){
        int d = a - b + c;
        System.out.println(d);
    }
    static void five(int a, int b, int c){
        int d = a - b - c;
        System.out.println(d);
    }
    static void six(double a, double b){
        double c = a * b;
        System.out.println(c);
    }
    static void seven(double a, double b){
        double c = a / b;
        System.out.println(c);
    }
    static void eight(double a, double b, double c){
        double d = a * b * c;
        System.out.println(d);
    }
    static void nine(double a, double b, double c){
        double d = a / b / c;
        System.out.println(d);
    }
    static void ten(double a, double b, double c){
        double d = a * b / c;
        double e = Math.sqrt(d);
        System.out.println(e);
    }

}
