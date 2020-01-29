package com.example.Website.mapper;

import com.example.Website.model.Item;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ItemMapper implements RowMapper<Item> {

    @Override
    public Item mapRow(ResultSet resultSet, int i) throws SQLException {
        Item item = new Item();
        item.setId(resultSet.getString("id"));
        item.setKolumna1(resultSet.getString("kolumna1"));
        return item;
    }
}
