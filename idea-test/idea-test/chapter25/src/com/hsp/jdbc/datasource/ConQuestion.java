package com.hsp.jdbc.datasource;

import com.hsp.jdbc.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.SQLException;

public class ConQuestion {

    public  void testCon() throws SQLException {
        long start =System.currentTimeMillis();
        for(int i=0;i<5000;i++){

            Connection connection = JDBCUtils.getConnection();
            String sql ="";

            JDBCUtils.close(null,null,connection);
        }
        long end=System.currentTimeMillis();
        System.out.println("time ="+(end -start));
    }
}
