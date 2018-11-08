package com.company.interfejs;

public class Cache implements Savable {
    @Override
    public void save() {
        System.out.println("Cachowanie");
    }
}