package stepDefinitions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DealsStepDefinition {

    WebDriver driver;


    @Given("^user is already on Login Page$")
    public void user_is_already_on_login_page() {
        System.setProperty("webdriver.chrome.driver", "C:\\Test\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.freecrm.com/index.html");
    }

    @When("^title of Login Page is FreeCRM$")
    public void title_of_login_page_is_free_CRM() {
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals("#1 Free CRM customer relationship management software cloud", title);
    }

    @Then("^user clicks on login button first time$")
    public void user_clicks_on_login_button_first_time() {
        driver.manage().window().maximize();
        driver.findElement(By.xpath("html/body/div[1]/header/div/nav/div[2]/div/a")).click();
//         JavascriptExecutor js = (JavascriptExecutor)driver;
//         js.executeScript("arguments[0].click();", loginBtn);
    }

    @Then("^user enters username and password$")
    public void user_enters_username_and_password(DataTable credentials) {
        driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
        List<List<String>> data = credentials.raw();
        driver.findElement(By.name("email")).sendKeys(data.get(0).get(0));
        driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
    }

    @Then("^user clicks on login button$")
    public void user_clicks_on_login_button() throws Throwable {
        WebElement loginBtn = driver.findElement(By.xpath(".//*[@id='ui']/div/div/form/div/div[3]"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", loginBtn);
    }

    @Then("^user is on home page$")
    public void user_is_on_home_page() throws Throwable {
        driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
        Thread.sleep(6000);
        String title = driver.getTitle();
        System.out.println("Home Page title ::" + title);
        Assert.assertEquals("Cogmento CRM", title);
    }

	 @Then("^user moves to new deal page$")
	 public void user_moves_to_new_deal_page() {
		Actions action = new Actions(driver);
    	action.moveToElement(driver.findElement(By.xpath(".//*[@id='main-nav']/div[5]/a"))).build().perform();
    	driver.findElement(By.xpath(".//*[@id='main-nav']/div[5]/a")).click();
		action.moveToElement(driver.findElement(By.xpath(".//*[@id='dashboard-toolbar']/div[2]/div/a[3]/button"))).build().perform();
		driver.findElement(By.xpath(".//*[@id='dashboard-toolbar']/div[2]/div/a[3]/button")).click();

		}

	 @Then("^user enters deal details$")
	 public void user_enters_contacts_details(DataTable dealData){
		 List<List<String>> dealValues =  dealData.raw();
		 driver.findElement(By.name("title")).sendKeys(dealValues.get(0).get(0));
		 driver.findElement(By.name("amount")).sendKeys(dealValues.get(0).get(1));
		 driver.findElement(By.name("probability")).sendKeys(dealValues.get(0).get(2));
		 driver.findElement(By.name("commission")).sendKeys(dealValues.get(0).get(3));
         Actions action = new Actions(driver);
         action.moveToElement(driver.findElement(By.xpath(".//*[@id='main-content']/div/div[2]/form/div[1]/div[1]/div/div/input"))).build().perform();
         driver.findElement(By.xpath(".//*[@id='main-content']/div/div[2]/form/div[1]/div[1]/div/div/input")).click();
	 }

    @Then("^Close the browser$")
    public void close_the_browser() {
        driver.quit();
    }
}
