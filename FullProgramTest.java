package original;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class FullProgramTest {
	 WebDriver driver;
	 FullProgram fp=new FullProgram();
	
  @Test(priority=0)
  public void start() {
		 System.setProperty("webdriver.chrome.driver","C:\\Chrome\\chromedriver.exe");	
		 driver= new ChromeDriver();
	     driver.navigate().to(fp.url);;
  }
  @Test(priority=1)
  public void checkInfo() throws InterruptedException {
 	 fp.check(driver);
  }
  @Test(priority=2)
  public void loginInfo() throws InterruptedException {
	  fp.loginInfo(driver);
  }
  @Test(priority=3)
  public void SelectPIM() throws InterruptedException { 
	  fp.SelectPIM(driver);
   }
  @Test(priority=4)
  public void addEmoployee() throws InterruptedException {
	 fp.addEmoployee(driver); 
  }
  
  @Test(priority=5)
  public void personalDetails() throws InterruptedException {
		 fp.personalDetails(driver); 
	  } 
  /*
  @Test(priority=6)
  public void matchInfo() throws InterruptedException {
		 fp.matchInfo(driver); 
	  }
	  */
  
  @Test(priority=6)
  public void logOut(){
	  fp.logOut(driver);
  }
 
  /*
   @AfterTest
  public void close(){
	  driver.close();
  }
  */
}
