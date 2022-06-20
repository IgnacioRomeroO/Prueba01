package com.prueba1.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class triciclocontrollers {

    // localhost:8080/Triciclo
    @RequestMapping("/Triciclo")
    public String Index(){
        return "";
    }




}
