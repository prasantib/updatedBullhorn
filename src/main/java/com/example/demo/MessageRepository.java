package com.example.demo;

import org.springframework.data.repository.CrudRepository;

import java.util.Map;

public class MessageRepository {
    public Object findAll() {
    }

    public Map<Object, Object> findById(long id) {
    }

    public void save(Message message) {
    }

    public void deleteById(long id) {
    }

    public interface MessageRepository extends CrudRepository<Message, Long> {}
}
