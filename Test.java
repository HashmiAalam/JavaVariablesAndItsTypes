//Use of Static and Instance variables 
public class Test {
	public static void main(String[] args){    //static method
	   Employee employee1=new Employee(111,"alam","TCS");
	  System.out.println("Employee id="+employee1.eid+ " Employee name="+employee1.ename+" Employee company="+employee1.ecompany);
	  Employee employee2=new Employee(222,"wakeel","SBI");  //employee2 changes company name
	  System.out.println("Employee id="+employee2.eid+ " Employee name="+employee2.ename+" Employee company="+employee2.ecompany);
	  //since ecompany variable is static if new object(Employee) do any changes to company name than this change will reflact to all Employees
	  System.out.println("Employee id="+employee1.eid+ " Employee name="+employee1.ename+" Employee company="+employee1.ecompany); //now employee1's company become SBI
	  //Static variable is accessed by class name and class is one therefore memory location is same for static variable
	}
	
}
class Employee{
	int eid;
	String ename;
	static String ecompany;
	Employee(int eid,String ename,String ecompany){
		this.eid=eid;
		this.ename=ename;
		this.ecompany=ecompany;
		}
	
}