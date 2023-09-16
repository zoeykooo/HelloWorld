package dao_.dao;

import com.hsp.jdbc.datasource.JDBCUtilsByDruid;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import javax.management.Query;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public  class BasicDAO<T> {

    private QueryRunner qr =  new QueryRunner();


    public int update(String sql, Object... parameters) throws SQLException {

        Connection connection = null;

        try {
            connection = JDBCUtilsByDruid.geConnection();
            int update = qr.update(connection, sql, parameters);
            return  update;
        } catch (SQLException e) {
            throw  new RuntimeException(e); //将编译异常->运行异常 ,抛出
        } finally {
            JDBCUtilsByDruid.close(null, null, connection);
        }

    }


    public List<T> queryMulti(String sql, Class<T> clazz, Object... parameters) throws SQLException {

        Connection connection = null;
        try {
            connection = JDBCUtilsByDruid.geConnection();
            return qr.query(connection, sql, new BeanListHandler<T>(clazz), parameters);

        } catch (SQLException e) {
            throw  new RuntimeException(e);
        } finally {
            JDBCUtilsByDruid.close(null, null, connection);
        }

    }


    public T querySingle(String sql, Class<T> clazz, Object... parameters) throws SQLException {

        Connection connection = null;
        try {
            connection = JDBCUtilsByDruid.geConnection();
            return  qr.query(connection, sql, new BeanHandler<T>(clazz), parameters);

        } catch (SQLException e) {
            throw  new RuntimeException(e); //将编译异常->运行异常 ,抛出
        } finally {
            JDBCUtilsByDruid.close(null, null, connection);
        }
    }

    //查询单行单列的方法,即返回单值的方法

    public Object queryScalar(String sql, Object... parameters) throws SQLException {

        Connection connection = null;
        try {
            connection = JDBCUtilsByDruid.geConnection();
            return  qr.query(connection, sql, new ScalarHandler(), parameters);

        } catch (SQLException e) {
            throw  new RuntimeException(e);
        } finally {
            JDBCUtilsByDruid.close(null, null, connection);
        }
    }

}

