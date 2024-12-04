//Queation 3
import java.util.*;
interface Employee                  //interface class
{
	public void calculateSalary();        //abstract method 
	public void getDetils();                // abstract method
}
class FullTImeEmployee implements Employee         //class FullTImeEmployee
{	
	int id;                                     //variable declaration
	String name;
	int fpday;
	int hpday;
	int res=0;

	void setDetail( int id,String name,int fpday,int hpday)     //setmethod
	{
		this.id=id;
		this.name=name;
		this.fpday=fpday;
		this.hpday=hpday;
	}
	public void calculateSalary()         //override mehod
	{
		res=fpday*30;
	}
	public void getDetils()                 //override abstract method
	{
		System.out.println("Name="+name+"\t"+"id ="+id+"\t"+"sal="+res);
	}
}
class PartTimeEmployee implements Employee    //PartTimeEmployee class
{
	int id;
	String name;
	int fpday;
	int hpday;
	int res=0;

	void setDetail( int id,String name,int fpday,int hpday)   //set employee detail
	{
		this.id=id;
		this.name=name;
		this.fpday=fpday;
		this.hpday=hpday;
	}
	public void calculateSalary()                //override method calculatesal
	{
		 res=hpday*30;
	} 
	public void getDetils()                   //override method  getDetils
	{
		System.out.println("Name="+name+"\t"+"id ="+id+"\t"+"sal="+res);
	}
} 
public class EmployeeDetails                     /public class
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		//System.out.println("Enter a name");
	//	String name=xyz.nextLine();
		//System.out.println("Enter id");
		//int id=xyz.nextInt();
	//	System.out.println("Enter a salary");
	//	int sal=xyz.nextInt();
		
		FullTImeEmployee f=new FullTImeEmployee();        //create object FullTImeEmployee
		f.setDetail(1,"Rahul",500,300);            //set value
		f.calculateSalary();						//call calculateSalary
		f.getDetils();                            //call getDetils
		
		PartTimeEmployee p1=new PartTimeEmployee();     //create object of PartTimeEmployee 
		p1.setDetail(2,"Ram",600,350);                  //set details
		p1.calculateSalary();                           // call calculateSalary
		p1.getDetils();							//call getDetils
	}
}
