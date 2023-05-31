package com.bank.authenticate;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AuthenticateController {


    private List<Users> db= List.of(new Users("Cheryl Moshoeshoe","ch!!ER07"));



    @GetMapping("/")
    public String Dumela(){
        return "Madume, Rea ya ho amohela ha Standard Bank";
    }

    @GetMapping("/authenticate")
    public List<Users> get(){

        return db;
    
    }
    

}
