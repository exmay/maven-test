package com.alibaba.controller;

import com.alibaba.domain.Items;
import com.alibaba.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.xml.bind.SchemaOutputResolver;

@Controller
@RequestMapping("items")
public class ItemsController {

    @Autowired
    private ItemsService service;

    @RequestMapping("findDetail")
    public String findDetail(Model model){
        System.out.println("111");
        Items item = service.findByID(1);
        // 待解决，封装不进去
        // 111
        model.addAttribute("item",item);
        return "item";
    }
}
