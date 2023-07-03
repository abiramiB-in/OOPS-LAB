import java.util.Arrays;
import java.util.Scanner;
class Employee{
	int eno,esalary;
	String ename;
	public Employee(){
	}
	public Employee(int no,int sal,String name)
	{
		eno=no;
		esalary=sal;
		ename=name;
	}
	public void showData()
	{
		System.out.print("EmpId="+eno+"\t"+"Name="+ename+"\t"+"Salary="+esalary"\n");
		System.out.println();
	}
}
public class EmpArrObjects{
	public static void main(String[] args){
		System.out.println("Enter the number of employees :");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Enter employees details one by one ");
		Employee employee[]=new Employee[n];
		Scanner sc_emp=new Scanner(System.in);
		int eid,esal;
		String enam;
		for(int i=0;i<n;i++){
			System.out.println("Enter"+i+"employee details.");
			System.out.println("Enter employee id (integer):");
			eid=sc_emp.nextInt();
			System.out.println("Enter employee name (String):");
			String nam=sc_emp.next();
			enam=new String(nam);
			System.out.println("Enter employee salary (integer):");
			esal=sc_emp.nextInt();
			Employee emp=new Employee(eid,esal,enam);
			employee[i]=emp;
		}
		System.out.println("Employees are :\n");
		for(Employee y:employee)
			y.showData();
		System.out.println("Enter employee number to search :");
		int semp=sc.nextInt();
		boolean found=false;
		for(Employee e:employee){
			if(semp==e.eno){
				found=true;
				System.out.println("Employee found.");
				e.showData();
				break;
			}
		}
		if(!found){
			System.out.println("Employee not found.");
		}
	}
}
