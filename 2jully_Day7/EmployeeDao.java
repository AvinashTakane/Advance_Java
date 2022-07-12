package com.cdac.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.cdac.entity.Employee;

//Data Access Object
//classes which contain database related code
//are commonly referred to as Dao classes
public class EmployeeDao {

	public void add(Employee emp) {
		// During this step, the persistence.xml file will be read
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(emp); // persist method will generate insert query
		tx.commit();
		emf.close();
	}
	
	//-------------When we passess more than one object as a information------------------------- 
//	public void add(List<Employee> emp) {
//	//During this step, the persistence.xml file will be read
//	EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate"); 
//	EntityManager em = emf.createEntityManager(); 
//	EntityTransaction tx = em.getTransaction();
//	tx.begin();
//	
//	for(Employee e : emp) 
//		em.persist(e); //persist method will generate insert query
//	
//	tx.commit(); 
//	emf.close(); 
//	
//	}
	//-------------------------------------------------------------------------------------------
	
	//--------------------------2--Fetch Single Record basis on Primary Id------------------------
	public Employee fetch(int empno) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		// find method generates select query where pk = ?
		Employee emp = em.find(Employee.class, empno);
		emf.close();
		return emp;
	}
	//---------------------------------------------------------------------------------------------

	//--------------------------3--Fetch All Records using List and *------------------------------
	
	public List<Employee> fetchAll() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("select e from Employee e"); // HQL/JPQL
		List<Employee> list = q.getResultList();
		emf.close();
		return list;
	}
	//--------------------------------------------------------------------------------------------
	
	//--------------------------4--Fetch All Records using List and Salary------------------------
	public List<Employee> fetchAllBySalary(double salary) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("select e from Employee e where e.salary >= :sal");
		q.setParameter("sal", salary);
		List<Employee> list = q.getResultList();
		emf.close();
		return list;
	}
	//---------------------------------------------------------------------------------------------
	
	//--------------------------5--Fetch All Records using List and query as name------------------
	public List<String> fetchAllNames() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("select e.name from Employee e"); // HQL/JPQL
		List<String> list = q.getResultList();
		emf.close();
		return list;
	}
	//----------------------------------------------------------------------------------------------
	
	//---------6--Fetch All Records using List(using object here) and query as name and salary------
	public List<Object[]> fetchAllNamesAndSalaries() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("select e.name,e.salary from Employee e"); // HQL/JPQL
		List<Object[]> list = q.getResultList();
		emf.close();
		return list;
	}
	//---------------------------------------------------------------------------------------------
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
