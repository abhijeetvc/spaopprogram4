package com.aop.spaopprogram4.impl;

import com.aop.spaopprogram4.repository.DemoInterface;
import org.springframework.stereotype.Component;

@Component
public class DemoImpl implements DemoInterface {

    @Override
    public String doSomething() {
        System.out.println("Hellllloooooooooo");
        return "Hello AOP";
    }

    @Override
    public Employee getData() {
        Employee e=new Employee();
        e.setId(1);
        e.setName("Abcd");
        e.setCity("Chennai");
        return e;
    }
}
