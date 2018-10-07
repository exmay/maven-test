package com.alibaba.service.impl;

import com.alibaba.dao.ItemsDao;
import com.alibaba.domain.Items;
import com.alibaba.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private ItemsDao dao;

    public Items findByID(Integer id) {
        return dao.findByID(id);
    }
}
