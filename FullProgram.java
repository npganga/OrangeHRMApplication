package original;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;



public class FullProgram {
	
    public String url = "http://opensource.demo.orangehrmlive.com/index.php/auth/login";
    
    public String expectedTitle="OrangeHRM";
    
    public String fname;
    public String lname;
    public String mname;
    public String empid;
    
    public void check(WebDriver driver) throws InterruptedException{
    String actualTitle=driver.getTitle();
	Assert.assertEquals(expectedTitle,actualTitle);
	Thread.sleep(2000);
    }
	public void loginInfo(WebDriver driver) throws InterruptedException{
		
		//Username
		WebElement username=driver.findElement(By.xpath("//*[@id='txtUsername']"));
		username.clear();	
		username.sendKeys("Admin");
	//	 Assert.assertEquals(username);
		 Thread.sleep(2000);
		 
		//Password
		WebElement password=driver.findElement(By.xpath("//*[@id='txtPassword']"));
		password.clear();
		password.sendKeys("admin");
		 Thread.sleep(2000);
		 
		//LOGIN button
	    WebElement logIn =driver.findElement(By.xpath("//*[@id='btnLogin']"));
		logIn.click();
		Thread.sleep(2000);

    }
	
	public void SelectPIM(WebDriver driver) throws InterruptedException{
		
		//Select PIM
		WebElement pim= driver.findElement(By.cssSelector("#menu_pim_viewPimModule > b"));
		pim.click();
		 Thread.sleep(2000);
	}
	
	public void addEmoployee(WebDriver driver) throws InterruptedException{
		
		//Select ADD_EMPLOYEE
		 WebElement addEmp=driver.findElement(By.id("menu_pim_addEmployee"));
		 addEmp.click();
		 Thread.sleep(2000);
		 
		 //Select FirstName
		WebElement firstName=driver.findElement(By.cssSelector("#firstName"));
		 firstName.clear();
		 firstName.sendKeys("qwasaty");
		 Thread.sleep(2000);
		 fname=firstName.getText();
		 
		 //Select MiddleName
		 WebElement middleName=driver.findElement(By.cssSelector("#middleName"));
		 middleName.clear();
		 middleName.sendKeys("qwerty");
		 Thread.sleep(2000);
		 mname=middleName.getText();
		 
		 //Select LastName
		 WebElement lastName=driver.findElement(By.cssSelector("#lastName"));
		 lastName.clear();
		 lastName.sendKeys("tyuype"); 
		 Thread.sleep(2000);
		 lname=lastName.getText();
		 
		 //Enter EmployeeId
		 WebElement employeeId=driver.findElement(By.cssSelector("#employeeId"));
		 employeeId.clear();
		 employeeId.sendKeys("19901"); 
		 Thread.sleep(2000);
		 empid=employeeId.getText();
		 
		 //Save_Button
		 WebElement saveButton =driver.findElement(By.id("btnSave"));
		 saveButton.click();
		 Thread.sleep(2000);
		 
		
	}

	
	public void personalDetails(WebDriver driver) throws InterruptedException 
	{
		//Select_Personal_Details
		WebElement PersonalDetails=driver.findElement(By.cssSelector("#sidenav > li.selected > a"));
		PersonalDetails.click();
		Thread.sleep(2000);
	}
	
	
	public void matchInfo(WebDriver driver) throws InterruptedException{
	System.out.println("ttttt");
		//CheckFirstName
		WebElement Checkfirstname = driver.findElement(By.cssSelector("#personal_txtEmpFirstName"));
		Assert.assertEquals(fname,Checkfirstname);
		System.out.println("fname checked");
		System.out.println("weewwr");
		//CheckMiddleName
		WebElement Checkmiddlename = driver.findElement(By.cssSelector("#personal_txtEmpMiddleName"));
		Assert.assertEquals(Checkmiddlename,mname);
		
		//CheckLastName
		WebElement Checklastname = driver.findElement(By.cssSelector("#personal_txtEmpLastName"));
		Assert.assertEquals(Checklastname,lname);
		System.out.println("erre");
	}
	
	public void logOut(WebDriver driver){
		System.out.println("qqq");
		driver.findElement(By.cssSelector("#welcome")).click();
		System.out.println("pp");
	    driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[2]/a")).click();
	    System.out.println("lll");
	}
	
	//#welcome
	
	////*[@id="welcome-menu"]/ul/li[2]/a
	
	
	
 }
