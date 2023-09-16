package com.hsp.jdbc.datasource;

import com.hsp.jdbc.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBCUntils_USE {
    public  void testQueryMany() throws SQLException {
        Connection connection = JDBCUtilsByDruid.geConnection();


    }
}
