package com.company.phoneBook;

import java.util.ArrayList;
import java.util.List;

public class ContactModel {

    private String name;
    private String lastname;
    private List<NumberModel> numbers;

    public ContactModel(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
        this.numbers = new ArrayList<>();
    }

    public ContactModel(String name, String lastname, List<NumberModel> list) {

        this(name,lastname);
        numbers.addAll(list);
    }

    public void hasActiveNumbers() {

        System.out.println("Contact: " + this.name + " " + this.lastname);

        for(int i=0; i<=numbers.size()-1;i++){
            boolean check = numbers.get(i).isActive();
            String number = numbers.get(i).getNumber();

            if(check == true){
            System.out.println("Number: " + number + " is active ");
        } else {
                System.out.println("Number: " + number + " is NOT active ");
            }
        }
    }

    public void addNumber (NumberModel numberModel){
        numbers.add(numberModel);
    }

    public void addNumber(List<NumberModel> list){
        numbers.addAll(list);
    }

    public void removeNumber(NumberModel numberModel){
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ContactModel)) return false;

        ContactModel that = (ContactModel) o;

        if (getName() != null ? !getName().equals(that.getName()) : that.getName() != null) return false;
        if (getLastname() != null ? !getLastname().equals(that.getLastname()) : that.getLastname() != null)
            return false;
        return getNumbers() != null ? getNumbers().equals(that.getNumbers()) : that.getNumbers() == null;
    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + (getLastname() != null ? getLastname().hashCode() : 0);
        result = 31 * result + (getNumbers() != null ? getNumbers().hashCode() : 0);
        return result;
    }

    //GETTERS, SETTERS, TOSTRING

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public List<NumberModel> getNumbers() {
        return numbers;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setNumbers(List<NumberModel> numbers) {
        this.numbers = numbers;
    }

    @Override
    public String toString() {
        return "ContactModel{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", numbers=" + numbers +
                '}';
    }
}

