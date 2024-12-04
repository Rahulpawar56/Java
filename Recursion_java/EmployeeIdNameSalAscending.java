//Ascending by id

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
	void setName(String name)
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
	void addEmployee(Employee ...e)
	{
		this.e=e;
	}
	
	void Ascending()   //Ascending By id
	{
		for(int i=0;i<e.length;i++)
		{
			for(int j=i+1;j<e.length;j++)
			{
				if(e[i].getId()>e[j].getId())
				{
					Employee temp=e[i];
					e[i]=e[j];
					e[j]=temp;
				} 
			}
		}
	}
	void show()
	{
		for(int i=0;i<e.length;i++)
		{
			System.out.println("id ="+e[i].getId()+"\tName ="+e[i].getName()+"\tSal ="+e[i].getSal());
		}
	}
}

public class EmployeeIdNameSalAscending
{
	public static void main(String x[])
	{
		Employee e[]=new Employee[5];
		for(int i=0;i<5;i++)
		{
			Scanner xyz=new Scanner(System.in);
			e[i]=new Employee();
			System.out.println("Enter a name id and sal");
			String name=xyz.nextLine();
			int id=xyz.nextInt();
			int sal=xyz.nextInt();
			e[i].setName(name);
			e[i].setId(id);
			e[i].setSal(sal);
		}
		
		EmplyeeDetail ed=new EmplyeeDetail();
		ed.addEmployee(e);
		ed.Ascending();
		ed.show();
	}
}
