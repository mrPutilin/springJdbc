package ru.putilin.springjdbc;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.putilin.springjdbc.entity.Order;

import java.util.List;

@SpringBootApplication
public class SpringJdbcApplication {

    @PersistenceContext

    public static void main(String[] args) {
        SpringApplication.run(SpringJdbcApplication.class, args);


    }

}
