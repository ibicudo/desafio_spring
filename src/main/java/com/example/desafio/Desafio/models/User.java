package com.example.desafio.Desafio.models;

import com.example.desafio.Desafio.DTOs.SellerDTO;

import java.util.List;

public class User {
    private Integer id;
    private String name;
    private boolean seller;
    private List<Integer> idsFolllowed; //sellers that user are following

    public User() {
    }

    public User(Integer id, String name, boolean seller, List<Integer> idsFolllowed) {
        this.id = id;
        this.name = name;
        this.seller = seller;
        this.idsFolllowed = idsFolllowed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User that = (User) o;
        return id == that.id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSeller() {
        return seller;
    }

    public void setSeller(boolean seller) {
        this.seller = seller;
    }

    public List<Integer> getIdsFolllowed() {
        return idsFolllowed;
    }

    public void setIdsFolllowed(List<Integer> idsFolllowed) {
        this.idsFolllowed = idsFolllowed;
    }
}
