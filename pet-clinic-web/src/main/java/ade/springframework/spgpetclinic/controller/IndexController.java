package ade.springframework.spgpetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by adewale adeleye on 26/03/2019
 **/
@Controller
public class IndexController {

    @RequestMapping({"/", "","index", "index.html"})
    public String index()
    {
        return "index";
    }
}
