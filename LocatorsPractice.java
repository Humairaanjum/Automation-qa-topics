import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsPractice {

	public static void main(String[] args) throws InterruptedException {

    System.setProperty("webdriver.chrome.driver", "C:/Java/chromedriver-win64/chromedriver.exe");
    WebDriver d=new ChromeDriver();

    d.manage().timeouts().implicitlyWait(Duration.ofSeconds(50000));

    d.get("https://x.com/i/flow/login");
    d.findElement(By .name("text")).sendKeys("Hello World");
    d.findElement(By .xpath("//button[@role=\"button\"][2]")).click();
    Thread.sleep(10000);
    d.findElement(By .xpath("//button[@class='css-1jxf684 r-bcqeeo r-qvutc0 r-poiln3 r-fdjqy7']")).click();    
	}

}
