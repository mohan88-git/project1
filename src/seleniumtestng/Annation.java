package seleniumtestng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annation {
	
@BeforeSuite	

public void sample1() {
	System.out.println("Before Suite");
	
}

@AfterSuite	

public void sample2() {
	
	System.out.println("After Suite");
		
}


@BeforeTest

public void sample3() {
	
	System.out.println("Before test");
		
}
	
@AfterTest
public void sample4() {
	
	System.out.println("After test");
		
}

@AfterClass	

public void sample5() {
	
	System.out.println("After Class");
	
	
}



@BeforeClass(enabled=false)

public void sample6() {
	
	System.out.println("Before Class");
	
	
}


@AfterMethod	

public void sample7() {
	
	System.out.println("After Method");
	
	
}


@Test	

public void sample9() {
	
	System.out.println("Before Method");
	
	
}



@BeforeMethod	

public void sample8() {
	
	System.out.println("Before Method");
	
	
}


}
