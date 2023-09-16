package com.hsp.mhl.servce;

import com.hsp.mhl.dao.DiningTableDAO;
import com.hsp.mhl.daomain.DiningTable;

import java.sql.SQLException;
import java.util.List;

public class DiningTableService {

    DiningTableDAO diningTableDAO =new DiningTableDAO();
    public List<DiningTable> list() {

        return diningTableDAO.queryMulti("select id, state from diningTable",DiningTable.class);
    }


    public DiningTable getDiningTableById(int id) {


        return diningTableDAO.querySingle("select * from diningTable where id = ?",DiningTable.class, id);
    }

    //如果餐桌可以预定，调用方法，对其状态进行更新(包括预定人的名字和电话)
    public boolean orderDiningTable(int id, String orderName, String orderTel) throws SQLException {

        int update =
                diningTableDAO.update("update diningTable set state='已经预定', orderName=?, orderTel=? where id=?", orderName, orderTel, id);

        return  update > 0;
    }

    //需要提供一个更新 餐桌状态的方法
    public boolean updateDiningTableState(int id, String state) throws SQLException {

        int update = diningTableDAO.update("update diningTable set state=? where id=?", state, id);
        return update > 0;
    }


    public boolean updateDiningTableToFree(int id, String state) throws SQLException {

        int update = diningTableDAO.update("update diningTable set state=?,orderName='',orderTel='' where id=?", state, id);
        return update > 0;
    }

}

