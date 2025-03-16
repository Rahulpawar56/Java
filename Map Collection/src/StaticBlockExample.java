
public class StaticBlockExample {

	static {
		System.out.println("I am Static Block ");
	}
	{
		System.out.println("I am Instatnce Block");
	}
	public static void main(String[] args) {
		
		System.out.println("I am Main Block");
		StaticBlockExample s=new StaticBlockExample();
	}

}
