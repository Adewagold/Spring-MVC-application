package ade.springframework.spgpetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by adewale adeleye on 27/03/2019
 **/
@Controller
@RequestMapping("owners")
public class OwnerController {
    @RequestMapping({"","/","/index.html", "index"})
    public String index(){
        return "owner/index";
    }
}
