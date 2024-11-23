package sample;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoITSample1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://smallpdf.com/pdf-to-word?srsltid=AfmBOor99UhZ_KEIjmOuIq__bUx_O5ocppkeN14kfqbWW9HC-Ktvookq");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//span[text()='Choose Files']")).click();
		
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\Admin\\OneDrive\\Desktop\\AutoIT_Script\\uploadpdffile1.exe");
	}

}
