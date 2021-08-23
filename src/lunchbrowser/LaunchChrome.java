package lunchbrowser;

//import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class LaunchChrome {
	

	
	public static void main(String[] args) throws InterruptedException {
		
		//Scanner scn = new Scanner(System.in);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mkase\\April2021_Selenium\\First_Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.close();
	}

}
