package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Hook.hooksclass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepDefination {
	WebDriver driver = hooksclass.driver;
	@Given("User is on Uniform Application")
	public void user_is_on_Uniform_Application() {
	    // Write code here that turns the phrase above into concrete actions
		String title = driver.getTitle();
		System.out.println(title);
	}

	@When("User enter {string} and {string}")
	public void user_enter_and(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		 try {
			  driver.findElement(By.id("input-username")).sendKeys("admin");
			  driver.findElement(By.id("input-password")).sendKeys("admin@123");
		 }
			  catch(Exception e) {
			  System.out.println("Not able to enter login details"+e); }
		
		
	}

	@When("Click on Login button")
	public void click_on_Login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    try {
	    	driver.findElement(By.xpath("//button[@type='submit']")).click();
	    }
		catch(Exception e)
	    {
			System.out.println("Unable to click"+e);
	    }
		
	}

	@Then("User navigate to Dashboard")
	public void user_navigate_to_Dashboard() {
	    // Write code here that turns the phrase above into concrete actions
		  
		  try {
			  Thread.sleep(3000); 
			  String expectedtitle="Dashboard";
			  String actualtitle = driver.getTitle();
			  Assert.assertEquals(expectedtitle,actualtitle);
			  System.out.println("You are able  to navigate to the welcome page");

	  
	  
	  }  
	  catch(Exception e)
	  {
		  System.out.println("Unable to nav"+e);
		  Assert.fail();
	  }
	
	
	
	}
	@Given("User click on catalog  option")
	public void user_click_on_catalog_option() {
	    // Write code here that turns the phrase above into concrete actions
	    try {
	    	driver.findElement(By.xpath("//*[@id=\"catalog\"]/a")).click();
	    }
	    catch(Exception e){
	    	System.out.println("Unable to click on catalog"+e);
	    	
	    }
	}

	@Then("User select category")
	public void user_select_category() {
	    // Write code here that turns the phrase above into concrete actions
		  try {
		    	driver.findElement(By.xpath("//*[@id=\"catalog\"]/ul/li[1]/a")).click();
		    }
		    catch(Exception e){
		    	System.out.println("Unable to click on category"+e);
		    	
		    }
	}

	@Then("User navigate to category dashboard")
	public void user_navigate_to_category_dashboard() {
	    // Write code here that turns the phrase above into concrete actions
		try {
			  Thread.sleep(3000); 
			  String expectedtitle="Categories";
			  String actualtitle = driver.getTitle();
			  Assert.assertEquals(expectedtitle,actualtitle);
			  System.out.println("You are able  to navigate to the Category page");

	  
	  
	  }  
	  catch(Exception e)
	  {
		  System.out.println("Unable to nav to category"+e);
		  Assert.fail();
	  }
	
	
	
	}

@Given("User clicks on add button")
public void user_clicks_on_add_button() {
    // Write code here that turns the phrase above into concrete actions
	try {
    	driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/div/a[1]")).click();
    }
    catch(Exception e){
    	System.out.println("Unable to click on Add button"+e);
    	
    }

}
@Then("User enters {string} and {string}")
public void user_enters_and(String string, String string2) {
	try {
	driver.findElement(By.xpath("//*[@id=\"input-name1\"]")).sendKeys(string);
	driver.findElement(By.xpath("//*[@id=\"input-meta-title1\"]")).sendKeys(string2);
	
	
	}
	catch(Exception e)
	{
		System.out.println("Unable to add category and meta tag title"+e);
	}
}

@Then("User clicks on save button")
public void user_clicks_on_save_button() {
    // Write code here that turns the phrase above into concrete actions
	try {
    	driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/div/button")).click();
    }
    catch(Exception e){
    	System.out.println("Unable to click on Save button"+e);
    	
    }   


}

