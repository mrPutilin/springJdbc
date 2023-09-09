package ru.putilin.springjdbc.Repository;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import ru.putilin.springjdbc.Model.Product;
import ru.putilin.springjdbc.Utils.SqlReader;

import java.util.List;


@org.springframework.stereotype.Repository
public class MyRepository {

    private final static String script = "myScript.sql";

    private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public MyRepository(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
    }


    public List<Product> getProductName(String name) {
        String product = SqlReader.read(script);
        MapSqlParameterSource params = new MapSqlParameterSource("name", name);
        List<Product> productName = namedParameterJdbcTemplate.query(product, params,
                (rs, rowNum) -> new Product(rs.getString("product_name")));
        return productName;
    }

}
