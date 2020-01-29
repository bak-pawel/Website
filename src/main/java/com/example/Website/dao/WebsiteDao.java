package com.example.Website.dao;

import com.example.Website.model.Item;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface WebsiteDao {
    List<Item> findAll();
}
