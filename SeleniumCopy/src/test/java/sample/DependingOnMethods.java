package sample;


import org.testng.annotations.Test;

public class DependingOnMethods 
{
	@Test
	  public void method1() 
	{
		  System.out.println("1 st method executed");
		    
	  }
	   @Test
	  public void method2() 
	   {
		  System.out.println(" 2nd method executed");
}
	   @Test(dependsOnMethods= {"method1","method2"})
		  public void method3() {
			  System.out.println("1&2 mthods are executed");
	   }
}