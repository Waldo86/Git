import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class test {
    private WebDriver driver;

    public test() {
        this.setUp();
    }

    @Before
    public void setUp () {
        driver = new FirefoxDriver();

    }
    @Test
    public void setUpBuilding () throws Exception {
        driver.get("https://ptk.pixelfederation.com/tool#project/20/env/42/tool/56");
        driver.findElement(By.id("email")).sendKeys("lspak@pixelfederation.com");
        driver.findElement(By.id("password")).sendKeys("Pokemon123");
        driver.findElement(By.id("_submit")).click();
        driver.get("https://ptk.pixelfederation.com/tool#project/20/env/43/tool/56/category/185/editor/1071/fieldSet/992/record/player_id/1626");
        WebElement myDynamicElement = (new WebDriverWait(driver, 20))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//table//div[@unselectable='on']//span[text()=\"Change Storage\"]")));
        myDynamicElement.click();
        driver.findElement(By.xpath("//*[@id=\"pftool-view-project-editorcontent-editor-form-field-select-1382-inputEl\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"pftool-view-project-editorcontent-editor-form-field-select-1382-picker-listEl\"]/li[4]")).click();
        driver.findElement(By.xpath("//*[@id=\"pftool-view-project-editorcontent-editor-form-field-text-1384-inputEl\"]")).sendKeys("1");
        driver.findElement(By.xpath("//*[@id=\"pftool-view-project-editorcontent-editor-form-field-text-1383-inputEl\"]")).sendKeys("3730");
        driver.findElement(By.xpath("//*[@id=\"button-1389\"]")).click();
    }


    @After
    public void tearDown(){
        driver.quit();

    }
}
