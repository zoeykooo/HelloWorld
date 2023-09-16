package com.hsp.jdbc;

import com.mysql.jdbc.Driver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JdbcConn {
    public void connect01() throws SQLException {
        Driver driver = new Driver();
        String url ="jdbc:mysql://localhost:3306/hbj_db02";
        Properties properties = new Properties();
        properties.setProperty("user","root");
        properties.setProperty("password","123123");

        Connection connect = driver.connect(url, properties);
        System.out.println(connect);}


        public void connect02() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
            Class<?> url = Class.forName("com.mysql.jdbc.Driver");
           Driver driver = (Driver) url.newInstance();
            Properties properties = new Properties();
            properties.setProperty("user","root");
            properties.setProperty("password","123123");

            Connection connect = driver.connect(String.valueOf(url), properties);
            System.out.println("2="+connect);




        }


       public  void  connect03() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
           Class<?> aClass = Class.forName("com.mysql.jdbc.Driver");
           Driver driver = (Driver) aClass.newInstance();

           String url ="jdbc:mysql://localhost:3306/hbj_db02";
           String user ="root";
           String password ="123123";
           DriverManager.registerDriver(driver);
           Connection connection = DriverManager.getConnection(url, user, password);
           System.out.println("3="+connection);


       }
       public void connect04() throws ClassNotFoundException, SQLException {
       Class.forName("com.mysql.jdbc.Driver");

           String url ="jdbc:mysql://localhost:3306/hbj_db02";
           String user ="root";
           String password ="123123";

           Connection connection = DriverManager.getConnection(url, user, password);
           System.out.println("4="+connection);
    }
        public void connect05() throws IOException, ClassNotFoundException, SQLException {

            Properties properties = new Properties();
            properties.load(new FileInputStream("src\\mysql.properites"));
            String user =properties.getProperty("user");
            String password =properties.getProperty("password");
            String driver =properties.getProperty("driver");
            String url =properties.getProperty("url");

            Class.forName("con.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("5="+connection);

        }

    }

