package Controller;

import java.util.Iterator;

import Dao.Dao;
import Entity.Employee;

public class Controller{
	Dao dao;

	public void EmpById(int id) {
		dao =new Dao();
		Employee[] emp= dao.allemployee();
		for (int i = 0; i < emp.length; i++) {
			if(emp[i].getId()==id) {
				System.out.println(emp[i]);
			}
		}
	}

	public Employee[] showAllEmployee() {
		dao =new Dao();
		Employee[] emp= dao.allemployee();
		for (Employee employee : emp) {
			System.out.println(employee);
		}
		return emp;
	}

	public void maxsalary() {
		dao =new Dao();
		Employee[] emp= dao.allemployee();
		int max =emp[0].getSalary();
		int index =0;
		for (int i = 1; i < emp.length; i++) {  
			if (emp[i].getSalary() > max) {
				max = emp[i].getSalary();
				index = i;
			}

		}
		System.out.println(emp[index]);
	}

	public void minsalary() {
		dao =new Dao();
		Employee[] emp= dao.allemployee();
		int min =emp[0].getSalary();
		int index =0;
		for (int i = 1; i < emp.length; i++) {  
			if (emp[i].getSalary() < min) {
				index = i;
				min = emp[i].getSalary();
			}
		}
		System.out.println(emp[index]);

	}

	public void EmpByRole(String Dept) {
		dao =new Dao();
		Employee[] emp= dao.allemployee();
		for (Employee employee : emp) {
			if(employee.getDept().equalsIgnoreCase(Dept)) {
				System.out.println(employee);
				break;
			}
		}
	}

	public void EmpInDsen() {
		dao =new Dao();
		Employee[] emp= dao.allemployee();
		for (int i = 0; i < emp.length; i++) {
			for (int j = 0; j < emp.length; j++) {
				if(emp[i].getId()>emp[j].getId()) {
					Employee temp=emp[i];
					emp[i]=emp[j];
					emp[j]=temp;
				}
			}
		}
		for (  Employee employee : emp) {
			System.out.println(employee);

		}
	}

	public void EmpInAesen() {
		dao =new Dao();
		Employee[] emp= dao.allemployee();
		for (int i = 0; i < emp.length; i++) {
			for (int j = 0; j < emp.length; j++) {
				if(emp[i].getId()<emp[j].getId()) {
					Employee temp=emp[i];
					emp[i]=emp[j];
					emp[j]=temp;
				}
			}
		}
		for (  Employee employee : emp) {
			System.out.println(employee);

		}

	}

	public void EmpsetName() {
		dao =new Dao();
		Employee[] emp= dao.allemployee();
		for (int i = 0; i < emp.length; i++) {
			if (emp[i].getId()==10){
				
				emp[i].setName("kaushal");
			}
		}
		for (int i = 0; i < emp.length; i++) {
			if (emp[i].getId()==10){
				System.out.println(emp[i]);

			
			}}

		}
	
		public void Empsecondlarge() {
			dao =new Dao();
			Employee[] emp= dao.allemployee();
			for (int i = 0; i < emp.length; i++) {
	}
}
}
		

