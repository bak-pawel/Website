package com.example.Website.dao;

import com.example.Website.mapper.ItemMapper;
import com.example.Website.model.Item;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class WebsiteDaoImpl implements WebsiteDao {
    public WebsiteDaoImpl(NamedParameterJdbcTemplate template) {
        this.template = template;
    }
    NamedParameterJdbcTemplate template;
    @Override
    public List<Item> findAll() {
        return template.query("SELECT id, kolumna1 FROM postgres.public.tabela_testowa", new ItemMapper());
    }
}
