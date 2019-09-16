package com.coderfocus.bootstraptabledemo.service.impl;

import com.coderfocus.bootstraptabledemo.dto.Page;
import com.coderfocus.bootstraptabledemo.entity.Item;
import com.coderfocus.bootstraptabledemo.mapper.ItemMapper;
import com.coderfocus.bootstraptabledemo.service.ItemService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemMapper itemMapper;

    @Override
    public Page<Item> pageQuery(Page page) {
        return itemMapper.pageQuery(page);
    }
}
