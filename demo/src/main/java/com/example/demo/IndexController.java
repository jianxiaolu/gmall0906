package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by admin on 2019/1/7.
 */

@Controller
public class IndexController {
    @RequestMapping("index")
    @ResponseBody
    public String show(){
        return "index";
    }
}
