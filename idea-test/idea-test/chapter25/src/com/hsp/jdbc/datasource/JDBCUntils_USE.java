package com.hsp.jdbc.datasource;

import com.hsp.jdbc.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCUntils_USE {
    public void testlect() throws SQLException {
        System.out.println("use druid..");
        Connection connection = null;
        String sql ="select * from actor";
        PreparedStatement preparedStatement =null;
        ResultSet set =null;
        preparedStatement = connection.prepareStatement(sql);

        preparedStatement =null;
        connection= JDBCUtils.getConnection();
        preparedStatement =connection.prepareStatement(sql);

        while (set.next()){
            int id =set.getInt("id");
            String name =set.getNString("name");
            String sex =set.getString("sex");
            //Date borndate=set.getString("borndate");
            String phone =set.getString("phone");
            System.out.println(id+"\t"+name+"\t"+sex+"\t"+"\t"+phone) ;
        }


        JDBCUtils.close(null,preparedStatement,connection);
    }{}



    public void testDML() throws SQLException {

        Connection  connection = null;

        //preparedStatement= connection.prepareStatement(sql);

        String sql ="update actor set name =? where id=?";
        PreparedStatement preparedStatement =null;

        preparedStatement.setString(1,"tom");
        preparedStatement.setInt(2,4);
        preparedStatement.executeUpdate();

        JDBCUtils.close(null,preparedStatement,connection);
    }
}


