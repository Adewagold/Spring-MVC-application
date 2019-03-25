package ade.springframework.spgpetclinic.controller;

import ade.springframework.spgpetclinic.service.GreetingService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello()
    {
        System.out.println("Check");
        return greetingService.sayHello();
    }
}
