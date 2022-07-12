package com.cdac.app;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.cdac.entity.Employee;

public class InsertEmployee {
	public static void main(String args[]) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Avinash");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tr = em.getTransaction();
		tr.begin();
		Employee emp = new Employee();
		emp.setEmpno(1);
		emp.setName("Krishna Muruti");
		emp.setSalary(100000);
		emp.setDateOfJoining(LocalDate.of(2022, 8, 06));		
		em.persist(emp);	//persist method will generate insert query. 
		tr.commit();
		emf.close();
	}
}
