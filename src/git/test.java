package git;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class test {
    private WebDriver driver;

    @Before
    public void setUp(){
        driver = new FirefoxDriver();

    }

    @Test
    public void test() throws InterruptedException {
        driver.get("https://ptk.pixelfederation.com/tool#project/20/env/42/tool/56");
        driver.findElement(By.id("email")).sendKeys("lspak@pixelfederation.com");
        driver.findElement(By.id("password")).sendKeys("Pokemon123");
        driver.findElement(By.id("_submit")).click();

        new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOfElementLocated(By.className("l-navigation-togglebutton")));
        Assert.assertTrue(driver.findElement(By.className("l-navigation-togglebutton")).isDisplayed());
        driver.findElement(By.className("l-navigation-togglebutton")).click();

        new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOfElementLocated(By.className("l-project-image")));
        Assert.assertTrue(driver.findElement(By.className("l-project-image")).isDisplayed());
        driver.findElement(By.)

    }

    @After
    public void tearDown(){

    }


}
