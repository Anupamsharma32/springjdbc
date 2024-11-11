package com.spring.jdbc;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.dao.StudentDaoImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class javaconfig {
    @Bean("ds")
    public DataSource getDataSource(){
             DriverManagerDataSource driverManagerDataSource=new DriverManagerDataSource();

             driverManagerDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
             driverManagerDataSource.setUrl("Jdbc:MySQL://localhost:3306/springdatabase");
             driverManagerDataSource.setPassword("root");
             driverManagerDataSource.setUsername("root");
             return driverManagerDataSource;

    }
    @Bean("jdbcTemplate")
    public JdbcTemplate getTemplate(){
         JdbcTemplate jdbcTemplate=new JdbcTemplate();
         jdbcTemplate.setDataSource(getDataSource());
         return jdbcTemplate;
    }
    @Bean("studentDao")
    public StudentDao getStudentDao(){
             StudentDaoImpl studentDao=new StudentDaoImpl();
             studentDao.setJdbcTemplate(getTemplate());
             return studentDao;
    }

}
