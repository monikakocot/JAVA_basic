package com.company.interfejs;


public class Database implements Savable {
    @Override
    public void save() {
        System.out.println("Save to Datebase");
    }
}
