package com.company.companyStructure;

import java.util.ArrayList;
import java.util.List;

public class Directors extends Worker {

    private double addMoney;
    List<Managers> managers = new ArrayList<>();

    public Directors(String name, String surname, double salary) {
        super(name, surname, salary);
    }

    public Directors(String name, String surname, double salary, double addMoney) {
        super(name, surname, salary);
        this.addMoney = addMoney;

    }

    // adding managers to director

    public void addManagerTODirector(Managers m) {
        if (!managers.contains(m)) {
            managers.add(m);
            m.addDirectorToManager(this);
        }
    }

    // show managers of director

    public List<Managers> showManagers(){
        return managers;
    }

// SETTERY,GETTERY, TO STRING

    public double getAddMoney() {
        return addMoney;
    }

    public void setAddMoney(double addMoney) {
        this.addMoney = addMoney;
    }

    @Override
    public String toString() {
        return "Directors{" +
                "name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", salary=" + getSalary() +
                "addMoney=" + addMoney +
                '}';
    }
}
