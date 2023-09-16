package com.hsp.jdbc.transaction;

import com.hsp.jdbc.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Transation_ {

    public void  noTransation() throws SQLException {


            Connection connection = null;

            //preparedStatement= connection.prepareStatement(sql);

            String sql ="update account set balance =balance-100 where id=1";
        String sql2 ="update account set balance =balance+100 where id=2";
            PreparedStatement preparedStatement =null;
            connection =JDBCUtils.getConnection();
        preparedStatement = connection.prepareStatement(sql);
        preparedStatement.executeUpdate();
        preparedStatement =null;
        connection= JDBCUtils.getConnection();
        preparedStatement =connection.prepareStatement(sql2);
        preparedStatement.executeUpdate();
        JDBCUtils.close(null,preparedStatement,connection);
        }

    }