@Then("User navigates the Success message")
public void user_navigates_the_Success_message() {
    // Write code here that turns the phrase above into concrete actions
    
	try
	{
		Thread.sleep(3000);
		String expectedtitle = "Categories";
		String actualtitle = driver.getTitle();
		Assert.assertEquals(expectedtitle,actualtitle);
		System.out.println("You are able  to navigate to the message page confirmation");
		
	}
	catch(Exception e)
	{
		System.out.println("Not able to navigate to the message page confirmation"+e);
		Assert.fail();
	}
	
	
	
}
@Given("User go to category option")
public void user_go_to_category_option() {
    // Write code here that turns the phrase above into concrete actions
	 try {
	    	driver.findElement(By.xpath("//*[@id=\"catalog\"]/ul/li[1]/a")).click();
	    }
	    catch(Exception e){
	    	System.out.println("Unable to click on category"+e);
	    	
	    }
	
}



@Then("User click on edit button")
public void user_click_on_edit_button() {
    // Write code here that turns the phrase above into concrete actions
	try {
    	driver.findElement(By.xpath("//*[@id=\"form-category\"]/div/table/tbody/tr[1]/td[4]/a")).click();
    	
    }
    catch(Exception e){
    	System.out.println("Unable to click on Edit button"+e);
    	
    }
}

@Then("User edits {string} and {string}")
public void user_edits_and(String string, String string2) {
    // Write code here that turns the phrase above into concrete actions
	try {
		
		driver.findElement(By.xpath("//*[@id=\"input-name1\"]")).sendKeys(string);
		driver.findElement(By.xpath("//*[@id=\"input-meta-title1\"]")).sendKeys(string2);
		
		
		}
		catch(Exception e)
		{
			System.out.println("Unable to edit category and meta tag title"+e);
		}
}

@Then("User clicks on  the save button")
public void user_clicks_on_the_save_button() {
    // Write code here that turns the phrase above into concrete actions
	try {
    	driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/div/button")).click();
    }
    catch(Exception e){
    	System.out.println("Unable to click on Save button"+e);
    	
    }   
}

@Then("User navigates the success message")
public void user_navigates_the_success_message() {
    // Write code here that turns the phrase above into concrete actions
	try
	{
		Thread.sleep(3000);
		String expectedtitle = "Categories";
		String actualtitle = driver.getTitle();
		Assert.assertEquals(expectedtitle,actualtitle);
		System.out.println("You are able  to navigate to the message page confirmation");
		
	}
	catch(Exception e)
	{
		System.out.println("Not able to navigate to the message page confirmation"+e);
		Assert.fail();
	}
	
	
}

@Then("user wants to sort according to category name")
public void user_wants_to_sort_according_to_category_name() {
    
	try {
    	driver.findElement(By.xpath("//*[@id=\"form-category\"]/div/table/thead/tr/td[2]/a")).click();
    	Thread.sleep(3000);
    }
    catch(Exception e){
    	System.out.println("Unable to click on category name"+e);
    	
    }   
    
}

@Then("user wants to sort according to sort order")
public void user_wants_to_sort_according_to_sort_order() {
	try {
    	driver.findElement(By.xpath("//*[@id=\"form-category\"]/div/table/thead/tr/td[3]/a")).click();
    	Thread.sleep(3000);
	}
    catch(Exception e){
    	System.out.println("Unable to click on sort order"+e);
    	
    }   
    
	
}
@Then("user selects category")
public void user_selects_category() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	try{
		driver.findElement(By.xpath("//*[@id=\"form-category\"]/div/table/tbody/tr[1]/td[1]/input")).click();
	Thread.sleep(3000);
	}
	catch(Exception e)
	{
		System.out.println("Unable to select category"+e);
	}
	
}


@Then("user deletes the category")
public void user_deletes_the_category() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    try {
	driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/div/button")).click();
	System.out.println("Deleted Successfully");
	Thread.sleep(3000);

    
    }
    catch(Exception e)
    {
    	System.out.println("Unable to delete "+e);
	
    }
}
@Then("User clicks on home button")
public void user_clicks_on_home_button() throws InterruptedException {
	try {
	
	driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/ul/li[1]/a")).click();
	Thread.sleep(3000);
	}
	catch(Exception e)
	{
		System.out.println("unable to click on home button"+e);

	}
    
}

