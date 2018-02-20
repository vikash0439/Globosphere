package net.roseindia.services.impl;

import java.util.List;

import net.roseindia.Form.EmployeeForm;
import net.roseindia.Form.SeachForm;
import net.roseindia.dao.daoImpl.EmployeeDaoImpl;
import net.roseindia.domain.Employee;
import net.roseindia.services.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {
	EmployeeDaoImpl employeeDao;

	public void setEmployeeDao(EmployeeDaoImpl employeeDao) {
		this.employeeDao = employeeDao;
	}

	@Override
	public void addEmployee(EmployeeForm employeeForm) {

		employeeDao.addEmployee(employeeForm);
	}

	public List<Employee> findEmployee(SeachForm seachForm) {

		return employeeDao.findEmployee(seachForm);
	}

	@Override
	public List<Employee> displayEmployee(EmployeeForm employeeForm) {
		// TODO Auto-generated method stub
		return employeeDao.displayEmployee(employeeForm);
	}

	@Override
	public void editEmployee(EmployeeForm employeeForm) {
		// TODO Auto-generated method stub
		employeeDao.editEmployee(employeeForm);
	}

	public EmployeeForm findEmployee(int id) {
		return employeeDao.findEmployee(id);
	}

	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub
		employeeDao.deleteEmployee(id);
	}
	public boolean checkLogin(String username, String password){
        System.out.println("In Service class...Check Login "+username+password);
        return employeeDao.checkLogin(username, password);
 }
}