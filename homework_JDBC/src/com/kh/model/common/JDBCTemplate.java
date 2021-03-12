package com.kh.model.common;

import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class JDBCTemplate {


    public static Connection getConnection(){
        Connection conn = null;
        Properties pt = new Properties();

        try{
            String path = JDBCTemplate.class.getResource("").getPath();
            pt.load(new FileReader(path+"JDBCTemplate.properties"));

            Class.forName(pt.getProperty("driver"));
            conn = DriverManager.getConnection(pt.getProperty("url"),pt.getProperty("id"),
                    pt.getProperty("pw"));

            conn.setAutoCommit(false);

        }catch (IOException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }catch (SQLException e){
            e.printStackTrace();
        }

        return conn;
    }

    public static void close(Connection conn){
        try{
            if(!conn.isClosed() && conn != null) conn.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static void close(Statement stmt){
        try{
            if(!stmt.isClosed() && stmt != null) stmt.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static void close(ResultSet rs){
        try{
            if(!rs.isClosed() && rs != null) rs.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static void commit(Connection conn){
        try {
            if(!conn.isClosed() && conn != null) conn.commit();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static void rollback(Connection conn){
        try {
            if(!conn.isClosed() && conn != null) conn.rollback();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }


}
