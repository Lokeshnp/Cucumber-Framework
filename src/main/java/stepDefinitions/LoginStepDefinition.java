//package stepDefinitions;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import java.util.concurrent.TimeUnit;
//
//public class LoginStepDefinition {
//    WebDriver driver;
//    @Given("^user is already is on Login Page$")
//    public void user_is_already_on_login_page(){
//        System.setProperty("webdriver.chrome.driver", "C:\\Test\\chromedriver.exe");
//        driver=new ChromeDriver();
//        driver.get("https://www.freecrm.com/index.html");
//    }
//
//    @When("^title of Login Page is FreeCRM$")
//    public void title_of_login_page_is_free_CRM(){
//        String title = driver.getTitle();
// 	 System.out.println(title);
//     Assert.assertEquals("#1 Free CRM customer relationship management software cloud", title);
// 	 }
//
// 	 @Then("^user clicks on login button first time$")
//     public void user_clicks_on_login_button_first_time(){
//        driver.manage().window().maximize();
//         driver.findElement(By.xpath("html/body/div[1]/header/div/nav/div[2]/div/a")).click();
////         JavascriptExecutor js = (JavascriptExecutor)driver;
////         js.executeScript("arguments[0].click();", loginBtn);
//     }
//
//     //Reg Exp:
////	 //1. \"([^\"]*)\"
////	 //2. \"(.*)\"
//
//    @Then("^user enters \"(.*)\" and \"(.*)\"$")
//    public void user_enters_username_and_password(String username, String password) {
//        driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
// 	 driver.findElement(By.name("email")).sendKeys(username);
//	 driver.findElement(By.name("password")).sendKeys(password);
//    }
//
//    @Then("^user clicks on login button$")
//    public void user_clicks_on_login_button() throws Throwable {
//        WebElement loginBtn = driver.findElement(By.xpath(".//*[@id='ui']/div/div/form/div/div[3]"));
//	 JavascriptExecutor js = (JavascriptExecutor)driver;
//	 js.executeScript("arguments[0].click();", loginBtn);
//    }
//
//    @Then("^user is on home page$")
//    public void user_is_on_home_page() throws Throwable {
//        driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
//        Thread.sleep(6000);
//        String title = driver.getTitle();
//	 System.out.println("Home Page title ::"+ title);
//     Assert.assertEquals("Cogmento CRM", title);
//    }
//
//    @Then("^user moves to new contact page$")
//	 public void user_moves_to_new_contact_page() {
//		//driver.switchTo().frame("mainpanel");
//		Actions action = new Actions(driver);
//		action.moveToElement(driver.findElement(By.xpath("html/body/div[1]/div/div[1]/div[3]/button"))).build().perform();
//		driver.findElement(By.xpath("html/body/div[1]/div/div[1]/div[3]/button")).click();
//        action.moveToElement(driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div[2]/div/div[1]"))).build().perform();
//        driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div[2]/div/div[1]")).click();
//
//		}
//
//
//	 @Then("^user enters contact details \"(.*)\" and \"(.*)\" and \"(.*)\"$")
//	 public void user_enters_contacts_details(String firstname, String lastname, String position){
//		 driver.findElement(By.name("first_name")).sendKeys(firstname);
//		 driver.findElement(By.name("last_name")).sendKeys(lastname);
//		 driver.findElement(By.name("position")).sendKeys(position);
//		 driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div[2]/div/div[1]/div[2]/div/button[2]")).click();
//	 }
//
//
//	 @Then("^Close the browser$")
//	 public void close_the_browser(){
//		 driver.quit();
//	 }
//
//}
