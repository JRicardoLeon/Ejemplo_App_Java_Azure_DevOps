package com.microsoft.demo;

public class Demo {
    public boolean DoSomething(boolean flag){
        if(flag){
            System.out.println("I am covered");
            return true;
        }

        System.out.println("I am not covered");
        return false;
    }
}