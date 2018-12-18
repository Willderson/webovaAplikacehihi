package cz.jh.sos;

import cz.jh.sos.model.Customer;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

import java.util.List;

public class JdbcTemplate {
    public Customer queryForObject(String s, Object[] objects, BeanPropertyRowMapper<Customer> customerBeanPropertyRowMapper) {
    }

    public List<Customer> query(String s, Object[] objects, BeanPropertyRowMapper<Customer> customerBeanPropertyRowMapper) {
    }
}
