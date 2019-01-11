package com.atguigu.gmall.manage.controller;

import bean.BaseAttrInfo;
import bean.BaseCatalog1;
import bean.BaseCatalog2;
import bean.BaseCatalog3;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.AttrService;

import java.util.List;

/**
 * Created by admin on 2019/1/10.
 */
@RestController
public class AttrController {

    @Reference
    AttrService attrService;



    @RequestMapping("getAttrList")
    public List<BaseAttrInfo> getAttrList(String catalog3Id){

        List<BaseAttrInfo> baseAttrInfos = attrService.getAttrList(catalog3Id);

        return baseAttrInfos;
    }

    @RequestMapping("getCatalog1")
    public List<BaseCatalog1> getCatalog1(){

        List<BaseCatalog1> baseCatalog1s = attrService.getCatalog1();

        return baseCatalog1s;
    }



    @RequestMapping("getCatalog2")
    public List<BaseCatalog2> getCatalog2(String catalog1Id){

        List<BaseCatalog2> baseCatalog2s = attrService.getCatalog2(catalog1Id);

        return baseCatalog2s;
    }

    @RequestMapping("getCatalog3")
    public List<BaseCatalog3> getCatalog3(String catalog2Id){

        List<BaseCatalog3> baseCatalog3s = attrService.getCatalog3(catalog2Id);

        return baseCatalog3s;
    }
}
