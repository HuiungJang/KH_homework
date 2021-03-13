package com.kh.model.service;

import com.kh.model.common.JDBCTemplate;
import com.kh.model.dao.KhDao;
import com.kh.model.vo.Department;
import com.kh.model.vo.Employee;
import com.kh.model.vo.Job;

import java.sql.Connection;
import java.util.List;

public class KhService {
    private Employee e = new Employee();
    private KhDao dao = new KhDao();

    public List<Employee> searchAll(){
        Connection conn = JDBCTemplate.getConnection();
        return dao.searchAll(conn);
    }

    public List<Employee> searchDept(String dept){
        Connection conn = JDBCTemplate.getConnection();
        return dao.searchEmp(conn,dept);
    }

    public List<Employee> searchJob(String job){
        Connection conn = JDBCTemplate.getConnection();
        return dao.searchEmp(conn,job);
    }

    public List<Employee> searchName(String name){
        Connection conn = JDBCTemplate.getConnection();
        return dao.searchEmp(conn,name);
    }

    public List<Employee> searchSalary(int salary,int lessOrMore){
        Connection conn = JDBCTemplate.getConnection();
        return dao.searchSalary(conn,salary,lessOrMore);
    }

    public int insertEmp(Employee e){
        Connection conn = JDBCTemplate.getConnection();
        return dao.insertEmp(conn,e);
    }

    public int reviseDept(String name,String reviseDept){
        Connection conn = JDBCTemplate.getConnection();
        return dao.reviseEmp(conn,name,reviseDept);
    }

    public int reviseJob(String name,String reviseJob){
        Connection conn = JDBCTemplate.getConnection();
        return dao.reviseEmp(conn,name,reviseJob);
    }

    public int reviseName(String name, String reviseName){
        Connection conn = JDBCTemplate.getConnection();
        return dao.reviseEmp(conn,name,reviseName);
    }

    public int reviseSalary(String name, int salary){
        Connection conn = JDBCTemplate.getConnection();
        return dao.reviseEmp(conn,name,salary);
    }

    public int deleteEmp(String name){
        Connection conn = JDBCTemplate.getConnection();
        int result =  dao.deleteEmp(conn,name);
        return result;
    }

    public int manageEnrollDept(Department dp){
        Connection conn = JDBCTemplate.getConnection();
        return dao.manageEnrollDept(conn,dp);
    }

    public int manageReviseDeptCode(String[] deptCode){
        Connection conn = JDBCTemplate.getConnection();
        return dao.manageReviseDeptCode(conn,deptCode);
    }
    public int manageReviseDeptTitle(String[] deptTitle){
        Connection conn = JDBCTemplate.getConnection();
        return dao.manageReviseDeptTitle(conn,deptTitle);
    }
    public int manageReviseLocationCode(String[] locationCode){
        Connection conn = JDBCTemplate.getConnection();
        return dao.manageReviseLocationCode(conn,locationCode);
    }

    public int manageDeleteDept(String delete){
        Connection conn = JDBCTemplate.getConnection();
        return dao.manageDeleteDept(conn,delete);
    }

    public int manageEnrollJob(Job j){
        Connection conn = JDBCTemplate.getConnection();
        return dao.manageEnrollJob(conn,j);
    }

    public int manageReviseJobCode(String[] JobCode){
        Connection conn = JDBCTemplate.getConnection();
        return dao.manageReviseJobCode(conn,JobCode);
    }
    public int manageReviseJobTitle(String[] JobTitle){
        Connection conn = JDBCTemplate.getConnection();
        return dao.manageReviseJobTitle(conn,JobTitle);
    }
    public int manageDeleteJob(String delete){
        Connection conn = JDBCTemplate.getConnection();
        return dao.manageDeleteJob(conn,delete);
    }

}
