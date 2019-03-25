package ade.springframework.spgpetclinic.controller;

import ade.springframework.spgpetclinic.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectionController {
    @Autowired
public GreetingService greetingServiceImpl;
//    @Qualifier("greetingServiceImpl")// or change the property name to the bean name
public String sayHello()
{
    return greetingServiceImpl.sayHello();
}
}