@Then("User navigates to dashboard")
public void user_navigates_to_dashboard() {
    
	try
	{
		Thread.sleep(3000);
		String expectedtitle = "Dashboard";
		String actualtitle = driver.getTitle();
		Assert.assertEquals(expectedtitle,actualtitle);
		Thread.sleep(3000);
		System.out.println("You are able  to navigate to the Dashboard");
		
	}
	catch(Exception e)
	{
		System.out.println("Not able to navigate to the Dashboard"+e);
		Assert.fail();
	}
	
}


@Then("User clicks on rebuild button")
public void user_clicks_on_rebuild_button() throws InterruptedException {
	try {
	driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/div/a[2]")).click();
	Thread.sleep(3000);
	}
	catch(Exception e)
	{
		System.out.println("User is unable to click on rebuild button"+e);

	}
}

@Then("User navigates success message")
public void user_navigates_success_message() {
	try
	{
		Thread.sleep(3000);
		String expectedtitle = "Categories";
		String actualtitle = driver.getTitle();
		Assert.assertEquals(expectedtitle,actualtitle);
		System.out.println("You are able  to navigate to the message page confirmation");
		
	}
	catch(Exception e)
	{
		System.out.println("Not able to navigate to the message page confirmation"+e);
		Assert.fail();
	}
	
	
	
	
	
	
	
}

@Then("User wants to go to next page")
public void user_wants_to_go_to_next_page() {
 try {
	 driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/div[2]/div/div[1]/ul/li[2]/a")).click();
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/div[2]/div/div[1]/ul/li[5]/span")).click();
	 Thread.sleep(3000);	
	 
 }   
catch(Exception e)
 {
	System.out.println("Unable to nav"+e);

 }
}

@Then("User is able to navigate to next page")
public void user_is_able_to_navigate_to_next_page() {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("User navigates sucessfully");
}


@Given("User click on Shopping  option")
public void user_click_on_Shopping_option() {
    // Write code here that turns the phrase above into concrete actions
	try {
		
		driver.findElement(By.xpath("//*[@id=\"menu\"]/li[7]/a")).click();
		Thread.sleep(3000);
		}
		catch(Exception e)
		{
			System.out.println("unable to click on Shopping option button"+e);

		}


}

@Then("User select Coupons")
public void user_select_Coupons() {
    // Write code here that turns the phrase above into concrete actions
try {
		
		driver.findElement(By.xpath("//*[@id=\"menu\"]/li[7]/ul/li[3]/a")).click();
		Thread.sleep(3000);
		}
		catch(Exception e)
		{
			System.out.println("unable select Coupons"+e);

		}


}

	



@Then("User navigate to Coupon dashboard")
public void user_navigate_to_Coupon_dashboard() {
    // Write code here that turns the phrase above into concrete actions
    try
	{
		Thread.sleep(3000);
		String expectedtitle = "Coupons";
		String actualtitle = driver.getTitle();
		Assert.assertEquals(expectedtitle,actualtitle);
		Thread.sleep(3000);
		System.out.println("You are able  to navigate to the Coupons Field");
		
	}
	catch(Exception e)
	{
		System.out.println("You are not able  to navigate to the Coupons Field"+e);
		Assert.fail();
	}
	
	
	
}

@Then("User clicks on Add button")
public void user_clicks_on_Add_button() {
   
try {
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/div/a")).click();
		Thread.sleep(3000);
		}
		catch(Exception e)
		{
			System.out.println("unable click on add button"+e);

		}


}



@Then("enters the {string},{string},{string},{string},{string},{string},{string},{string},{string},{string}")
public void enters_the(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10) {
try {
	driver.findElement(By.xpath("//*[@id=\"input-name\"]")).sendKeys(string);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"input-code\"]")).sendKeys(string2);	
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"input-discount\"]")).sendKeys(string3);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"input-total\"]")).sendKeys(string4);	
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"input-product\"]")).sendKeys(string5);	
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"input-category\"]")).sendKeys(string6);	
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"input-date-start\"]")).sendKeys(string7);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"input-date-end\"]")).sendKeys(string8);	
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"input-uses-total\"]")).sendKeys(string9);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"input-uses-customer\"]")).sendKeys(string10);
	Thread.sleep(3000);
		
		Thread.sleep(3000);
		}
		catch(Exception e)
		{
			System.out.println("unable to Add values "+e);

		}


}
    


