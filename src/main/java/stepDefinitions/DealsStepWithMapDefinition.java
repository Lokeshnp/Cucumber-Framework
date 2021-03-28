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
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class DealsStepWithMapDefinition {
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
        for(Map<String, String> data:credentials.asMaps(String.class, String.class)) {
            driver.findElement(By.name("email")).sendKeys(data.get("username"));
            driver.findElement(By.name("password")).sendKeys(data.get("password"));
        }
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
    public void user_enters_contacts_details(DataTable dealData) throws InterruptedException {
        for(Map<String, String> data:dealData.asMaps(String.class, String.class)) {
            driver.findElement(By.name("title")).sendKeys(data.get("title"));
     		driver.findElement(By.name("amount")).sendKeys(data.get("amount"));
 			driver.findElement(By.name("probability")).sendKeys(data.get("probability"));
			driver.findElement(By.name("commission")).sendKeys(data.get("commission"));
            Actions action = new Actions(driver);
            driver.findElement(By.xpath(".//*[@id='dashboard-toolbar']/div[2]/div/button[2]")).click();
            // move to new deal page
            Thread.sleep(5000);
            action.moveToElement(driver.findElement(By.xpath(".//*[@id='main-nav']/div[5]/a"))).build().perform();
            driver.findElement(By.xpath(".//*[@id='main-nav']/div[5]/a")).click();
            action.moveToElement(driver.findElement(By.xpath(".//*[@id='dashboard-toolbar']/div[2]/div/a[3]/button"))).build().perform();
            driver.findElement(By.xpath(".//*[@id='dashboard-toolbar']/div[2]/div/a[3]/button")).click();
//            action.moveToElement(driver.findElement(By.xpath(".//*[@id='dashboard-toolbar']/div[2]/div/a[3]/button"))).build().perform();

        }
    }

    @Then("^Close the browser$")
    public void close_the_browser() {
        driver.quit();
    }
}
