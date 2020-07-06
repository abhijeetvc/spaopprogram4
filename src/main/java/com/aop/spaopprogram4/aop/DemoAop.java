package com.aop.spaopprogram4.aop;

import com.aop.spaopprogram4.impl.Employee;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
//Aspect : Aspect is a cross-cutting concern
//Advice : Action taken by aspect.  Types: After, Before, Around,
// AfterReturning, AfterThrowing
//Joinpoint : JP is a point that represents execution of method
//Pointcut : Scenario/expression that matches to joinpoint

//Transaction management && Logging
@Component
@Aspect
public class DemoAop {

    @Before(" execution(* com.aop.spaopprogram4.impl.DemoImpl.doSomething())")
    public void aopCheck(){
        System.out.println("hiiiiiiiii");
    }

//    @AfterReturning(pointcut = " execution(* com.aop.spaopprogram4.impl.DemoImpl.doSomething())",
////    returning = "retVal")
////    public void aopCheck1(Object retVal){
////        System.out.println("Returned value is: "+retVal);
////    }

    @AfterReturning(pointcut = " execution(* com.aop.spaopprogram4.impl.DemoImpl.getData())",
            returning = "retVal")
    public void aopCheck1(Object retVal){

        Employee e= (Employee) retVal;
        System.out.println("Id is: "+e.getId());
        System.out.println("Name is: "+e.getName());
        System.out.println("City is: "+e.getCity());

    }
}