@Then("user clicks on save button")
public void user_clicks_on_save_button1() {
try {
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/div/button")).click();
		Thread.sleep(3000);
		}
		catch(Exception e)
		{
			System.out.println("unable click on save button"+e);

		}


    
}

@Then("user navigates to dashboard getting a success message.")
public void user_navigates_to_dashboard_getting_a_success_message() {
    
    
	 try
		{
			Thread.sleep(3000);
			String expectedtitle = "Coupons";
			String actualtitle = driver.getTitle();
			Assert.assertEquals(expectedtitle,actualtitle);
			Thread.sleep(3000);
			System.out.println("You are able  to navigate to the Coupons Field");
			
		}
		catch(Exception e)
		{
			System.out.println("You are not able  to navigate to the Coupons Field"+e);
			Assert.fail();
		}
		




}
@Then("User selects coupons to delete")
public void user_selects_coupons_to_delete() {
    // Write code here that turns the phrase above into concrete actions
try {
		
		
		driver.findElement(By.xpath("//*[@id=\"form-coupon\"]/div/table/tbody/tr[2]/td[1]/input")).click();
		

		Thread.sleep(3000);
		}
		catch(Exception e)
		{
			System.out.println("unable click on select  button for deleting"+e);

		}


    
}


@Then("User clicks on delete button")
public void user_clicks_on_delete_button() {
    // Write code here that turns the phrase above into concrete actions
    
try {
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/div/button")).click();
		Thread.sleep(3000);
		}
		catch(Exception e)
		{
			System.out.println("unable click on delete  button"+e);

		}



}

@Then("user gets success message and navigates to dashboard.")
public void user_gets_success_message_and_navigates_to_dashboard() {
    // Write code here that turns the phrase above into concrete actions
	 try
		{
			Thread.sleep(3000);
			String expectedtitle = "Coupons";
			String actualtitle = driver.getTitle();
			Assert.assertEquals(expectedtitle,actualtitle);
			Thread.sleep(3000);
			System.out.println("You are able  to navigate to the Coupons Field");
			
		}
		catch(Exception e)
		{
			System.out.println("You are not able  to navigate to the Coupons Field"+e);
			
		}

}
@Then("User clicks on Home button")
public void user_clicks_on_Home_button() {
    // Write code here that turns the phrase above into concrete actions
try {
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/ul/li[1]/a")).click();
		Thread.sleep(3000);
		}
		catch(Exception e)
		{
			System.out.println("unable click on home button"+e);

		}


}

@Then("User navigates to dashboard.")
public void user_navigates_to_dashboard1() {
    // Write code here that turns the phrase above into concrete actions
    
	try
	{
		Thread.sleep(3000);
		String expectedtitle = "Dashboard";
		String actualtitle = driver.getTitle();
		Assert.assertEquals(expectedtitle,actualtitle);
		Thread.sleep(3000);
		System.out.println("You are able  to navigate to the Coupons Field");
		
	}
	catch(Exception e)
	{
		System.out.println("You are not able  to navigate to the Coupons Field"+e);
		Assert.fail();
	}
}
@Then("User sorts according to Coupon name")
public void user_sorts_according_to_Coupon_name() {
    // Write code here that turns the phrase above into concrete actions
try {
		
		driver.findElement(By.xpath("//*[@id=\"form-coupon\"]/div/table/thead/tr/td[2]/a")).click();
		Thread.sleep(3000);
		}
		catch(Exception e)
		{
			System.out.println("unable to sort"+e);

		}
}

