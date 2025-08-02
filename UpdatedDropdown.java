import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
	    System.setProperty("webdriver.chrome.driver", "C:/Java/chromedriver-win64/chromedriver.exe");
	    driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	    //Click on dropdown
	    driver.findElement(By .id("divpaxinfo")).click();
	    Thread.sleep(2999);
	
	    int i=1;
	    while(i<5) {
	        driver.findElement(By .id("hrefIncAdt")).click();
	  
	    i++;
	    
	    }
	    driver.findElement(By .id("btnclosepaxoption")).click();
	    System.out.println(    driver.findElement(By .id("divpaxinfo")).getText());
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}

}
