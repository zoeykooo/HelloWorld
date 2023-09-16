package com.hsp.jdbc.datasource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.beans.PropertyVetoException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class C3P0_ {

    public void C3P0_01() {
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();

        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("src\\mysql.properties"));

            String user = properties.getProperty("user");
            String password = properties.getProperty("password");
            String url = properties.getProperty("url");
            String driver = properties.getProperty("driver");

            comboPooledDataSource.setDriverClass(driver);
            comboPooledDataSource.setJdbcUrl(url);
            comboPooledDataSource.setUser(user);
            comboPooledDataSource.setPassword(password);

            comboPooledDataSource.setInitialPoolSize(10);
            comboPooledDataSource.setMaxPoolSize(50);
            Connection connection = comboPooledDataSource.getConnection();
            System.out.println("success");
            connection.close();


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (PropertyVetoException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    public void C3P0_02() throws SQLException {
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource("hello");
        Connection connection = comboPooledDataSource.getConnection();
        long start =System.currentTimeMillis();
        for (int i=0;i<5000;i++){
            Connection connection1 = comboPooledDataSource.getConnection();
        //System.out.println("success");
        connection.close();

            long end =System.currentTimeMillis();
            System.out.println("c3p0 222="+(end-start));
        }


    }
}
