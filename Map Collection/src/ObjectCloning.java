import java.util.*;
class Cube implements Cloneable{
	private int no;
	public void setNo(int no)
	{
		this.no=no;
	}
	void showCube()
	{
		System.out.println("Cube is "+(no*no*no) );
	}
	public Cube getClone()throws Exception
	{
		Object obj=this.clone();
		Cube c=(Cube)obj;
		return c;
	}
}
public class ObjectCloning {

	public static void main(String[] args) throws Exception {
		Cube c1=new Cube();
		c1.setNo(10);
		Cube c2=c1.getClone();
		c2.setNo(5);
		c2.showCube();
		c1.showCube();
	}

}
