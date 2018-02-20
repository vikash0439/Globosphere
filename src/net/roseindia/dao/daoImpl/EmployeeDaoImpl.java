package net.roseindia.dao.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import net.roseindia.Form.EmployeeForm;
import net.roseindia.Form.SeachForm;
import net.roseindia.dao.EmployeeDao;
import net.roseindia.domain.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void addEmployee(EmployeeForm employeeForm) {
		Employee employee = new Employee();
		employee.setName(employeeForm.getName());
		employee.setAddress(employeeForm.getAddress());
		employee.setSalary(employeeForm.getSalary());
		sessionFactory.openSession().saveOrUpdate(employee);
	}

	public List<Employee> displayEmployee(EmployeeForm employeeForm) {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Employee.class);
		List<Employee> employees = new ArrayList<Employee>();
		employees = criteria.list();		
		return employees;
	}

	public List<Employee> findEmployee(SeachForm seachForm) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		String sql = "SELECT emp FROM Employee emp";
		String where = "";

		if (seachForm.getName() != "") {
			where = " where emp.name like '%" + seachForm.getName() + "%'";
		}

		if (seachForm.getSalary() != null) {
			if (where == "") {
				System.out.println("Salary If");
				where = " where emp.salary=" + seachForm.getSalary();
			} else {
				System.out.println("Salary else");
				where = where + " and emp.salary=" + seachForm.getSalary();
			}
		}

		if (seachForm.getId() != null) {
			if (where == "") {
				where = " where emp.emp_id=" + seachForm.getId();
			} else {
				where = where + " and emp.emp_id=" + seachForm.getId();
			}
		}

		Query query = session.createQuery(sql + where);
		tx.commit();
		return query.list();
	}

	public void editEmployee(EmployeeForm employeeForm) {
		// TODO Auto-generated method stub
		Employee employee = new Employee();
		employee.setEmp_id(employeeForm.getId());
		employee.setName(employeeForm.getName());
		employee.setAddress(employeeForm.getAddress());
		employee.setSalary(employeeForm.getSalary());
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.merge(employee);
		tx.commit();
		session.close();		
	}

	public EmployeeForm findEmployee(int id) {
		Session session = sessionFactory.openSession();
		String sql = "select emp from Employee emp where emp.emp_id=" + id;
		Query query = session.createQuery(sql);
		Employee employee = (Employee) query.list().get(0);
		EmployeeForm employeeForm = new EmployeeForm();
		employeeForm.setId(employee.getEmp_id());
		employeeForm.setName(employee.getName());
		employeeForm.setAddress(employee.getAddress());
		employeeForm.setSalary(employee.getSalary());
		return employeeForm;
	}

	public Employee loadEmployee(int id) {
		Session session = sessionFactory.openSession();
		String sql = "select emp from Employee emp where emp.emp_id=" + id;
		Query query = session.createQuery(sql);
		Employee employee = (Employee) query.list().get(0);
		return employee;
	}

	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Employee employee = loadEmployee(id);
		System.out.println("delete..");
		Transaction tx = session.beginTransaction();
		session.delete(employee);
		tx.commit();
		session.close();
	}
	
	public boolean checkLogin(String username, String password){
		System.out.println("In Check login "+username+password);
		Session session = sessionFactory.openSession();
		boolean userFound = false;
		//Query using Hibernate Query Language
		String SQL_QUERY ="from Login where username=? and password=?";
		Query query = session.createQuery(SQL_QUERY);
		query.setParameter(0,username);
		query.setParameter(1,password);
		List list = query.list();
		if ((list != null) && (list.size() > 0)) {
			userFound= true;
		}
		session.close();
		return userFound;              
     }
}