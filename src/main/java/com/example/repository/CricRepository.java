package com.example.repository;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.model.Cricket;
@Repository
public class CricRepository {
      
      
        private JdbcTemplate jdbcTemplate;
    
            public CricRepository(JdbcTemplate jdbcTemplate) {
                this.jdbcTemplate = jdbcTemplate;
            }
    
            public int save(Cricket cricket) {
    
                String sql =
                        "insert into cricket(name,country,runs) values(?,?,?)";
    
                return jdbcTemplate.update(sql,
                        cricket.getName(),
                        cricket.getCountry(),
                        cricket.getRuns());
            }
    
            public List<Cricket> findAll() {
    
                String sql="select * from cricket";
    
                return jdbcTemplate.query(sql,
                        new BeanPropertyRowMapper<>(Cricket.class));
            }
    
            public Cricket findById(int id){
    
                String sql="select * from cricket where id=?";
    
                return jdbcTemplate.queryForObject(
                        sql,
                        new BeanPropertyRowMapper<>(Cricket.class),
                        id);
            }
    
            public int update(Cricket cricket){
    
                String sql=
                        "update cricket set name=?,country=?,runs=? where id=?";
    
                return jdbcTemplate.update(sql,
                        cricket.getName(),
                        cricket.getCountry(),
                        cricket.getRuns (),
                        cricket.getId());
            }
}
