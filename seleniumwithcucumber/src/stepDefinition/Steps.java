package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Steps {
	WebDriver driver;	
@Given("^open gmail and launch the application$")
public void open_chrome_and_launch_application()
{
	//System.out.println("This Step is to open gmail and lauch the application");
	System.setProperty("webdriver.chrome.driver","E:\\Amruta\\Selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("www.gmail.com");
	driver.manage().window().maximize();
	
}
@When("^Enter the username and password$")
public void enter_username_and_pasword()
{
	//System.out.println("This is to enter username and password on the gmail login page");
	driver.findElement(By.name("identifier")).sendKeys("");   //Enter username
	driver.findElement(By.name("password")).sendKeys("");   //Enter password
	driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/div[2]\r\n"+"}")).click();
}
@Then("^compose an email")
public void compose_email_and_send()
{
	//System.out.println("This step is used to compose an email and sent it");
	driver.findElement(By.xpath("//*[contains@id,':m5']")).click(); //click o compose button
	driver.findElement(By.name("to")).sendKeys("receivers email id");  //type email id of receiverdriver.findElement(By.id("t1")).sendKeys("hello World");   //In email compose body
	driver.findElement(By.id(":86")).click();    //click on send
}

public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
