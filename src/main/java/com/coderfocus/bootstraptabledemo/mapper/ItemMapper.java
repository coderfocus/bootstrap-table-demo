package com.coderfocus.bootstraptabledemo.mapper;

import com.coderfocus.bootstraptabledemo.entity.Item;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ItemMapper {
    List<Item> pageQuery();
}
