package com.dao;

/*import java.util.ArrayList;*/
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
/*import org.springframework.beans.factory.annotation.Qualifier;*/
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.domain.Employee;

@Repository("employeeDao")
@Transactional(propagation = Propagation.REQUIRED)
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	public void insert(Employee employee) {

		hibernateTemplate.save(employee);
	}

	@Override
	public void update(Employee employee) {

		hibernateTemplate.update(employee);
	}

	@Override
	public void delete(int eid) {

		Employee employee = hibernateTemplate.get(Employee.class, eid);
		hibernateTemplate.delete(employee);
	}

	@Override
	@Transactional(readOnly = true)
	public Employee getEmployeeById(int eid) {

		Employee employee = hibernateTemplate.get(Employee.class, eid);
		return employee;
	}

	@Override
	@Transactional(readOnly = true)
	public List<Employee> getAllEmployees() {

		@SuppressWarnings("unchecked")
		List<Employee> employees = hibernateTemplate.find("from Employee");
		return employees;
	}

	@Override
	public void insertOrUpdate(Employee employee) {
		hibernateTemplate.saveOrUpdate(employee);	
	}

	@Override
	public List<Employee> getEmployeeByName(String ename) {
		@SuppressWarnings("unchecked")
		List<Employee> emp=  hibernateTemplate.find("from Employee e where e.firstName = '"+ename+"'");
		return emp;	
	}
}
