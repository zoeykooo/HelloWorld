package com.hsp.jdbc.datasource;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Druid_ {

    public void testDruid() throws IOException {
    Properties properties=new Properties();
    properties.load(new FileInputStream("scr\\druid.properties"));

    //DataSource dataSource =DcreateDAtaSource(properties);
    }

}
