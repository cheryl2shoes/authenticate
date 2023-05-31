package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AuthenticateController {



    @GetMapping("/")
    public String Dumela(){
        return "Madume, Rea ya ho amohela ha Standard Bank";
    }
    

}
