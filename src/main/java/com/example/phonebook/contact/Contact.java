package com.example.phonebook.contact;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter @Setter @NoArgsConstructor @ToString
public class Contact {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String surname;
    private String number;

    public Contact(String name, String surname, String number) {
        this.name = name;
        this.surname = surname;
        this.number = number;
    }

}
