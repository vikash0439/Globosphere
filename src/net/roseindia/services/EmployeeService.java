
package net.roseindia.services;

import java.util.List;

import net.roseindia.Form.EmployeeForm;
import net.roseindia.Form.SeachForm;
import net.roseindia.domain.Employee;

public interface EmployeeService{
	
	public void addEmployee(EmployeeForm employeeForm);
	public List<Employee> displayEmployee(EmployeeForm employeeForm);
	public List<Employee> findEmployee(SeachForm seachForm);
	public void editEmployee(EmployeeForm employeeForm);
	public EmployeeForm findEmployee(int id);
	public void deleteEmployee(int id);	
	public boolean checkLogin(String username, String password);
}