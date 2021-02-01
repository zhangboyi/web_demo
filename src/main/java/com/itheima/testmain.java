package com.itheima;

import sun.jvm.hotspot.debugger.SymbolLookup;

public class testmain {
    public static void main(String[] args) {
        test1();
        test2();


    }
    public static boolean test1(){
        Car car = new Car(1231, null);
        String str = "audi";
        if (car.getBrand().equals(str)){
            System.out.println("success");
            return true;
        }else {
            System.out.println("fail");
            return false;
        }
    }

    public static boolean test2(){
        Car car = new Car(1231, "audi");
        String str = "audi";
        if (car.getBrand().equals(str)){
            System.out.println("success");
            return true;
        }else {
            System.out.println("fail");
            return false;
        }
    }
}
