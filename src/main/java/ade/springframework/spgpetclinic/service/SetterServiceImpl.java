package ade.springframework.spgpetclinic.service;

import org.springframework.stereotype.Service;

@Service
public class SetterServiceImpl implements GreetingService {
    @Override
    public String sayHello() {
        return "I was injected by the setter";
    }
}

