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
    public Page<Item> pageQuery(Integer offset, Integer limit, Double price){
        return itemService.pageQuery(offset, limit, price);
    }

    @GetMapping("/pageTable")
    public String page(){
        return "/pageTable";
    }

    @ResponseBody
    @GetMapping("/pageQueryByPageNumber")
    public Page<Item> pageQueryByPageNumber(Integer pageNumber, Integer pageSize, Double price){
        return itemService.pageQueryByPageNumber(pageNumber, pageSize, price);
    }

    @GetMapping("/jsPageTable")
    public String jsPageTable(){
        return "/jsPageTable";
    }

}
