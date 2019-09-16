package com.coderfocus.bootstraptabledemo.service;

import com.coderfocus.bootstraptabledemo.dto.Page;
import com.coderfocus.bootstraptabledemo.entity.Item;

import java.util.Collection;
import java.util.List;

public interface ItemService {
    Page<Item> pageQuery(Page page);
}
