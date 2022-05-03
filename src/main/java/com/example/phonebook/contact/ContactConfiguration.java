package com.example.phonebook.contact;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ContactConfiguration {

    @Bean
    CommandLineRunner commandLineRunner(ContactRepository repository){
        return args -> {
            Contact contact = new Contact(1L, "Robert", "Lewandowski", 9);
            repository.saveAll(List.of(contact));
        };
    }
}
