package com.prowings.core;

public class Person1 {
    private String name;
    private Address address; // Dependency on Address

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return name + " lives at " + address;
    }
}
