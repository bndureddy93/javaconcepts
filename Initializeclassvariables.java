
public class Initializeclassvariables{
	String employee;
	int empsal;
	int x;
	int y;
	
	Initializeclassvariables(int a, int b)
	{
		x=a;
		y=b;
	}

	public void employeedetails(String name, int salary) {
		employee=name;
		empsal=salary;
		
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Initializeclassvariables emp1=new Initializeclassvariables(10,20);initialize class variables by using constructor
		emp1.employee="Bindu";//initialize class variables with value using object
		emp1.empsal=300000;
		emp1.employeedetails("bindu", 40000);//initialize class variables values using method 
		

	}

}
