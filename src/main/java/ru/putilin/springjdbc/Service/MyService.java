package ru.putilin.springjdbc.Service;

import ru.putilin.springjdbc.Model.Product;
import ru.putilin.springjdbc.Repository.MyRepository;

import java.util.List;

@org.springframework.stereotype.Service
public class MyService {

    private final MyRepository repository;

    public MyService(MyRepository repository) {
        this.repository = repository;
    }

    public List<Product> getProductName(String name) {
        return repository.getProductName(name);
    }


}
