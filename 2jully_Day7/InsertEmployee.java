package com.cdac.app;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.cdac.dao.EmployeeDao;
import com.cdac.entity.Employee;

public class InsertEmployee {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		//--------------1----Adding Data in DB-----------------
//		Employee emp = new Employee();
//		emp.setEmpno(1004);
//		emp.setName("Avinash");
//		emp.setSalary(20000);
//		emp.setDateOfJoining(LocalDate.of(2020, 10, 10));
//
//		EmployeeDao dao = new EmployeeDao();
//		dao.add(emp);
		//---------------------------------------------------
		
		//-------------2-----Fetch the specific id fromDB ----
//		 EmployeeDao dao = new EmployeeDao();
//		 Employee emp = dao.fetch(1002);
//		 System.out.println(emp.getName() + " " + emp.getSalary());
	   //----------------------------------------------------

	   //---------3----Fetch all employee by using list-------
//		EmployeeDao dao = new EmployeeDao();
//		List<Employee> list = dao.fetchAll();
//		for (Employee emp : list)
//			System.out.println(
//					emp.getEmpno() + " " + emp.getName() + " " + emp.getSalary() + " " + emp.getDateOfJoining());
//		System.out.println(".............");
	  //---------------------------------------------------------
		
	  //------4---Fetch all employee by using list using salary---
//		EmployeeDao dao = new EmployeeDao();
//		List<Employee> list2 = dao.fetchAllBySalary(15000);	//shown only one in my db because >=15000 only one data.
//		for (Employee emp : list2)
//			System.out.println(
//					emp.getEmpno() + " " + emp.getName() + " " + emp.getSalary() + " " + emp.getDateOfJoining());
	  //-------------------------------------------------------------
	 
		//------------5---Fetching sal by creating List-------------
//		EmployeeDao dao = new EmployeeDao();
//		 System.out.println("..............");
//		 List<String> names = dao.fetchAllNames();
//		 for(String name : names)
//		 System.out.println(name);
	   //------------------------------------------------------------------------		 

		//------------6---Fetching name and sal by creating List obj -------------
		 EmployeeDao dao = new EmployeeDao();
		 System.out.println("..............");
		 List<Object[]> namesAndSalaries = dao.fetchAllNamesAndSalaries();
		 for(Object[] arr : namesAndSalaries)
		 System.out.println(arr[0] + " " + arr[1]);	
		//-----------------------------------------------------------------------
		
	}
}
