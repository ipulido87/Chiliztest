package StepsForHooks;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import Service.UtilPropiedades;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;


public class Hooks {
	
	
	public static WebDriver driver;

	public static UtilPropiedades pUtil = new UtilPropiedades("datos.properties");

	public static final String URL = pUtil.getValorKey("url");

	
	

	@Before(order=0)
	public void browserSetup() {

		System.out.println(" I am inside browserSetup");

		driver= DriveManager.getDriver();
		
		
		System.out.println("Inside Step - browser is open");

		System.out.println("Project path is :" +DriveManager.projectPath);
		
		System.setProperty("webdriver.chrome.driver",DriveManager.projectPath+"/src/test/resources/drivers/chromedriver.exe");
		
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		driver.get(URL);
		

	/*	try {
			
			System.out.println("Inside Step - browser is open");

			System.out.println("Project path is :" +DriveManager.projectPath);
			
			System.setProperty("webdriver.chrome.driver",DriveManager.projectPath+"/src/test/resources/drivers/chromedriver.exe");
			
		
			DriveManager.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
			DriveManager.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
			
			driver.get(url);
			
			
		} catch (Exception e) {
			  
			  System.out.println(e.getCause());
		}
		
		*/
	}


	@After
	public void tearDown(){
		
		System.out.println(" I am inside tearDown");

		driver.close();
		driver.quit();

	}
	
	@Before
	public  void beforeSteps() {
		
		System.out.println(" I am inside beforeSteps");
		
	}
	
	@AfterStep
	public void afterSteps() {
		System.out.println(" I am inside afterSteps");
	}


	@Given("user is on login page")
	public void user_is_on_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Inside Step - user is on login page");
	}

	@When("user enters valid username and password")
	public void user_enters_valid_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Inside Step - user enters valid username and password");
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Inside Step - clicks on login button");
	}

	@Then("user is navigated to the home page")
	public void user_is_vavigated_to_the_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Inside Step - user is navigated to the home page");
	}



}
