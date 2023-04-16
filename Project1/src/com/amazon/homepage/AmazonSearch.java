package com.amazon.homepage;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonSearch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		



// by using sleep

System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

ChromeOptions options = new ChromeOptions();   // these steps we added with chrome version...111 because it has some problem
options.addArguments("--remote-allow-origins=*");  // this step also we add 
                                              // otherwise normally we donot use these two steps.

WebDriver driver= new ChromeDriver(options);
//driver=new FirefoxDriver();
driver.get("https://www.amazon.in/");
driver.manage().window().maximize();
driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Samsung Mobile");
Thread.sleep(2000);    // Avoid Thread.sleep in scripting it may take more time than it has mentioned.         
driver.findElement(By.id("twotabsearchtextbox")).click();
//driver.close();
//driver.quit();





// by using implicit 
 /*
System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
WebDriver driver= new ChromeDriver();
//driver=new FirefoxDriver();
driver.get("https://www.amazon.in/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  // every .5sec check
driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Samsung Mobile");        
driver.findElement(By.id("twotabsearchtextbox")).click();
*/


/*
// by using explicit

System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
WebDriverWait wait;   // only declare
WebDriver driver= new ChromeDriver();
wait= new WebDriverWait(driver,Duration.ofSeconds(10));    // every .5sec check
//driver=new FirefoxDriver();
driver.get("https://www.amazon.in/");
driver.manage().window().maximize();
driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Samsung Mobile");
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("twotabsearchtextbox")));
driver.findElement(By.id("twotabsearchtextbox")).click();
driver.close();
driver.quit();
*/


/*
String url = driver.getCurrentUrl();
System.out.println("Current Url"+ url);
*/

/*
String title = driver.getTitle();
System.out.println("Title"+ title);
*/
/*
String Source = driver.getPageSource();	
System.out.println("source"+ Source);
*/
		
/*
driver.navigate().refresh();
Thread.sleep(1000);		
driver.navigate().back();		
Thread.sleep(1000);		
driver.navigate().forward();	
*/

//driver.navigate().to("https://www.amazon.com");	


/*
driver.findElements(By.xpath("//a"));
List<WebElement>    links = driver.findElements(By.xpath("//a"));
for (WebElement webElement : links)
 {			
System.out.println(webElement.getAttribute("href"));		
}
*/

/*
driver.findElement(By.id("twotabsearchtextbox")).sendKeys("");
String password = "Hello@123";	
for(int i=0; i< password.length() ; i++)
{					
	driver.findElement(By.id("pwd")).sendKeys(password.substring(i));	
}
driver.switchTo().alert().accept();
driver.switchTo().alert().dismiss();
String alertContent =   driver.switchTo().alert().getText();
driver.switchTo().alert().sendKeys("xyz@gmail.com");
driver.switchTo().alert().sendKeys("Hello@123");
*/

/*		
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");			
ChromeOptions options = new ChromeOptions();		
options.addArguments("-incognito");				
WebDriverWait wait ; // Declare				
WebDriver  driver = new ChromeDriver(options);

wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Define		
driver.get("https://demo.guru99.com/test/newtours/register.php");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 		
WebElement element =  driver.findElement(By.name("country"));
Select select = new Select(element);		
select.selectByVisibleText("INDIA");		 
Thread.sleep(3000);		
select.selectByIndex(5);		
Thread.sleep(3000);		
select.selectByValue("AUSTRALIA");
*/


/*
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");	
ChromeOptions options = new ChromeOptions();	
options.addArguments("-incognito");
WebDriverWait wait ; // Declare			
WebDriver  driver = new ChromeDriver(options);			
wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Define			
driver.get("https://demo.guru99.com/test/upload/");			
driver.manage().window().maximize();			
driver.findElement(By.id("uploadfile_0")).sendKeys("C:\\Users\\Compaq\\eclipse-workspace\\MyMavenProject1\\data");
*/

		
	}

}  