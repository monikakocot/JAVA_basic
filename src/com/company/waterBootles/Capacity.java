package com.company.waterBootles;

public  enum Capacity {
    SMALL(0.5),
    MEDIUM(1.0),
    LARGE(2.0);

    double value;

    Capacity(double value){

        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}