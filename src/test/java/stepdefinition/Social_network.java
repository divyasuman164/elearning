package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import hooks.hooksClass;
import junit.framework.Assert;

public class Social_network {
	WebDriver driver= hooksClass.driver;
	@Given("User is in the application")
	public void user_is_in_the_application() {
		 driver.get("http://elearningm1.upskills.in/index.php");
	}

	
	@When("login as a registered user {string} {string}")
	public void login_as_a_registered_user(String username, String password) {
		 driver.findElement(By.xpath("//input[@name='login']")).sendKeys(username);
	     driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	     driver.findElement(By.xpath("//button[@name='submitAuth']")).click();
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

	@When("Navigate to the social network page search the {string} and its type and assert it")
	public void navigate_to_the_social_network_page_search_the_and_its_type_and_assert_it(String user) {
	 try{
	   driver.findElement(By.xpath("//a[text()='Social network']")).click();
	   driver.findElement(By.xpath("//input[@name='q']")).sendKeys(user);
	   driver.findElement(By.xpath("//button[@title='Select']")).click();
	   driver.findElement(By.xpath("//span[text()='User']")).click();
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("//button[@name='submit']")).click();
	   WebElement obj=driver.findElement(By.xpath("(//a[contains(text(),'Divya')])[2]"));
	   String actual=obj.getText();
	   
	   Assert.assertTrue(actual.contains(user));
	   System.out.println("Succesfully searched related users");
	 }
	 catch(Exception e)
	 {
		 System.out.println(e);
	 }
	}

	@When("click on send invitation and send the invitation request with {string}")
	public void click_on_send_invitation_and_send_the_invitation_request_with(String text) {
		
		//model window xpath: //div[@id='send-invitation-modal']
		try{
		  driver.findElement(By.xpath("(//a[text()=' Send invitation'])[3]")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//textarea[@id='content_invitation_id']")).sendKeys(text);
		  driver.findElement(By.xpath("//button[@id='btn-send-invitation']")).click();
		  Thread.sleep(2000);
		  
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	@Then("Request sent successfully")
	public void request_sent_successfully() {
	   try{
		      WebElement obj= driver.findElement(By.xpath("//div[contains(text(),'invitation')]"));
			  String actual=obj.getText();
			  Assert.assertTrue(actual.contains("invitation"));
			  
			  System.out.println("Sent Invitation works properly");
	   }
	   catch(Exception e)
	   {
		   System.out.println(e);
	   }
	}
	
	@When("click on send message button and send the {string} and {string}")
	public void click_on_send_message_button_and_send_the_and(String subject, String message) {
		try{
			
			driver.findElement(By.xpath("(//a[text()=' Send message'])[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@id='subject_id']")).sendKeys(subject);
			driver.findElement(By.xpath("//textarea[@id='content_id']")).sendKeys(message);
			driver.findElement(By.xpath("//a[@id='send_message_link']")).click();
			Thread.sleep(2000);
		   
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}


	@Then("Message sent successfully")
	public void message_sent_successfully() {
		
	   try{
		    WebElement obj= driver.findElement(By.xpath("//div[text()=' Your message has been sent.']"));
			String actual=obj.getText();
			Assert.assertTrue(actual.contains("Your message"));
			System.out.println("Message sent successfully");
	   }
	   catch(Exception e)
	   {
		   System.out.println(e);
	   }
	  
	}


}
