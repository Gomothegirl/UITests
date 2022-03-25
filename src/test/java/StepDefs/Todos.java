package StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.cucumber.java.After;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Todos {

    /*@After
    public void tearDown() {
        driver.quit();
    }*/

    WebDriver driver;

    @Given("I am on the home page")
    public void i_am_on_the_home_page() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://todomvc.com/examples/react/#/");
    }

    @When("I click on what needs to be done")
    public void iClickOnWhatNeedsToBeDone() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement newtodo = driver.findElement(By.xpath("/html/body/section/div/header/input"));
        newtodo.click();
    }

    @Then("Add an Item to the list")
    public void addAnItemToTheList() {
        WebElement newtodo = driver.findElement(By.xpath("/html/body/section/div/header/input"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        newtodo.sendKeys("finish testing task");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        newtodo.sendKeys(Keys.ENTER);
    }

    @And("Item is visible")
    public void itemIsVisible() {
        WebElement newitem = driver.findElement(By.xpath("/html/body/section/div/section/ul/li/div/label"));
        newitem.isDisplayed();
    }

    @When("Cross Item Off")
    public void crossItemOff() {
        WebElement radiobutton = driver.findElement(By.xpath("/html/body/section/div/section/ul/li/div/input"));
        radiobutton.click();
    }

    @Then("Delete Item")
    public void deleteItem() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement delete = driver.findElement(By.xpath("/html/body/section/div/footer/button"));
        delete.click();
    }


}
