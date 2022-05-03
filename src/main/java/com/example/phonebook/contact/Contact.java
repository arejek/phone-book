package com.example.phonebook.contact;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Contact {

    @Id
    private Long id;
    private String name;
    private String surname;
    private int phone_number;

    public Contact() {
    }

    public Contact(Long id, String name, String surname, int phone_number) {
        this.id = id;
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

    public int getPhone_number() {
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

    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }
}
