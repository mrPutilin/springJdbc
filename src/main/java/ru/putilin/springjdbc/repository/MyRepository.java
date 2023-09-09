package ru.putilin.springjdbc.repository;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import ru.putilin.springjdbc.utils.SqlReader;

import java.util.List;


@org.springframework.stereotype.Repository
public class MyRepository {

    private final String script;
    private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public MyRepository(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
        this.script = SqlReader.read("myScript.sql");
    }


    public List<String> getProductName(String name) {
        MapSqlParameterSource params = new MapSqlParameterSource("name", name);
        return namedParameterJdbcTemplate.queryForList(script, params, String.class);
    }

}
