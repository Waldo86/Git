package git;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;


public class test {
    private WebDriver driver;

    @Before
    public void setUp(){
        driver = new FirefoxDriver();

    }

    @Test
    public void test() throws InterruptedException {
            driver.get("https://ptk.pixelfederation.com/tool#project/20/env/42/tool/56");
            driver.manage().window().maximize();
            driver.findElement(By.id("email")).sendKeys("lspak@pixelfederation.com");
            driver.findElement(By.id("password")).sendKeys("Pokemon123");
            driver.findElement(By.id("_submit")).click();
            driver.get("https://ptk.pixelfederation.com/tool#project/20/env/43/tool/56/category/185/editor/1071/fieldSet/992/record/player_id/1626");
            driver.findElement(By.xpath("//*[@id=\"ext-element-71\"]/div/span"));
    }

    @After
    public void tearDown(){

    }


}
