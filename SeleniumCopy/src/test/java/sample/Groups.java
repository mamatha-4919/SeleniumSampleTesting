package sample;


import org.junit.Ignore;
import org.testng.annotations.Test;

public class Groups
{
	@Ignore
@Test(groups={"smoke","regression"})
public void method1()
{
	System.out.println("register");
}
@Test(groups= {"smoke"})
public void method2()
{
	System.out.println("login");
}
@Test(groups={"sanity"})
public void method3()
{
	System.out.println("homepage");
}
@Test(groups= {"regression"})
public void method4()
{
	

System.out.println("logout");
}


}
