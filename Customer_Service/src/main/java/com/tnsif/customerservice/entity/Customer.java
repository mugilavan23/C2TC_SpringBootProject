package com.tnsif.customerservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Customer {

    @Id
    @Column(name = "C_id")
    private int c_id;

    @Column(name = "C_name")
    private String c_name;

    @Column(name = "Address")
    private String address;

    // Default constructor
    public Customer() {
        super();
    }

    // Parameterized constructor
    public Customer(int c_id, String c_name, String address) {
        super();
        this.c_id = c_id;
        this.c_name = c_name;
        this.address = address;
    }

    // Getters and Setters
    public int getC_id() {
        return c_id;
    }

    public void setC_id(int c_id) {
        this.c_id = c_id;
    }

    public String getC_name() {
        return c_name;
    }

    public void setC_name(String c_name) {
        this.c_name = c_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
