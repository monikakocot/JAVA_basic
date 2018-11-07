package com.company.phoneBook;

public class NumberModel {

    private String number;
    private String type; // can be done also like Enum
    private boolean isActive;

    public NumberModel(String number, String type, boolean isActive) {

        this.number=number;
        this.type=type;
        this.isActive=isActive;
    }

    public NumberModel(Object o) {
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof NumberModel)) return false;
        if (!super.equals(object)) return false;

        NumberModel that = (NumberModel) object;

        if (isActive() != that.isActive()) return false;
        if (getNumber() != null ? !getNumber().equals(that.getNumber()) : that.getNumber() != null) return false;
        if (getType() != null ? !getType().equals(that.getType()) : that.getType() != null) return false;

        return true;
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (getNumber() != null ? getNumber().hashCode() : 0);
        result = 31 * result + (getType() != null ? getType().hashCode() : 0);
        result = 31 * result + (isActive() ? 1 : 0);
        return result;
    }

    // GETTERS, SETTERS, TO STRING

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public  boolean isActive() {
        return isActive;
    }


    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "NumberModel{" +
                "number='" + number + '\'' +
                ", type='" + type + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}



