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
    public Page<Item> pageQuery(Integer offset, Integer limit, Double price) {
        return itemMapper.pageQuery(offset, limit,price);
    }

    @Override
    public Page<Item> pageQueryByPageNumber(Integer pageNumber, Integer pageSize, Double price) {
        return itemMapper.pageQueryByPageNumber(pageNumber, pageSize,price);
    }
}
