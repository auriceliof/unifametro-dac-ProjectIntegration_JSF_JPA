package beans;

import java.util.List;

import javax.faces.bean.ManagedBean;

import daos.EmployeeDao;
import entities.Employee;

@ManagedBean
public class EmployeeBean {
	
	private Employee employee = new Employee();
	
	private List<Employee> list;
	
	
	public String save() {
		
		EmployeeDao.save(employee);
		employee = new Employee();
		
		return null;
	}


	public Employee getEmployee() {
		return employee;
	}


	public void setEmployee(Employee employee) {
		this.employee = employee;
	}


	public List<Employee> getList() {
		if (list == null) {
			list = EmployeeDao.findAll();
		}
		return list;
	}


	public void setList(List<Employee> list) {
		this.list = list;
	}	
}











