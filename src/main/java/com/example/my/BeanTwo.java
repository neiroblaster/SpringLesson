package com.example.my;

import org.springframework.stereotype.Component;

@Component
public class BeanTwo {

    public BeanTwo(){
        System.out.println("constructor of BeanTwo");
    }

    public void doSomething(){
        System.out.println("doSomething from BeanTwo");
    }
}