package basicprograms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Practiceform {
	
	public WebDriver driver;
	
  @Test
  public void Registerform() throws Exception {
	  
	  
	  driver.findElement(By.id("firstName")).sendKeys("kalyan");
	  Thread.sleep(2000);
	  driver.findElement(By.id("lastName")).sendKeys("Pawan");
	  Thread.sleep(2000);
	  driver.findElement(By.id("userEmail")).sendKeys("Pawankalyan@gmail.com");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]/label")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[2]/label")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[3]/label")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.id("userNumber")).sendKeys("7654321890");
	  Thread.sleep(2000);
	  driver.findElement(By.id("dateOfBirthInput")).click();
	  Thread.sleep(2000);
	  new Select(driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select"))).selectByVisibleText("June");
	  Thread.sleep(2000);
	  new Select(driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select"))).selectByVisibleText("1994");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[4]/div[3]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.id("subjectsInput")).sendKeys("Maths");
	  Thread.sleep(2000);
	  driver.findElement(By.id("subjectsInput")).sendKeys(Keys.ENTER);
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]/label")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[2]/label")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[3]/label")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@id='uploadPicture']")).sendKeys("C:\\Users\\admin\\Pictures\\swamy.jpg");
	  Thread.sleep(2000);
	  driver.findElement(By.id("currentAddress")).sendKeys("Hyderabad");
	  Thread.sleep(2000);
  }
  
  @BeforeTest
  public void beforeTest() throws Exception {
	  
	  driver = new ChromeDriver();
	  driver.get("https://demoqa.com/automation-practice-form");
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  
  }

  @AfterTest
  public void afterTest() {
	  
  }

}
