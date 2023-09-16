package com.hsp.mhl.servce;

import com.hsp.mhl.dao.MenuDAO;

import java.awt.*;
import java.sql.SQLException;

public class MenuService {


    private MenuDAO menuDAO = new MenuDAO();


    public List list() throws SQLException {
        return (List) menuDAO.queryMulti("select * from menu", Menu.class);
    }

    //需要方法，根据id, 返回Menu对象
    public Menu getMenuById(int id) throws SQLException {
        return menuDAO.querySingle("select * from menu where id = ?", Menu.class, id);
    }
}

