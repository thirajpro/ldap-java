package com.ldappractice.ldap.practice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {
    @GetMapping("/")
    public String index(){
        return "Congratulations! LDAP example is working";
    }
}
