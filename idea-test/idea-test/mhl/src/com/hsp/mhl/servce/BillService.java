package com.hsp.mhl.servce;

import com.hsp.mhl.dao.BillDAO;
import com.hsp.mhl.dao.MultiTableDAO;
import com.hsp.mhl.daomain.Bill;
import com.hsp.mhl.daomain.MultiTableBean;

import java.sql.SQLException;
import java.util.List;
import java.util.UUID;

public class BillService {private BillDAO billDAO = new BillDAO();
    //定义MenuService 属性
    private MenuService menuService = new MenuService();
    //定义DiningTableService属性
    private DiningTableService diningTableService = new DiningTableService();

    private MultiTableDAO multiTableDAO = new MultiTableDAO();

    //思考
    //编写点餐的方法
    //1. 生成账单
    //2. 需要更新对应餐桌的状态
    //3. 如果成功返回true, 否则返回false
    public boolean orderMenu(int menuId, int nums, int diningTableId) {
        //生成一个账单号,UUID
        String billID = UUID.randomUUID().toString();

        //将账单生成到bill表, 要求直接计算账单金额
        int update = billDAO.update("insert into bill values(null,?,?,?,?,?,now(),'未结账')",
                billID, menuId, nums, menuService.getMenuById(menuId).getPrice() * nums, diningTableId);

        if (update <= 0) {
            return false;
        }

        //需要更新对应餐桌的状态
        return diningTableService.updateDiningTableState(diningTableId, "就餐中");

    }

    //返回所有的账单， 提供给View调用
    public List<Bill> list() throws SQLException {
        return billDAO.queryMulti("select * from bill", Bill.class);
    }

    //返回所有的账单并带有菜品名,价格， 提供给View调用
    public List<MultiTableBean> list2() {
        return multiTableDAO.queryMulti("SELECT bill.*, NAME " +
                "FROM bill, menu " +
                "WHERE bill.menuId = menu.id", MultiTableBean.class);
    }


    //查看某个餐桌是否有未结账的账单
    public boolean hasPayBillByDiningTableId(int diningTableId) {

        Bill bill =
                billDAO.querySingle("SELECT * FROM bill WHERE diningTableId=? AND state = '未结账' LIMIT 0, 1", Bill.class, diningTableId);
        return bill != null;
    }

    //完成结账[如果餐桌存在，并且该餐桌有未结账的账单]
    //如果成功，返回true, 失败返回 false
    public boolean payBill(int diningTableId, String payMode) throws SQLException {

        //如果这里使用事务的话，需要用ThreadLocal来解决 , 框架中比如mybatis 提供了事务支持
        //1. 修改bill表
        int update = billDAO.update("update bill set state=? where diningTableId=? and state='未结账'", payMode, diningTableId);

        if(update <= 0) {
            return false;
        }


        if(!diningTableService.updateDiningTableToFree(diningTableId, "空")) {
            return false;
        }
        return true;

    }
}
