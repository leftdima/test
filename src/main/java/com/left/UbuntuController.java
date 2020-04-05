package com.left;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UbuntuController {
    @GetMapping
    public @ResponseBody String getTestData(){
        return "Hello Vitek";
    }
}
