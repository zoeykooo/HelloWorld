package com.hsp.jdbc.datasource;

import com.mchange.v2.c3p0.ConnectionCustomizer;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCUtilsByDruid {

    private  static DataSource ds;

    static {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("scr\\druid.properties"));
           // ds=DruidDataSourceFactory.createDataSource(properties);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public  static Connection geConnection() throws SQLException {
        return ds.getConnection();
    }
    public  static  void  close(ResultSet resultSet, Statement statement, Connection connection) throws SQLException {
        if(resultSet !=null){
            resultSet.close();
            if (statement != null){
                statement.close();
                if (connection !=null){
                    connection.close();
                }
            }
        }
    }

}
