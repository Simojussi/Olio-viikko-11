package com.example.olio_viikko_11;

import java.util.ArrayList;

public class Item {
    private String description;
    private ArrayList<Item> itemList = new ArrayList<>();


    public Item(String description) {
        this.description = description;
        ArrayList<Item> itemList = new ArrayList<>();
    }

    public ArrayList<Item> getItemList() {
        return itemList;
    }

    public void addItem(Item item){
        itemList.add(item);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}


