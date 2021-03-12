package com.kh.model.dao;

import com.kh.model.common.JDBCTemplate;
import com.kh.model.vo.Employee;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class KhDao {
    private Properties pt = new Properties();
    private List<Employee> list = new ArrayList<>();
    private PreparedStatement ptmt = null;
    private ResultSet rs = null;

    public KhDao() {
        File f = new File("");
        String path = f.getAbsolutePath()+File.separator+"homework_JDBC";
        try{
            pt.load(new FileReader(path+File.separator+"sql"+File.separator+
                    "sql.properties"));
        }catch(IOException e){
            e.printStackTrace();
        }

    }

    public List<Employee> searchAll(Connection conn){

        try{
           ptmt = conn.prepareStatement(pt.getProperty("searchAll"));

           rs = ptmt.executeQuery();

           while(rs.next()){
               Employee e = new Employee();
               e.setEMP_ID(rs.getString("EMP_ID"));
               e.setEMP_NAME(rs.getString("EMP_NAME"));
               e.setEMP_NO(rs.getString("EMP_NO"));
               e.setEMAIL(rs.getString("EMAIL"));
               e.setPHONE(rs.getString("PHONE"));
               e.setDEPT_CODE(rs.getString("DEPT_CODE"));
               e.setJOB_CODE(rs.getString("JOB_CODE"));
               e.setSAL_LEVEL(rs.getString("SAL_LEVEL"));
               e.setSALARY(rs.getInt("SALARY"));
               e.setBONUS(rs.getFloat("BONUS"));
               e.setMANAGER_ID(rs.getInt("MANAGER_ID"));
               e.setHIRE_DATE(rs.getString("HIRE_DATE"));
               e.setENT_DATE(rs.getString("ENT_DATE"));
               e.setENT_YN(rs.getString("ENT_YN"));

               list.add(e);
           }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            JDBCTemplate.close(rs);
            JDBCTemplate.close(ptmt);
            JDBCTemplate.close(conn);
        }

        return list;
    }

    public List<Employee> searchEmp(Connection conn,String str){

        try{
           if(str.contains("D")||str.contains("d")||str.equals("null")) {
               ptmt = conn.prepareStatement(pt.getProperty("searchDept"));

           }else if(str.contains("J")||str.contains("j")) {
               ptmt = conn.prepareStatement(pt.getProperty("searchJob"));

            }else{
               ptmt = conn.prepareStatement(pt.getProperty("searchName"));
           }

            ptmt.setString(1, str);
            rs = ptmt.executeQuery();

            while(rs.next()){
                Employee e = new Employee();
                e.setEMP_ID(rs.getString("EMP_ID"));
                e.setEMP_NAME(rs.getString("EMP_NAME"));
                e.setEMP_NO(rs.getString("EMP_NO"));
                e.setEMAIL(rs.getString("EMAIL"));
                e.setPHONE(rs.getString("PHONE"));
                e.setDEPT_CODE(rs.getString("DEPT_CODE"));
                e.setJOB_CODE(rs.getString("JOB_CODE"));
                e.setSAL_LEVEL(rs.getString("SAL_LEVEL"));
                e.setSALARY(rs.getInt("SALARY"));
                e.setBONUS(rs.getFloat("BONUS"));
                e.setMANAGER_ID(rs.getInt("MANAGER_ID"));
                e.setHIRE_DATE(rs.getString("HIRE_DATE"));
                e.setENT_DATE(rs.getString("ENT_DATE"));
                e.setENT_YN(rs.getString("ENT_YN"));

                list.add(e);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            JDBCTemplate.close(rs);
            JDBCTemplate.close(ptmt);
            JDBCTemplate.close(conn);
        }

        return list;
    }

    public List<Employee> searchSalary(Connection conn,int salary,int lessOrMore){

        try{
            if(lessOrMore == 1) {
                ptmt = conn.prepareStatement(pt.getProperty("moreSalary"));
            }else{
                ptmt = conn.prepareStatement(pt.getProperty("lessSalary"));
            }

            ptmt.setInt(1, salary);
            rs = ptmt.executeQuery();

            while(rs.next()){
                Employee e = new Employee();
                e.setEMP_ID(rs.getString("EMP_ID"));
                e.setEMP_NAME(rs.getString("EMP_NAME"));
                e.setEMP_NO(rs.getString("EMP_NO"));
                e.setEMAIL(rs.getString("EMAIL"));
                e.setPHONE(rs.getString("PHONE"));
                e.setDEPT_CODE(rs.getString("DEPT_CODE"));
                e.setJOB_CODE(rs.getString("JOB_CODE"));
                e.setSAL_LEVEL(rs.getString("SAL_LEVEL"));
                e.setSALARY(rs.getInt("SALARY"));
                e.setBONUS(rs.getFloat("BONUS"));
                e.setMANAGER_ID(rs.getInt("MANAGER_ID"));
                e.setHIRE_DATE(rs.getString("HIRE_DATE"));
                e.setENT_DATE(rs.getString("ENT_DATE"));
                e.setENT_YN(rs.getString("ENT_YN"));

                list.add(e);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            JDBCTemplate.close(rs);
            JDBCTemplate.close(ptmt);
            JDBCTemplate.close(conn);
        }

        return list;
    }
    public void sequence(Connection conn){
        try {
            ptmt = conn.prepareStatement(pt.getProperty("createSequence"));
            ptmt.executeQuery();
        }catch (SQLException e){
           e.printStackTrace();
        }finally {
            JDBCTemplate.close(ptmt);
            JDBCTemplate.close(conn);
        }
    }
    public int insertEmp(Connection conn, Employee emp){
        int result = 0;
        try{
            sequence(conn);
            ptmt = conn.prepareStatement(pt.getProperty("insertEmp"));
            ptmt.setString(1,emp.getEMP_NAME());
            ptmt.setString(2,emp.getEMP_NO());
            ptmt.setString(3,emp.getEMAIL());
            ptmt.setString(4,emp.getPHONE());
            ptmt.setString(5, emp.getJOB_CODE());
            ptmt.setString(6,emp.getSAL_LEVEL());
            ptmt.setInt(7,emp.getSALARY());
            ptmt.setFloat(8,emp.getBONUS());
            ptmt.setInt(9,emp.getMANAGER_ID());

            result = ptmt.executeUpdate();

            if(result > 0){
                conn.commit();
            }else conn.rollback();

//           stmt = conn.createStatement();
//           result = stmt.executeUpdate(pt.getProperty("insertEmp")+
//                   emp.getEMP_NAME()+emp.getEMP_NO()+emp.getEMAIL()+emp.getPHONE()+
//                   emp.getDEPT_CODE()+emp.getJOB_CODE()+emp.getSAL_LEVEL()+emp.getSALARY()+
//                    emp.getBONUS()+"'sysdate'"+"'sysdate'");

        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            JDBCTemplate.close(ptmt);
            JDBCTemplate.close(conn);
        }

        return result;
    }


}
