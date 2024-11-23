package sample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleLaunch {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Launch the browser
		WebDriver driver = new ChromeDriver();
		
		// Load the url
		driver.get("https://www.spicejet.com/");
		
		// maximize the screen 
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		
		//click date
		driver.findElement(By.xpath("//div[text()='Email']")).click();
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("leema@gmail.com");
		
		
	}

}
