package com.wx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author WX
 * 2019年7月31日15:49:39
 */
@Controller
@RequestMapping("/over")
public class wxTestController {

    @GetMapping("/ye")
    public String sayHello(){
        return "hello";
    }
}
