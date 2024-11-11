package com.spring.jdbc.dao;

import com.spring.jdbc.entities.Student;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RowMapperImpl implements RowMapper<Student> {


    @Override
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
        Student student = new Student();
        student.setId(rs.getInt("id"));   // Use the actual column name "id"
        student.setName(rs.getString("name"));  // Use the actual column name "name"
        student.setCity(rs.getString("city"));  // Use the actual column name "city"
        return student;
    }

}
