package com.atguigu.gmall.manage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by admin on 2019/1/9.
 */

@Controller
public class ManageController {

    @RequestMapping("index")
    public String index(){

        return "index";
    }


    @RequestMapping("attrListPage")
    public String getAttrListPage(){
        return "attrListPage";
    }
}
