package ru.putilin.springjdbc.service;

import ru.putilin.springjdbc.repository.MyRepository;

import java.util.List;

@org.springframework.stereotype.Service
public class MyService {

    private final MyRepository repository;

    public MyService(MyRepository repository) {
        this.repository = repository;
    }

    public List<String> getProductName(String name) {
        return repository.getProductName(name);
    }


}
