package com.example.phonebook.contact;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class ContactService {

    private final ContactRepository contactRepository;

    @Autowired
    public ContactService(ContactRepository contactRepository){
        this.contactRepository = contactRepository;
    }

    public List<Contact> getContacts(){
        return contactRepository.findAll();
    }

    public Contact getContactById(Long contactId) {
        if (contactRepository.existsById(contactId)){
            return contactRepository.getById(contactId);
        } else {
            throw new IllegalStateException("no such id");
        }
    }

    public List<Contact> getContactBySurname(String surname){
        List<Contact> contactList = contactRepository.findContactBySurname(surname);
        if(contactList.isEmpty()){
            throw new IllegalStateException("no contact with this surname");
        } else {
            return contactList;
        }
    }

    public void addNewContact(Contact contact) {
        seeIfNumberIsTaken(contact.getNumber());
        contactRepository.save(contact);
    }

    public void deleteContact(Long id) {
        if (contactRepository.existsById(id)){
            contactRepository.deleteById(id);
        } else {
            throw new IllegalStateException("contact with id: " + id + " doesnt exist");
        }
    }

    public void updateContact(Contact newContact, Long id) {
        contactRepository.findById(id)
                .map(contact -> {

            contact.setName(newContact.getName());
            contact.setSurname(newContact.getSurname());

            String newNumber = newContact.getNumber();
            String oldNumber = contact.getNumber();
            if (!Objects.equals(newNumber, oldNumber)) { seeIfNumberIsTaken(newNumber); }
            contact.setNumber(newNumber);

            return contactRepository.save(contact);
        })
                .orElseGet(()-> {
                    return contactRepository.save(newContact);
                });
    }

    public void seeIfNumberIsTaken(String number){
        Optional<Contact> contactOptional = contactRepository.findContactByNumber(number);
        if(contactOptional.isPresent()){
            throw new IllegalStateException("phone number taken");
        }
    }

}
