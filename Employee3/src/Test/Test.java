package Test;

import Controller.Controller;
import Entity.Employee;

public class Test {
	
			public static void main(String[] args) {
			   Controller c1 = new Controller();
			 
			   
			   //1
			   c1.EmpById(5);
			   System.out.println("=================================================================");
			   System.out.println();
			   
			   //2
			   Employee []emp=c1.showAllEmployee();
			   System.out.println("==================================================================");
			   System.out.println();
			   
			   
			   c1.maxsalary();
			   System.out.println("==================================================================");
			   System.out.println();
			   
			   c1.minsalary();
			   System.out.println("===================================================================");
			   System.out.println();
			   
			   c1.EmpByRole("dev");
			   System.out.println("===================================================================");
			   System.out.println();
			   
			   c1.EmpInDsen();
			   System.out.println("===================================================================");
			   System.out.println();
			   
			   c1.EmpInAesen();
			   System.out.println("===================================================================");
			   System.out.println();
			   
			   c1.EmpsetName();
			   
			}
	}


