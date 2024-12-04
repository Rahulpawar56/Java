import java.util.*;

class Employee
{
	private int id;
	private String name;
	private int sal;
	
	void setId(int id)
	{
		this.id=id;
	}
	int getId()
	{
		return id;
	}
	void setName(String name);
	{
		this.name=name;
	}
	String getName()
	{
		return name;
	}
	void setSal(int sal)
	{
		this.sal=sal;
	}
	int getSal()
	{
		return sal;
	}
}
class EmplyeeDetail
{
	Employee e[];
	void addEmployee(Employee e)
	{
		this.e=e;
	}
	void show()
	{
		for(int i=0;i<e.length;i++)
		{
			System.out.println("id ="+e[i].getId()+"\nName ="+e[i].getName()+"\tSal ="+e[i].getSal());
		}
	}
}

public class EmployeeIdNameSalAscending
{
	public static void main(String x[])
	{
		Employee e=new Employee();
		e.setId(1);
		e.setName("Rahul");
		e.setSal("1000");
		
		EmplyeeDetail ed=new EmplyeeDetail();
		ed.addEmployee(e);
		ed.show();
	}
}
