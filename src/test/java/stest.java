import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class stest {

    @Test
    public void firstGoogleTest() throws InterruptedException {

        WebDriver driver= new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        driver.get("http://demo.litecart.net/admin/");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        List<WebElement> allFirstElementsWeb = driver.findElements(By.className("app"));
        for (int i=0; i < allFirstElementsWeb.size(); i++){
            allFirstElementsWeb = driver.findElements(By.className("app"));
            allFirstElementsWeb.get(i).click();
            driver.findElement(By.xpath("//div[contains(@class,'panel-heading')]"));

            if (!driver.findElements(By.xpath("//ul[contains(@class,'docs')]")).isEmpty()){
                List<WebElement> allSecondElementsWeb = driver.findElements(By.className("docs"));
                for (int j=0; j < allSecondElementsWeb.size(); j++){
                    allSecondElementsWeb = driver.findElements(By.xpath("//ul[@class='docs']/li"));
                    allSecondElementsWeb.get(j).click();
                    driver.findElement(By.xpath("//div[contains(@class,'panel-heading')]"));
                }};

            };
        driver.quit();
    }


}
