package ade.springframework.spgpetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by adewale adeleye on 27/03/2019
 **/
@Controller
public class VetController {

    @RequestMapping({"/vets","vets/index", "vets/index.html"})
    public String listOfVets()
    {
        return "vets/index";
    }
}
