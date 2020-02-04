package com.example.Website.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Item {
    @Id
    int id;
    String kolumna1;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKolumna1() {
        return kolumna1;
    }

    public void setKolumna1(String name) {
        this.kolumna1 = kolumna1;
    }

    public Item() {
    }

    public Item(Integer id, String kolumna1) {
        this.id = id;
        this.kolumna1 = kolumna1;
    }
}
