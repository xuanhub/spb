package com.jx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by Qiju on 11/28/2017.
 */
@RestController
public class IndexController {

    @RequestMapping(value = "/hello")
    public String index(){
        return "welcome";
    }

    @RequestMapping(value = "/login")
    public String login(){
        return "login";
    }

}
