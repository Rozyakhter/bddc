package stepz1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Logincode1 {
	WebDriver driver;
	static String chromeDriver = "webdriver.chrome.driver";
	static String driverLocation = "C:\\Users\\Rozy Kabir\\Desktop\\rozy\\chromedriver.exe";
	static String url = "https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials";
	By loginIdXpath = By.xpath("//input[@id='txtUsername']");
	By logInpsXpath = By.xpath("//input[@id='txtPassword']");
	By loginBtnXpath = By.xpath("//input[@id='btnLogin']");

	@Given("I want to logIn orangeHrm page")
	public void i_want_to_logIn_orangeHrm_page() throws InterruptedException {
		System.setProperty(chromeDriver, driverLocation);
		driver = new ChromeDriver();
		driver.get(url);
		Thread.sleep(3000);
	}

	@Given("I want to maximize the window")
	public void i_want_to_maximize_the_window() {
		driver.manage().window().maximize();
	}

	@Given("I have to put correct Id")
	public void i_have_to_put_correct_Id() throws Exception {
		driver.findElement(loginIdXpath).sendKeys("Admin");
		Thread.sleep(1000);

	}

	@When("I have to put correct password")
	public void i_have_to_put_correct_password() throws Exception {

		driver.findElement(logInpsXpath).sendKeys("admin123");
		Thread.sleep(1000);

	}

	@When("click logIn button")
	public void click_logIn_button() throws Exception {

		driver.findElement(loginBtnXpath).click();
		Thread.sleep(3000);

	}

	@Then("close the browser")
	public void close_the_browser() {
		driver.close();
	}

	@Given("^User has to put his correct (.*)$")
	public void user_has_to_put_his_correct_Id(String Id) throws Exception {
		driver.findElement(loginIdXpath).sendKeys(Id);
		Thread.sleep(1000);

	}

	@When("^User has to put her correct (.*)$")
	public void user_has_to_put_her_correct_password(String password) throws InterruptedException {
		driver.findElement(logInpsXpath).sendKeys(password);
		Thread.sleep(1000);

	}
}