@Then("User sorts according to Code")
public void user_sorts_according_to_Code() {
    // Write code here that turns the phrase above into concrete actions
try {
		
		driver.findElement(By.xpath("//*[@id=\"form-coupon\"]/div/table/thead/tr/td[3]/a")).click();
		Thread.sleep(3000);
		}
		catch(Exception e)
		{
			System.out.println("unable sort"+e);

		}
}
  


@Then("User sorts according to Discount")
public void user_sorts_according_to_Discount() {
    // Write code here that turns the phrase above into concrete actions
try {
		
		driver.findElement(By.xpath("//*[@id=\"form-coupon\"]/div/table/thead/tr/td[4]/a")).click();
		Thread.sleep(3000);
		}
		catch(Exception e)
		{
			System.out.println("unable to sort"+e);

		}
}
  


@Then("User sorts according to Status")
public void user_sorts_according_to_Status() {
    // Write code here that turns the phrase above into concrete actions
try {
		
		driver.findElement(By.xpath("//*[@id=\"form-coupon\"]/div/table/thead/tr/td[7]/a")).click();
		Thread.sleep(3000);
		}
		catch(Exception e)
		{
			System.out.println("unable to sort"+e);

		}
}
  


@Then("User sorts according to Date_start")
public void user_sorts_according_to_Date_start() {
    // Write code here that turns the phrase above into concrete actions
try {
		
		driver.findElement(By.xpath("//*[@id=\"form-coupon\"]/div/table/thead/tr/td[5]/a")).click();
		Thread.sleep(3000);
		}
		catch(Exception e)
		{
			System.out.println("unable to sort"+e);

		}
}
  


@Then("User sorts according to Date_end")
public void user_sorts_according_to_Date_end() {
    // Write code here that turns the phrase above into concrete actions
try {
		
		driver.findElement(By.xpath("//*[@id=\"form-coupon\"]/div/table/thead/tr/td[6]/a")).click();
		Thread.sleep(3000);
		}
		catch(Exception e)
		{
			System.out.println("unable to sort"+e);

		}
}
  

@Then("User go to edit option")
public void user_go_to_edit_option() {
    // Write code here that turns the phrase above into concrete actions
try {
		
		driver.findElement(By.xpath("//*[@id=\"form-coupon\"]/div/table/tbody/tr[1]/td[8]/a")).click();
		Thread.sleep(3000);
		}
		catch(Exception e)
		{
			System.out.println("unable to click"+e);

		}
}

@Then("User go to edit History")
public void user_go_to_edit_History() {
    // Write code here that turns the phrase above into concrete actions
try {
		
		driver.findElement(By.xpath("//*[@id=\"form-coupon\"]/ul/li[2]/a")).click();
		
		Thread.sleep(3000);
		}
		catch(Exception e)
		{
			System.out.println("unable to click the edit history button"+e);

		}
		
}

@Then("User clicks on checkbox")
public void user_clicks_on_checkbox() {
    // Write code here that turns the phrase above into concrete actions
try {
		
		driver.findElement(By.xpath("//*[@id=\"form-coupon\"]/div/table/tbody/tr[1]/td[1]/input")).click();
		Thread.sleep(3000);
		}
		catch(Exception e)
		{
			System.out.println("unable to click"+e);

		}
}

@Then("User clicks on edit option")
public void user_clicks_on_edit_option() {
    // Write code here that turns the phrase above into concrete actions
try {
		
		driver.findElement(By.xpath("//*[@id=\"form-coupon\"]/div/table/tbody/tr[1]/td[8]/a")).click();
		Thread.sleep(3000);
		}
		catch(Exception e)
		{
			System.out.println("unable to click"+e);

		}
}

@Then("user edits {string} {string}")
public void user_edits(String string, String string2) {
    // Write code here that turns the phrase above into concrete actions
try {
		
	driver.findElement(By.xpath("//*[@id=\"input-name\"]")).sendKeys(string);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"input-code\"]")).sendKeys(string2);	
	driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/div/button")).click();
	Thread.sleep(3000);
		}
		catch(Exception e)
		{
			System.out.println("unable to Edit"+e);

		}
}













}















































