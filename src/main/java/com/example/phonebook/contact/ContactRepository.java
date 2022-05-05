package com.example.phonebook.contact;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {

    @Query("SELECT c FROM Contact c WHERE c.phone_number = ?1")
    Optional<Contact> findContactByPhoneNumber(String phone_number);

    @Query("SELECT c FROM Contact c WHERE c.surname = ?1")
    List<Contact> findContactBySurname(String surname);
}
