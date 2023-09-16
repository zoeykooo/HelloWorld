package com.hsp.jdbc.Statement_;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.ScatteringByteChannel;
import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

public class PrepareStatement {
    public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("输入管理员名字:");
        String admin_name =scanner.nextLine();
        System.out.println("输入管理员密码:");
        String admin_pwd =scanner.nextLine();

        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\mysql.properites"));
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");
        Class.forName("con.mysql.jdbc.Driver");

        Connection connection = DriverManager.getConnection(url, user, password);


        String sql = "select name,pwd from admin where name ?= and pwd=?";
        //String sql ="insert into admin values(?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        preparedStatement.setString(1,admin_name);
        preparedStatement.setString(2,admin_pwd);

        ResultSet resultSet = preparedStatement.executeQuery(sql);
        if (resultSet.next()){
            System.out.println("success");
        }else {
            System.out.println("non-success");
        }
        resultSet.close();
        preparedStatement.close();
        connection.close();
    }
}



