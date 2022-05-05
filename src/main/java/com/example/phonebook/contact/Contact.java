package com.example.phonebook.contact;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Contact {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String surname;
    private String phone_number;

    public Contact() {
    }

    public Contact(String name, String surname, String phone_number) {
        this.name = name;
        this.surname = surname;
        this.phone_number = phone_number;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }
}
