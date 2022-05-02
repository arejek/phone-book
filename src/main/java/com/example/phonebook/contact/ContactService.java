package com.example.phonebook.contact;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactService {

    public List<Contact> getContact(){
        return List.of(
                new Contact(1, "Robert", "Lewandowski", 9)
        );
    }

}
