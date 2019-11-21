package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    @Autowired
    MessageRepository repository;

    @Override
    public void run(String... strings) throws Exception{
        Message message;
        message = new Message("prasanti", "Hi how are you", "july 22 2019", "prasanti babu");
        repository.save(message);

        message = new Message("dear", "I am fine", "december 5 2019", "john smith");
        repository.save(message);
    }
}
