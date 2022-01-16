package com.smari.inheritance.enitity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Customer")
public class Customer extends Person {
    @Column(name = "contact_name", nullable = true)
    private String contactName;

    @Column(name = "city", nullable = true)
    private String city;

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}