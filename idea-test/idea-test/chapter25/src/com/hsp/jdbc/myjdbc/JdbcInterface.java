package com.hsp.jdbc.myjdbc;

public interface JdbcInterface {
    public Object getConnection();
    public  void  crud();
    public void close();

}
