public class classNotFound
{
    public static final String Driverclass="com.mysql.jdbc.driver";
	  public static void main(String  x[])throws Exception
	  {
		  try{
			    Class.forName(Driverclass);
				System.out.println("Load mysql driver");
			
		     }
			 catch(ClassNotFoundException ex)
			 {
				 System.out.println("Error is"+ex);
				
			 }
	  }
}