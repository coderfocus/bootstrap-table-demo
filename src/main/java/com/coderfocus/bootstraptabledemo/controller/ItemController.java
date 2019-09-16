package com.coderfocus.bootstraptabledemo.controller;

import com.coderfocus.bootstraptabledemo.dto.Page;
import com.coderfocus.bootstraptabledemo.entity.Item;
import com.coderfocus.bootstraptabledemo.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RequestMapping("/item")
@Controller
public class ItemController {

    @Autowired
    private ItemService itemService;

    @ResponseBody
    @GetMapping("/page")
    public Page<Item> pageQuery(@RequestParam(defaultValue = "0") Integer offset, @RequestParam(defaultValue = "10")Integer limit){
        Page page = new Page();
        page.setOffset(offset);
        page.setLimit(limit);
        return itemService.pageQuery(page);
    }

    @GetMapping("/pageTable")
    public String page(){
        return "/pageTable";
    }
}
