package ade.springframework.spgpetclinic.controller;

import ade.springframework.spgpetclinic.service.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjection {
    private GreetingService greetingService;
    //#@Autowire is optional
    public ConstructorInjection(@Qualifier("constructorServiceImpl") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello()
    {
        return greetingService.sayHello();
    }
}
