/*
Write program to Create class name as PersonalInfo with parameterized constructor  
PersonalInfo(String name, String middlename, String lastname) and you have to create class name as
 ProfessionalInfo with parameterized constructor  like as ProfessionalInfo(int id,String des,int salary,String skillset) 
 and you have to inherit PersonalInfo class in ProfessionalInfo and pass parameter from ProfessionalInfo class to 
 PersonalInfo using super() constructor and you have to define void show() method in ProfessionalInfo and you have 
 to show the all data in show() method. 

*/
import java.util.*;
class PersonalInfo
{
	String name;
	String middlename;
	String lastname;
	PersonalInfo(String name,String middlename,String lastname)
	{
		this.name=name;
		this.middlename=middlename;
		this.lastname=lastname;
	}
	void show()
	{
		System.out.printf("name ="+name+"\n"+"middlename ="+middlename+"\n"+"last name ="+lastname);
		
	}
	
}
class ProfessionalInfo extends PersonalInfo
{
	int id;
	int salary;
	String des;
	String skillset;
	
	ProfessionalInfo(String name,String middlename,String lastname,int id,String des,int salary,String skillset)
	{
		super(name,middlename,lastname);
		this.id=id;
		this.des=des;
		this.salary=salary;
		this.skillset=skillset;
	}
	void show()
	{	super.show();
		System.out.println("\n"+"id="+id+"\n"+"Des="+des+"\n"+"salary="+salary+"\n"+"Skillset="+skillset);
	}
}

public class Personal_InfoApp
{
	public static void main(String x[])
	{
		ProfessionalInfo p=new ProfessionalInfo("Rahul","Shahadev","Pawar",1,"Engineering",10000,"Java Developer");
		p.show();
	}
}