package com.coderfocus.bootstraptabledemo.mapper;

import com.coderfocus.bootstraptabledemo.dto.Page;
import com.coderfocus.bootstraptabledemo.entity.Item;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collection;
import java.util.List;

@Mapper
public interface ItemMapper {
    Page<Item> pageQuery(Integer offset, Integer limit, Double price);
}
