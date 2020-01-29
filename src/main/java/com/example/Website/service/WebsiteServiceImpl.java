package com.example.Website.service;

import com.example.Website.model.Item;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Set;

@Component
public class WebsiteServiceImpl implements WebsiteService{
@Resource
WebsiteService websiteService;
    @Override
    public List<Item> findAll() {
        return websiteService.findAll();
    }
}
