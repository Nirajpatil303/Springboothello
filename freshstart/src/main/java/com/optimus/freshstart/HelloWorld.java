package com.optimus.freshstart;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @GetMapping(path = "/hello")
    public String HelloWorld(){
        return "Hello World Calling all AutoBots its Optimus ";
    }

}
