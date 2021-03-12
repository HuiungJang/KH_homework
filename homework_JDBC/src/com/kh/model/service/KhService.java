package com.kh.model.service;

import com.kh.model.common.JDBCTemplate;
import com.kh.model.dao.KhDao;
import com.kh.model.vo.Employee;

import java.sql.Connection;
import java.util.List;

public class KhService {
    private Employee e = new Employee();
    private KhDao dao = new KhDao();
    private Connection conn = JDBCTemplate.getConnection();

    public List<Employee> searchAll(){
        return dao.searchAll(conn);
    }

    public List<Employee> searchDept(String dept){
        return dao.searchEmp(conn,dept);
    }

    public List<Employee> searchJob(String job){
        return dao.searchEmp(conn,job);
    }

    public List<Employee> searchName(String name){
        return dao.searchEmp(conn,name);
    }

    public List<Employee> searchSalary(int salary,int lessOrMore){
        return dao.searchSalary(conn,salary,lessOrMore);
    }

    public int insertEmp(Employee e){
        return dao.insertEmp(conn,e);
    }



}
