package Entity;

public class Employee {

			private int id;
			private String name;
			private int salary;
			private String Dept;
			
			
			public Employee() {
				super();
			}


			public Employee(int id, String name, int salary, String dept) {
				super();
				this.id = id;
				this.name = name;
				this.salary = salary;
				Dept = dept;
			}

			public int getId() {
				return id;
			}


			public void setId(int id) {
				this.id = id;
			}


			public void getName() {
				
			}


			public void setName(String name) {
				this.name = name;
			}


			public int getSalary() {
				return salary;
			}


			public void setSalary(int salary) {
				this.salary = salary;
			}


			public String getDept() {
				return Dept;
			}


			public void setDept(String dept) {
				Dept = dept;
			}


			@Override
			public String toString() {
				return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", Dept=" + Dept + "]";
			}


			
	}


