package ade.springframework.spgpetclinic.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("de")
public class GermanPrimaryService implements GreetingService{
    @Override
    public String sayHello() {
        return null;
    }
}
