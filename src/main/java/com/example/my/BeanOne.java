package com.example.my;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class BeanOne {

    public BeanOne(){
        System.out.println("constructor of BeanOne");
    }

    public void doSomething(){
        System.out.println("doSomething from BeanOne");
    }
}
