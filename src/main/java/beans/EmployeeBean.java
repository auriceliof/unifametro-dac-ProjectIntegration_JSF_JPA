package beans;

import java.util.List;

import javax.faces.bean.ManagedBean;

import daos.EmployeeDao;
import entities.Employee;
import utils.MessageUtil;

@ManagedBean
public class EmployeeBean {
	
	private Employee employee = new Employee();
	
	private List<Employee> list;
	
	
	public String save() {
		
		try {
			
			EmployeeDao.save(employee);
			MessageUtil.sucesso("Sucesso", "Funcionário salvao com sucesso!");
			employee = new Employee();
			
		} catch(Exception e) {
			MessageUtil.erro("Erro", "Erro ao salvar o funcionário!");
		}
		
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











