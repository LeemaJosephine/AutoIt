package sample;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoITSample {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ilovepdf.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//a[@title='PDF to Word']")).click();
		
		driver.findElement(By.id("pickfiles")).click();
		
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\Admin\\OneDrive\\Desktop\\AutoIT_Script\\uploadDoc.exe");
		driver.findElement(By.id("processTaskTextBtn")).click();
	}

}
