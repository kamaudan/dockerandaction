package com.container.dockerandaction;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api")
public class Api {


    @GetMapping
    public String getApi(){
        return "This is the API endpoint";
    }


}
