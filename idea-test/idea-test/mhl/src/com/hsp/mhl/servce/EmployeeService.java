package com.hsp.mhl.servce;

import com.hsp.mhl.dao.EmployeeDAO;
import com.hsp.mhl.daomain.Employee;

import java.sql.SQLException;

public class EmployeeService {

   private EmployeeDAO employeeDAO= new EmployeeDAO();

   public Employee getEmployeeByIdAndPwd(String empId,String pwd) throws SQLException {
    return   employeeDAO.querySingle("select * from employee where empId=? and pwd=md5(?)",Employee.class,empId,pwd);
   }
}
