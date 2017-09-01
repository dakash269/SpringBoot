package com.javasampleapproach.angularjs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;

import java.util.HashMap;
import java.util.Map;

@Controller
public class WebController {
	@RequestMapping(value="/",method = RequestMethod.GET)
    public String homepage(){
        return "index";
    }
//    @RequestMapping(value="/login",method = RequestMethod.GET)
//    public String login(){
//        return "login";
//    }
//    @RequestMapping(value="/regis",method = RequestMethod.GET)
//    public String registeration(){
//        return "redirect:registeration";
//    }
//@RequestMapping(value="/regis",method = RequestMethod.GET)

}