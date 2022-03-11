package stepdefinition;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import hooks.hooksClass;
import junit.framework.Assert;


public class course_catalog {
	WebDriver driver= hooksClass.driver;
	@Given("user is on the application")
	public void user_is_on_the_application() {
		 driver.get("http://elearningm1.upskills.in/index.php");
	     
	}

	@When("Enters the {string} and {string}")
	public void enters_the_and(String username, String password) {
	     driver.findElement(By.xpath("//input[@name='login']")).sendKeys(username);
	     driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	     
	}

	@When("Click the login button")
	public void click_the_login_button() {
	     driver.findElement(By.xpath("//button[@name='submitAuth']")).click();
	}
	
	@Then("varify the successful login")
	public void varify_the_successful_login() {
		try{
	 	WebElement obj= driver.findElement(By.xpath("//a[@class='dropdown-toggle']"));
	 	String actual= obj.getText();
	 	Assert.assertTrue(actual.contains("divya"));
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	     

	@When("Click on course catalog")
	public void click_on_course_catalog() {
	     driver.findElement(By.xpath("//a[text()='Course catalog']")).click();
	     
	}

	@When("Enter the {string} in search bar")
	public void enter_the_in_search_bar(String string) {
		driver.findElement(By.xpath("//input[@name='search_term']")).sendKeys(string);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	     
	     
	}

	@Then("Assert the fetched value with entered {string}")
	public void assert_the_fetched_value_with_entered(String string) {
		try{
		WebElement obj1=driver.findElement(By.xpath("//a[text()='Demo Course']"));
		String actual=obj1.getText();
		/*SoftAssert softassert=new SoftAssert();
		softassert.assertTrue(actual.contains(string));
		softassert.assertAll();*/
		
		Assert.assertTrue(actual.contains(string));
		
	    System.out.println("Searched value is related to the enetered value");
	    Thread.sleep(3000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}


	@When("click on category dropdown and select a category")
	public void click_on_category_dropdown_and_select_a_category() throws InterruptedException {
	     driver.findElement(By.xpath("//button[@title='Display all ( 7 )']")).click();
	     Thread.sleep(3000);
	     driver.findElement(By.xpath("//a/span[text()='none ( 6 ) ']")).click();
	     Thread.sleep(3000);
	}

	@Then("Assert the search value with categories")
	public void assert_the_search_value_with_categories() {
	 List<WebElement> obj= driver.findElements(By.xpath("//div[@class='col-xs-6 col-sm-6 col-md-3']"));
	 WebElement t=driver.findElement(By.xpath("//a/span[text()='none ( 6 ) ']"));
	 int s=obj.size(); 
	 String s1=""+s;
	 
	 Assert.assertTrue(s1.contains("6"));
	 System.out.println("Success");
	 
	}
	
	/*@Given("user is on elearning applicatio")
	public void user_is_on_elearning_applicatio() {
		 driver.get("http://elearningm1.upskills.in/index.php");
	}*/


	@When("Create a new account by passing these values {string}, {string}, {string}, {string}")
	public void create_a_new_account_by_passing_these_values(String f_nm, String l_nm, String email, String pass) {
		driver.findElement(By.xpath("//a[text()=' Sign up! ']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(f_nm);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(l_nm);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(email);
		String username=""+Math.random();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='pass1']")).sendKeys(pass);
		driver.findElement(By.xpath("//input[@name='pass2']")).sendKeys(pass);
		driver.findElement(By.xpath("//button[@name='submit']")).click();
		try
		{
		WebElement obj= driver.findElement(By.xpath("//*[contains(text(),'Dear')]"));
		String actual=obj.getText();
		Assert.assertTrue(actual.contains("Dear Divya Suman"));
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	@When("click on subscribe button and assert the successful subscription")
	public void click_on_subscribe_button_and_assert_the_successful_subscription() {
		try{
			driver.findElement(By.xpath("//a[text()='Homepage']")).click();
			driver.findElement(By.xpath("//a[text()='Course catalog']")).click();
			driver.findElement(By.xpath("(//a[@title='Subscribe'])[1]")).click();
			Thread.sleep(3000);
			WebElement obj=driver.findElement(By.xpath("//div[text()=' You have been registered to course: ']"));
			String actual=obj.getText();
			
			Assert.assertTrue(actual.contains("You have "));
			System.out.println("You have been registered");
			}
			catch(Exception e){
				System.out.println(e);
			}
	}

	@When("click on  registered course name")
	public void click_on_registered_course_name() {
	     driver.findElement(By.xpath("//a[text()='Demo Course']")).click();
	     
	}

	@Then("Assert the details of registered course")
	public void assert_the_details_of_registered_course() {
		try{
	    WebElement obj=driver.findElement(By.xpath("//h2[text()='Introduction text']"));
	    String actual=obj.getText();
		Assert.assertTrue(actual.contains("Introduction text")); 
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}


}
