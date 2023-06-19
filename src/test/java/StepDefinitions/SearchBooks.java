package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import StepsForHooks.DriveManager;
import StepsForHooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class SearchBooks {
	
	public static WebDriver driver;
	public static final String projectPath = System.getProperty("user.dir");
	
	
	@Given("I am on the Maltapark website")
	public void i_am_on_the_maltapark_website() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.print("Next -Step --  I am on the Maltapark website");
	    
	    driver  = DriveManager.getDriver();
		
		
		 String  URL = Hooks.URL;
		 driver.manage().window().maximize();
		 
			System.out.println("Inside Step - browser is open");

			System.out.println("Project path is :" +projectPath);
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
			
			driver.get(URL);
			
			Thread.sleep(3000);

	}

	@When("I click on the {string} dropdown")
	public void i_click_on_the_dropdown(String string) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		System.out.print("Next -Step --  I click on the {string} dropdown");
		
		
		WebElement clickdropdown = driver.findElement(By.xpath("//*[@id=\"searchselector\"]/i"));
		clickdropdown.click();
		
		Thread.sleep(3000);
		
		WebElement selectbooks = driver.findElement(By.xpath("//*[@id=\"searchselector\"]/div[2]/div[5]"));
		selectbooks.click();

		Thread.sleep(5000);
	}

	@And("I select {string} from the dropdown")
	public void i_select_from_the_dropdown(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.print("Next -Step --  I select {string} from the dropdown");

		
		WebElement searchinput = driver.findElement(By.id("search"));
		searchinput.sendKeys("Computer");
		

        
	}

	@And("I enter {string} in the search area")
	public void i_enter_in_the_search_area(String string) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		System.out.print("Next -Step --  I am on the Maltapark website");
	
		WebElement buttonsearch = driver.findElement(By.xpath("/html/body/div/header/div[1]/div/div[1]/form/div/button"));
		
		buttonsearch.click();
		
		Thread.sleep(3000);
	}

	@And("I click the search button")
	public void i_click_the_search_button() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.print("Next -Step --  I click the search button");
	}

	@Then("I should see the description and price of the first item in the list")
	public void i_should_see_the_description_and_price_of_the_first_item_in_the_list() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		System.out.print("Next -Step --  I should see the description and price of the first item in the list");
		
		WebElement descriptionElement = driver.findElement(By.cssSelector("#page-content-left > div.ui.items.listings.gridview.featured.clearfix > div.item.featured.e4.e3.e2.i0 > div.content > a"));
		WebElement priceelement = driver.findElement(By.cssSelector("#page-content-left > div.ui.items.listings.gridview.featured.clearfix > div.item.featured.e4.e3.e2.i0 > div.content > div > span > span > span"));
		String description = descriptionElement.getText();
		
		String Price = priceelement.getText();
		
		System.out.println("Description: " + description);
        System.out.println("Price: " + Price);
        
        Thread.sleep(50000);
 
	}
}