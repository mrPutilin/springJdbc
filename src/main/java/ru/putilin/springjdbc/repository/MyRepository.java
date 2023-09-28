package ru.putilin.springjdbc.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.util.List;


@org.springframework.stereotype.Repository
public class MyRepository {


    @PersistenceContext
    private EntityManager entityManager;

    public MyRepository() {
    }


    public List<String> getProductName(String name) {
        String query = "SELECT order.productName from Order order inner join Customer customer " +
                "ON order.customerId = customer.id where customer.name ilike ?1";
        List<String> products = entityManager.createQuery(query, String.class)
                .setParameter(1, name)
                .getResultList();
        return products;

    }

}
