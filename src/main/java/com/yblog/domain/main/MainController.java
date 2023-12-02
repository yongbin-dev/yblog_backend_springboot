package com.yblog.domain.main;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @RequestMapping(value = "/" , method = RequestMethod.GET)
    public String mainTest(){
        return "main";
    }
}