package com.kh.model.dao;

import com.kh.model.common.JDBCTemplate;
import com.kh.model.vo.Department;
import com.kh.model.vo.Employee;
import com.kh.model.vo.Job;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class KhDao {
    private List<Employee> list = new ArrayList<>();
    private Properties pt = new Properties();


    public KhDao() {
        File f = new File("");
        String path = f.getAbsolutePath() + File.separator + "homework_JDBC";
        try {
            pt.load(new FileReader(path + File.separator + "sql" + File.separator +
                    "sql.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public List<Employee> searchAll(Connection conn) {
        PreparedStatement ptmt = null;
        ResultSet rs = null;

        try {
            ptmt = conn.prepareStatement(pt.getProperty("searchAll"));

            rs = ptmt.executeQuery();

            while (rs.next()) {
                Employee e = new Employee();
                e.setEmpId(rs.getString("EMP_ID"));
                e.setEmpName(rs.getString("EMP_NAME"));
                e.setEmpNo(rs.getString("EMP_NO"));
                e.setEmail(rs.getString("EMAIL"));
                e.setPhone(rs.getString("PHONE"));
                e.setDeptCode(rs.getString("DEPT_CODE"));
                e.setJobCode(rs.getString("JOB_CODE"));
                e.setSalLevel(rs.getString("SAL_LEVEL"));
                e.setSalary(rs.getInt("SALARY"));
                e.setBonus(rs.getFloat("BONUS"));
                e.setManagerId(rs.getString("MANAGER_ID"));
                e.setHireDate(rs.getString("HIRE_DATE"));
                e.setEntDate(rs.getString("ENT_DATE"));
                e.setEntYn(rs.getString("ENT_YN"));

                list.add(e);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCTemplate.close(rs);
            JDBCTemplate.close(ptmt);
            JDBCTemplate.close(conn);
        }

        return list;
    }

    public List<Employee> searchEmp(Connection conn, String str) {
        PreparedStatement ptmt = null;
        ResultSet rs = null;

        try {
            if (str.contains("D") || str.contains("d") || str.equals("null")) {
                ptmt = conn.prepareStatement(pt.getProperty("searchDept"));

            } else if (str.contains("J") || str.contains("j")) {
                ptmt = conn.prepareStatement(pt.getProperty("searchJob"));

            } else {
                ptmt = conn.prepareStatement(pt.getProperty("searchName"));
            }

            ptmt.setString(1, str);
            rs = ptmt.executeQuery();

            while (rs.next()) {
                Employee e = new Employee();
                e.setEmpId(rs.getString("EMP_ID"));
                e.setEmpName(rs.getString("EMP_NAME"));
                e.setEmpNo(rs.getString("EMP_NO"));
                e.setEmail(rs.getString("EMAIL"));
                e.setPhone(rs.getString("PHONE"));
                e.setDeptCode(rs.getString("DEPT_CODE"));
                e.setJobCode(rs.getString("JOB_CODE"));
                e.setSalLevel(rs.getString("SAL_LEVEL"));
                e.setSalary(rs.getInt("SALARY"));
                e.setBonus(rs.getFloat("BONUS"));
                e.setManagerId(rs.getString("MANAGER_ID"));
                e.setHireDate(rs.getString("HIRE_DATE"));
                e.setEntDate(rs.getString("ENT_DATE"));
                e.setEntYn(rs.getString("ENT_YN"));

                list.add(e);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCTemplate.close(rs);
            JDBCTemplate.close(ptmt);
            JDBCTemplate.close(conn);
        }

        return list;
    }

    public List<Employee> searchSalary(Connection conn, int salary, int lessOrMore) {
        PreparedStatement ptmt = null;
        ResultSet rs = null;

        try {
            if (lessOrMore == 1) {
                ptmt = conn.prepareStatement(pt.getProperty("moreSalary"));
            } else {
                ptmt = conn.prepareStatement(pt.getProperty("lessSalary"));
            }

            ptmt.setInt(1, salary);
            rs = ptmt.executeQuery();

            while (rs.next()) {
                Employee e = new Employee();
                e.setEmpId(rs.getString("EMP_ID"));
                e.setEmpName(rs.getString("EMP_NAME"));
                e.setEmpNo(rs.getString("EMP_NO"));
                e.setEmail(rs.getString("EMAIL"));
                e.setPhone(rs.getString("PHONE"));
                e.setDeptCode(rs.getString("DEPT_CODE"));
                e.setJobCode(rs.getString("JOB_CODE"));
                e.setSalLevel(rs.getString("SAL_LEVEL"));
                e.setSalary(rs.getInt("SALARY"));
                e.setBonus(rs.getFloat("BONUS"));
                e.setManagerId(rs.getString("MANAGER_ID"));
                e.setHireDate(rs.getString("HIRE_DATE"));
                e.setEntDate(rs.getString("ENT_DATE"));
                e.setEntYn(rs.getString("ENT_YN"));

                list.add(e);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCTemplate.close(rs);
            JDBCTemplate.close(ptmt);
            JDBCTemplate.close(conn);
        }

        return list;
    }


    public int insertEmp(Connection conn, Employee emp) {
        PreparedStatement ptmt = null;
        ResultSet rs = null;
        int result = 0;

        try {
            ptmt = conn.prepareStatement(pt.getProperty("insertEmp"));
            // sequence 이용해서 emp_id를 부여하기
            /*
            문제점
            1.sequence를 쓰려면 sequence를 생성해야함. 그때 이 메소드를
             호출했을때 생성하게하면 다음 사원등록할때
             sequence 이름이 중복됨 -> 오류 발생

             해결책
             1. sequence 한번만 생성하게 하면 되지만 그걸 언제해야할지 모르겠다.
                한번 생성하면 프로그램이 종료된 후 다시 실행하면
                또 중복 발생할텐데
                -> 실패
                아니면 sequence 가 있는지 없는지 확인해야할것같다.
            2. sql 쿼리문 작성할 떄 insert에서 서브쿼리 사용하기
                -> nvl(max(emp_id)+1,0)
                -> 쿼리문이 길어지지만 가능하다
                ---- > 문제점
                        1. 다른 쿼리문에의해 중복이 발생할 수 도 있다.
                         -> PrimaryKey 등록하면 중복 없다 -> 중복시 오류발생


             */

            ptmt.setString(1, emp.getEmpName());
            ptmt.setString(2, emp.getEmpNo());
            ptmt.setString(3, emp.getEmail());
            ptmt.setString(4, emp.getPhone());
            ptmt.setString(5, emp.getDeptCode());
            ptmt.setString(6, emp.getJobCode());
            ptmt.setString(7, emp.getSalLevel());
            ptmt.setInt(8, emp.getSalary());
            ptmt.setFloat(9, emp.getBonus());
            ptmt.setString(10, emp.getManagerId());

            result = ptmt.executeUpdate();

            if (result > 0) conn.commit();
            else conn.rollback();

//           stmt = conn.createStatement();
//           result = stmt.executeUpdate(pt.getProperty("insertEmp")+
//                   emp.getEMP_NAME()+emp.getEMP_NO()+emp.getEMAIL()+emp.getPHONE()+
//                   emp.getDEPT_CODE()+emp.getJOB_CODE()+emp.getSAL_LEVEL()+emp.getSALARY()+
//                    emp.getBONUS()+"'sysdate'"+"'sysdate'");

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCTemplate.close(ptmt);
            JDBCTemplate.close(conn);
        }

        return result;
    }

    public int reviseEmp(Connection conn, String name, String str) {
        PreparedStatement ptmt = null;
        int result = 0;

        try {
            if (str.contains("D") || str.contains("d") || str.equals("null")) {
                ptmt = conn.prepareStatement(pt.getProperty("reviseDept"));

            } else if (str.contains("J") || str.contains("j")) {
                ptmt = conn.prepareStatement(pt.getProperty("reviseJob"));

            } else {
                ptmt = conn.prepareStatement(pt.getProperty("reviseName"));
            }
            ptmt.setString(1, str);
            ptmt.setString(2, name);

            result = ptmt.executeUpdate();
            if (result > 0) conn.commit();
            else conn.rollback();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCTemplate.close(ptmt);
            JDBCTemplate.close(conn);
        }

        return result;
    }

    public int reviseEmp(Connection conn, String name, int salary) {
        PreparedStatement ptmt = null;
        int result = 0;

        try {
            ptmt = conn.prepareStatement(pt.getProperty("reviseSalary"));
            ptmt.setInt(1, salary);
            ptmt.setString(2, name);

            result = ptmt.executeUpdate();
            if (result > 0) conn.commit();
            else conn.rollback();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCTemplate.close(ptmt);
            JDBCTemplate.close(conn);
        }

        return result;
    }

    public int deleteEmp(Connection conn, String name) {
        PreparedStatement ptmt = null;
        int result = 0;
        try {
            ptmt = conn.prepareStatement(pt.getProperty("deleteEmp"));
            ptmt.setString(1, name);

            result = ptmt.executeUpdate();

            if (result > 0) conn.commit();
            else conn.rollback();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCTemplate.close(ptmt);
            JDBCTemplate.close(conn);
        }

        return result;
    }

    public int manageEnrollDept(Connection conn, Department dp) {
        PreparedStatement ptmt = null;
        int result = 0;
        try {
            ptmt = conn.prepareStatement(pt.getProperty("manageEnrollDept"));
            ptmt.setString(1, dp.getDeptId());
            ptmt.setString(2, dp.getDeptTitle());
            ptmt.setString(3, dp.getLocationId());

            result = ptmt.executeUpdate();

            if (result > 0) conn.commit();
            else conn.rollback();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCTemplate.close(ptmt);
            JDBCTemplate.close(conn);
        }

        return result;
    }

    public int manageReviseDeptCode(Connection conn, String[] deptCode) {
        PreparedStatement ptmt = null;
        int result = 0;

        try {
            ptmt = conn.prepareStatement(pt.getProperty("manageReviseDeptCode"));
            String originDeptCode= deptCode[0];
            String reviseDeptCode= deptCode[1];
            ptmt.setString(1,reviseDeptCode);
            ptmt.setString(2,originDeptCode);

            result = ptmt.executeUpdate();

            if (result > 0) conn.commit();
            else conn.rollback();
        }catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCTemplate.close(ptmt);
            JDBCTemplate.close(conn);
        }

        return result;
    }
    public int manageReviseDeptTitle(Connection conn, String[] deptTitle) {
        PreparedStatement ptmt = null;
        int result = 0;

        try {
            ptmt = conn.prepareStatement(pt.getProperty("manageReviseDeptTitle"));
            String originDeptTitle= deptTitle[0];
            String reviseDeptTitle= deptTitle[1];
            ptmt.setString(1,reviseDeptTitle);
            ptmt.setString(2,originDeptTitle);

            result = ptmt.executeUpdate();

            if (result > 0) conn.commit();
            else conn.rollback();
        }catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCTemplate.close(ptmt);
            JDBCTemplate.close(conn);
        }

        return result;
    }
    public int manageReviseLocationCode(Connection conn, String[] locationCode) {
        PreparedStatement ptmt = null;
        int result = 0;

        try {
            ptmt = conn.prepareStatement(pt.getProperty("manageReviseLocationCode"));
            String originLocationCode= locationCode[0];
            String reviseLocationCode= locationCode[1];
            ptmt.setString(1,reviseLocationCode);
            ptmt.setString(2,originLocationCode);

            result = ptmt.executeUpdate();

            if (result > 0) conn.commit();
            else conn.rollback();
        }catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCTemplate.close(ptmt);
            JDBCTemplate.close(conn);
        }

        return result;
    }

    public int manageDeleteDept(Connection conn,String delete){
        PreparedStatement ptmt = null;
        int result = 0;
        try {
            ptmt = conn.prepareStatement(pt.getProperty("manageDeleteDept"));
            ptmt.setString(1, delete);

            result = ptmt.executeUpdate();

            if (result > 0) conn.commit();
            else conn.rollback();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCTemplate.close(ptmt);
            JDBCTemplate.close(conn);
        }

        return result;
    }

    public int manageEnrollJob(Connection conn, Job dp) {
        PreparedStatement ptmt = null;
        int result = 0;
        try {
            ptmt = conn.prepareStatement(pt.getProperty("manageEnrollJob"));
            ptmt.setString(1, dp.getJobCode());
            ptmt.setString(2, dp.getJobName());

            result = ptmt.executeUpdate();

            if (result > 0) conn.commit();
            else conn.rollback();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCTemplate.close(ptmt);
            JDBCTemplate.close(conn);
        }

        return result;
    }


    public int manageReviseJobCode(Connection conn, String[] jobCode) {
        PreparedStatement ptmt = null;
        int result = 0;

        try {
            ptmt = conn.prepareStatement(pt.getProperty("manageReviseJobCode"));
            String originJobCode= jobCode[0];
            String reviseJobCode= jobCode[1];
            ptmt.setString(1,reviseJobCode);
            ptmt.setString(2,originJobCode);

            result = ptmt.executeUpdate();

            if (result > 0) conn.commit();
            else conn.rollback();
        }catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCTemplate.close(ptmt);
            JDBCTemplate.close(conn);
        }

        return result;
    }
    public int manageReviseJobTitle(Connection conn, String[] jobTitle) {
        PreparedStatement ptmt = null;
        int result = 0;

        try {
            ptmt = conn.prepareStatement(pt.getProperty("manageReviseJobTitle"));
            String originJobCode= jobTitle[0];
            String reviseJobCode= jobTitle[1];
            ptmt.setString(1,reviseJobCode);
            ptmt.setString(2,originJobCode);

            result = ptmt.executeUpdate();

            if (result > 0) conn.commit();
            else conn.rollback();
        }catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCTemplate.close(ptmt);
            JDBCTemplate.close(conn);
        }

        return result;
    }

    public int manageDeleteJob(Connection conn,String delete){
        PreparedStatement ptmt = null;
        int result = 0;
        try {
            ptmt = conn.prepareStatement(pt.getProperty("manageDeleteJob"));
            ptmt.setString(1, delete);

            result = ptmt.executeUpdate();

            if (result > 0) conn.commit();
            else conn.rollback();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCTemplate.close(ptmt);
            JDBCTemplate.close(conn);
        }

        return result;
    }


}
