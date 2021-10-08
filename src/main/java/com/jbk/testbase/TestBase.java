package com.jbk.testbase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;



import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;
import com.jbk.pages.DashboardPage;
import com.jbk.pages.DownloadPage;
import com.jbk.pages.LoginPage;
import com.jbk.pages.OperatorsPage;
import com.jbk.pages.UserPage;
import com.jbk.utility.LogsForPage;

public class TestBase extends LogsForPage {
	
	public static WebDriver driver;
	FileInputStream fis = null;
	Properties prop = null;
	LoginPage lp ;
	DashboardPage dp ;
	UserPage up;
	OperatorsPage op;
	
	DownloadPage dlp;

	
	
	public String readProperty(String key,String propfileName) {
		prop = new Properties();
		try {

			fis = new FileInputStream(
					System.getProperty("user.dir") + "/src/main/resources/properties/"+ propfileName);
			prop.load(fis);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
		return prop.getProperty(key);
	}

	public WebDriver initialization() {
		//D:\\Personal\\java\\chrome driver\\20210926\\chromedriver94.exe
		System.setProperty("webdriver.chrome.driver", "D:/Personal/java/chrome driver/20210926/94/chromedriver94.exe");
		driver = new ChromeDriver();
		
		driver.get(readProperty("url","config.properties"));
		driver.manage().window().maximize();
	
		return driver;
	}
	
	
	public LoginPage getLoginPageDriver(){
		 lp = new LoginPage(driver);
		return lp;
	}
	public DashboardPage getDashboarPageDriver(){
		 dp = new DashboardPage(driver);
		return dp;
	}
	
	public UserPage getUserPageDriver(){
		 up = new UserPage(driver);
		return up;
	}
	
	public OperatorsPage getOperatorPageDriver(){
		 op = new OperatorsPage(driver);
		return op;
	}
	
	
	public DownloadPage getDownloadPageDriver(){
		 dlp = new DownloadPage(driver);
		return dlp;
	}
	
	
	
    public static void screenShot(WebDriver driver ,String name){
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(System.getProperty("user.dir")+"/screenshot/"+ name + ".jpg");
		try {
			Files.copy(src, dest);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	
}
