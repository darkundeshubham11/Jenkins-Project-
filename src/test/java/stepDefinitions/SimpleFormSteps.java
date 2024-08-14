package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SimpleFormSteps {
	WebDriver driver;

	@Given("The user is on the Simple Form page")
	public void the_user_is_on_the_simple_form_page() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://v1.training-support.net/selenium/simple-form");
	}

	@When("The user enters their details")
	public void the_user_enters_their_details() {
		WebElement firstName = driver.findElement(By.id("firstName"));
		WebElement lastName = driver.findElement(By.id("lastName"));
		WebElement email = driver.findElement(By.id("email"));
		WebElement phone = driver.findElement(By.id("number"));
		WebElement message = driver.findElement(By.xpath("//div/textarea[@rows=\"2\"]"));

		firstName.sendKeys("Shubham");
		lastName.sendKeys("Darkunde");
		email.sendKeys("sd@gmail.com");
		phone.sendKeys("1234567890");
		message.sendKeys("Hi, I am Shubham Darkunde");
	}

	@When("The user clicks on the submit button")
	public void the_user_clicks_on_the_submit_button() {
		driver.findElement(By.cssSelector(".ui.green.button")).click();
	}

	@Then("A confirmation message is displayed")
	public void a_confirmation_message_is_displayed() {
//		String message = driver.findElement(By.id("message")).getText();
//		Assert.assertTrue(message.contains("Thank you"), "Confirmation message is not displayed correctly.");
//		driver.quit();
	}

}
