package com.bank.authenticate;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;


@RestController
public class AuthenticateController {


    Map<String,Users> db =new HashMap<>(){{
        put("Cheryl Moshoeshoe",new Users("CherylMoshoeshoe","ch!!ER07"));
    }};
    //private List<Users> db= List.of(new Users("Cheryl Moshoeshoe","ch!!ER07"));



    @GetMapping("/")
    public String Dumela(){
        return "Madume, Rea ya ho amohela ha Standard Bank";
    }

    @GetMapping("/authenticate")
    public Collection<Users> get(){

        return db.values();
    
    }
    @GetMapping("/authenticate/{username}")
    public Users get(@PathVariable String username){

        Users user =db.get(username);
        if (user == null) throw new ResponseStatusException(HttpStatus.NOT_FOUND);

        return user;
    
    }
    
        
    

}
