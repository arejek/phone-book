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
            repository.saveAll(List.of(
                    new Contact("Robert", "Lewandowski", "009 009 009"),
                    new Contact("Arkadiusz", "Milik", "007 007 007"),
                    new Contact("Piotr", "Zieliński", "020 020 020")));
        };
    }
}
