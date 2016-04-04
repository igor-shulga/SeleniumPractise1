import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Testing {
    public static void main (String[] args) throws InterruptedException {
        System.out.println("Test 'Looking for Java Digest' started ");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://dou.ua/");
        driver.findElement(new By.ById("txtGlobalSearch")).sendKeys("Java Digest \n");
        Thread.sleep(2000);
        driver.findElement(new By.ByLinkText("Java дайджест #0 | DOU")).click();
        Thread.sleep(5000);
        driver.quit();
    }
}
