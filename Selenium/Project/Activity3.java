package liveProject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/orangehrm");
        driver.findElement(By.xpath("//input[@name=\"txtUsername\"]")).sendKeys("orange");
        driver.findElement(By.xpath("//input[@name=\"txtPassword\"]")).sendKeys("orangepassword123");
        driver.findElement(By.xpath("//input[@name=\"Submit\"]")).click();
        String home = "http://alchemy.hguy.co:8080/orangehrm/symfony/web/index.php/dashboard";
        String currentURL = driver.getCurrentUrl();
        if(home.equals(currentURL)){
            driver.close();
        }
    }
}
