package ade.springframework.spgpetclinic.controller;

import ade.springframework.spgpetclinic.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjection {
    private GreetingService greetingService;

    @Autowired
    @Qualifier("setterServiceImpl")// It can also be included in the method body
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String sayHello()
    {
        return greetingService.sayHello();
    }
}
