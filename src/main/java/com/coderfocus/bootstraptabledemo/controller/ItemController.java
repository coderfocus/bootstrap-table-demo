package com.coderfocus.bootstraptabledemo.controller;

import com.coderfocus.bootstraptabledemo.entity.Item;
import com.coderfocus.bootstraptabledemo.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/item")
@RestController
public class ItemController {

    @Autowired
    private ItemService itemService;

    @GetMapping("/page")
    public List<Item> pageQuery(){
        return itemService.pageQuery();
    }
}
