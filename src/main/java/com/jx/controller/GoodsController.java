package com.jx.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by Qiju on 11/28/2017.
 */
@RestController
public class GoodsController {

    @RequestMapping(value = "/goodslist")
    public String goodslist(){
        return "welcome";
    }
}
