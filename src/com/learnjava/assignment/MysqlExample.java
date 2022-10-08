package com.learnjava.assignment;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class MysqlExample {
    public void connect() {
        Connection conn = null;
        try(FileInputStream f = new FileInputStream("C:\\workspace\\db.properties")) {
            Properties pros = new Properties();
            pros.load(f);
            String url       = pros.getProperty("url");
            String user      = pros.getProperty("user");
            String password  = pros.getProperty("password");
            conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();
            String sql = "SELECT customerId, customerName, city " +
                    "FROM customers";
            String sql1 = "INSERT INTO customers " +
                    "(customerName, contactName, city) " +
                    "VALUES('James', 'Miller', 'Berlin') ";

            String sqlUpdate = "UPDATE customers "
                    + "SET customerName = ? "
                    + "WHERE customerId = ?";
            PreparedStatement pstmt = conn.prepareStatement(sqlUpdate);
            pstmt.setString(1, "Desmond");
            pstmt.setInt(2, 3);
            int result = pstmt.executeUpdate();
            System.out.println("----"+result);
            /*while(rs.next()) {
                int id = rs.getInt("customerId");
                String name = rs.getString("customerName");
                String city = rs.getString("city");
                System.out.println(String.format("%s | %s | %s", id, name, city));
            }
            rs.close();*/
            stmt.close();
            //.out.println(conn);
        } catch(SQLException  | IOException e) {
            System.out.println(e.getMessage());
        }
        //return conn;
    }

}
