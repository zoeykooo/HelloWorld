package com.hsp.jdbc.myjdbc;

public class MysqlJdbcImpl implements JdbcInterface{
    @Override
    public Object getConnection(){
        System.out.println("得到 mysql 的连接");
        return null;
    }

    @Override
    public void crud() {
        System.out.println(" 完成mysql 的连接");
    }

    @Override
    public void close() {
        System.out.println("关闭 mysql 的连接");
    }
}
