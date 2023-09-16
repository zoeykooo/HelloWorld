package com.hsp.jdbc.batch_;

import com.hsp.jdbc.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Batch_ {
    public void nobatch() throws SQLException {
        Connection connection = JDBCUtils.getConnection();
        String sql ="insert into admin2 values(null,?,?)";
        PreparedStatement preparedStatement =connection.prepareStatement(sql);
        System.out.println("start");
        long start =System.currentTimeMillis();
        for (int i=0;i<5000;i++){
            preparedStatement.setString(1,"jack"+i);
            preparedStatement.setString(2,"666");
            preparedStatement.executeUpdate();
            long end =System.currentTimeMillis();
            System.out.println("传统的方式 ="+(end -start));

            JDBCUtils.close(null,preparedStatement,connection);

        }
    }

        public void batch() throws Exception {
            Connection connection = JDBCUtils.getConnection();
            String sql ="insert into admin2 values(null,?,?)";
            PreparedStatement preparedStatement =connection.prepareStatement(sql);
            System.out.println("start");
            long start =System.currentTimeMillis();
            for (int i=0;i<5000;i++){
                preparedStatement.setString(1,"jack"+i);
                preparedStatement.setString(2,"666");
                //preparedStatement.executeUpdate();
                preparedStatement.addBatch();
                if((i+1)%1000== 0){preparedStatement.executeBatch();
                    preparedStatement.executeBatch();
                }
                long end =System.currentTimeMillis();
                System.out.println("batch方式 ="+(end -start));

                JDBCUtils.close(null,preparedStatement,connection);
    }
    }
}

