package com.hsp.jdbc;

import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Jdbc01 {
    public static void main(String[] args) throws SQLException {
        Driver driver = new Driver();
        String url ="jdbc:mysql://localhost:3306/hbj_db02";
        Properties properties = new Properties();
        properties.setProperty("user","root");
        properties.setProperty("password","123123");

        Connection connect = driver.connect(url, properties);

        String sql ="insert into actor values(null,'刘德华','n','1970-11-11','110')";

        Statement statement = connect.createStatement();
        int rows = statement.executeUpdate(sql);
        System.out.println(rows >0?"ok":"no");

        statement.close();
        connect.close();


    }
}
