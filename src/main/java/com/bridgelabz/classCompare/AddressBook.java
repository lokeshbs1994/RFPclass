package com.bridgelabz.classCompare;

import java.util.Objects;

public class AddressBook implements Cloneable {
    private String name;
    private String mobile;
    private Integer pin;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Integer getPin() {
        return pin;
    }

    public void setPin(Integer pin) {
        this.pin = pin;
    }

    @Override
    protected AddressBook clone() throws CloneNotSupportedException {
        return (AddressBook) super.clone();
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", mobile='" + mobile + '\'' +
                ", pin=" + pin +
                '}';
    }


    public boolean equals(AddressBook o) {

        if (o == null || getClass() != o.getClass()) return false;
        AddressBook that = o;
        return Objects.equals(name, that.name) && Objects.equals(mobile, that.mobile) && Objects.equals(pin, that.pin);
    }

}
