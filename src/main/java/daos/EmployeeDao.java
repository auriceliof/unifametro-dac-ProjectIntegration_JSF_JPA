package daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import entities.Employee;
import utils.JPAUtil;

public class EmployeeDao {
	
	public static void save(Employee e) {
		
		EntityManager em = JPAUtil.creatingEntityManager();
		
		em.getTransaction().begin();
		em.persist(e);
		em.getTransaction().commit();
		em.close();
	}
	
	
	public static void update(Employee e) {
		
		EntityManager em = JPAUtil.creatingEntityManager();
		
		em.getTransaction().begin();
		em.persist(e);
		em.merge(e);
		em.getTransaction().commit();
		em.close();
	}
	
	
	public static void delete(Employee e) {
		
		EntityManager em = JPAUtil.creatingEntityManager();
		
		em.getTransaction().begin();
		e = em.find(Employee.class, e.getId());
		em.remove(e);
		em.getTransaction().commit();
		em.close();
	}
	
	
	public static List<Employee> findAll() {
		
		EntityManager em = JPAUtil.creatingEntityManager();
		
		Query q = em.createQuery("select e from Employee e");
		@SuppressWarnings("unchecked")
		List<Employee> list = q.getResultList();
		em.close();
		return list;
	}
	
	
	public static Employee findById(Integer id) {
	
		EntityManager em = JPAUtil.creatingEntityManager();
		
		em.getTransaction().begin();
		Employee e = em.find(Employee.class, id);
		em.close();
		return e;
	}	
}
