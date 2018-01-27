package com.boot.controller;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@EnableAutoConfiguration
public class HomeController {

    @RequestMapping("/")
    @ResponseBody
	public String home() {
        return "Hello World!";
    }

}
