package Dao;

import Entity.Employee;

public class Dao {


	  Employee e1=new Employee(1, "Amit Sharma", 70000, "HR");
			Employee e2=new Employee(5, "Priya Patel", 80000, "IT");
		    Employee e3 =new Employee(3, "Ravi Kumar", 65000, "Marketing");
			Employee e4=new Employee(2, "Sneha Reddy", 90000, "Finance");
		    Employee e5= new Employee(4, "Vijay Mehta", 75000, "HR");
			Employee e6= new Employee(10, "Anjali Singh", 85000, "IT");
			Employee e7 =new Employee(9, "Arjun Verma", 72000, "Marketing");
			Employee e8=new Employee(8, "Neha Gupta", 95000, "Finance");
			Employee e9 =new Employee(7, "Rani Desai", 68000, "Sales");
		  Employee e10 =new Employee(6, "Rajesh Nair", 77000, "Sales");

		
	       		public Employee[]  allemployee() {
	       			Employee []emp = new Employee[10];
					
	       			emp[0]=e1;
	       			emp[1]=e2;
	       			emp[2]=e3;
	       			emp[3]=e4;
	       			emp[4]=e5;
	       			emp[5]=e6;
	       			emp[6]=e7;
	       			emp[7]=e8;
	       			emp[8]=e9;
	       			emp[9]=e10;
	       				return emp;
	       		}


				
	
}
