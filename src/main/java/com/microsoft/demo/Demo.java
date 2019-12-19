package com.microsoft.demo;

public class Demo {
    public void DoSomething(boolean flag){
        if(flag){
            System.out.println("I am covered but partially");
            return;
        }

        System.out.println("I am not covered at all");
    }
}