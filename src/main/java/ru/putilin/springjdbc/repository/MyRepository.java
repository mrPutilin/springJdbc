package ru.putilin.springjdbc.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import ru.putilin.springjdbc.entity.Order;
import ru.putilin.springjdbc.utils.SqlReader;

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
//        return entityManager.createQuery("SELECT order from Order order " +
//                "inner join Customer customer ON order.customer_id = customer.id where customer.name = ?1", Order.class)
//                .setParameter(1, name)
//                .getResultList();
//         return entityManager.createQuery(script, String.class)
//                .setParameter("name", name.toLowerCase())
//                 .getResultList();

//        MapSqlParameterSource params = new MapSqlParameterSource("name", name);
//        return namedParameterJdbcTemplate.queryForList(script, params, String.class);
    }

}
