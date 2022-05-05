package com.example.phonebook.contact;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api")
public class ContactController {

    private final ContactService contactService;

    @Autowired
    public ContactController(ContactService contactService){
        this.contactService = contactService;
    }

    @GetMapping
    public List<Contact> getContacts(){
        return contactService.getContacts();
    }

    @GetMapping(path="/id/{contactId}")
    public String getContactById(@PathVariable("contactId") Long contactId){
        return contactService.getContactById(contactId).toString();
    }

    @GetMapping(path="/surname/{surname}")
    public List<Contact> getContactBySurname(@PathVariable("surname") String surname){
        return contactService.getContactBySurname(surname);
    }

    @PostMapping
    public void registerNewContact(@RequestBody Contact contact){
        contactService.addNewContact(contact);
    }

    @DeleteMapping(path="/id/{contactId}")
    public void deleteContact(@PathVariable("contactId") Long id){
        contactService.deleteContact(id);
    }

}
