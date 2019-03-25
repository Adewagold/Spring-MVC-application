package ade.springframework.spgpetclinic.service;

import org.springframework.stereotype.Service;

@Service
public class ConstructorServiceImpl implements GreetingService {
    @Override
    public String sayHello() {
        return "I was injected by hte constructor";
    }
}