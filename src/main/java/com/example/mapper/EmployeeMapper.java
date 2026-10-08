package com.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.example.pojo.Employee;

import java.util.List;

@Mapper
public interface EmployeeMapper {

    List<Employee> queryAll();
}
