package practiceCodes;
import java.util.Scanner;

class employee{
	Scanner sc = new Scanner(System.in);
	String name;
	int age;
	double salary = 15000;
	double amount,gross,Tax, NetSalary;
	
	void details() {
		System.out.println("Name : "+this.name);
		System.out.println("Age : "+this.age);
		System.out.println("Your Salary : "+this.salary);
	}
	void bonus() {
	  System.out.println("Entre bonus salary :");
	  amount = sc.nextDouble();
	  this.salary += amount;
	}
	void tax () {
		gross = salary;
		Tax = (gross*20)/100;
		System.out.println("Your gross is : "+gross);
		System.out.println("Tax Amount is : "+Tax);
	}
	void netSalary() {
		NetSalary = gross - Tax;
		System.out.println("Net Salary is : "+NetSalary);
	}
	
}
public class demo extends employee{
	public static void main(String args[]) {
	employee obj = new employee();
	obj.name = "Prasad";
	obj.age = 21;
	
	obj.details();
	obj.bonus();
	obj.tax();
	obj.netSalary();
 }
	
}
