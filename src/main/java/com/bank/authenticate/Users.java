package com.bank.authenticate;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class Users {



    /*
 */
    
   
    private String username;
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @PostMapping("/authenticate/")
    public Users create(AuthenticateController authenticateController){
    
        authenticateController.db.put(getUsername(),this);
    
    
        return this;
    }

    public Users() {
    }

    public Users(String username, String password) {
        this.username = username;
        this.password = password;
    }
   

    
}
