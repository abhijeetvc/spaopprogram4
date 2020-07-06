package com.aop.spaopprogram4.controller;

import com.aop.spaopprogram4.impl.DemoImpl;
import com.aop.spaopprogram4.impl.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @Autowired
    private DemoImpl demoImpl;

    @GetMapping(value="/check")
    public String getData(){
        return demoImpl.doSomething();
    }


    @GetMapping(value="/check1")
    public Employee getData1(){
        return demoImpl.getData();
    }


}
