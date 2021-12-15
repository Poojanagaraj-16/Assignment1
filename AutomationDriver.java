package qualitest1;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AutomationDriver {

		public static void main(String[] args) throws InterruptedException  {
			System.setProperty("webdriver.chrome.driver","E:\\selenium drives\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://www.qaclickacademy.com/practice.php");
			exerciseOne(driver);
			exerciseTwo(driver);
			exerciseThree(driver);
			exerciseFour(driver);
			exerciseFourPointTwo(driver);
			exerciseFive(driver);
			exerciseSix(driver);
			exerciseSeven(driver);
			exerciseEight(driver);
			exerciseNine(driver);
			
			
			
		}
		public static void exerciseOne(WebDriver driver)throws InterruptedException
		{
			driver.findElement(By.xpath("//input[@value='radio1']")).click();
			System.out.println(driver.findElement(By.xpath("//input[@value='radio1']")).isSelected());
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@value='radio2']")).click();
			System.out.println(driver.findElement(By.xpath("//input[@value='radio2']")).isSelected());
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@value='radio3']")).click();
			System.out.println(driver.findElement(By.xpath("//input[@value='radio2']")).isSelected());
			
		}
		public static void exerciseTwo(WebDriver driver) throws InterruptedException
		{
			driver.findElement(By.id("autocomplete")).click();
			driver.findElement(By.id("autocomplete")).sendKeys("united States");
			Thread.sleep(1000);
			List <WebElement> s=driver.findElements(By.xpath("//ul/li[@class='ui-menu-item']"));
			for(WebElement country:s)
			{
				if(country.getText().equalsIgnoreCase("United States Minor Outlying Island"))
				{
					country.click();
					break;
				}
			}
			System.out.println(driver.findElement(By.id("autocomplete")).getText());
		}
			
			// Dropdownlist
		public static void exerciseThree(WebDriver driver) throws InterruptedException
		{
			WebElement dropdown=driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
			Select s1=new Select(dropdown);
			s1.selectByIndex(1);
			Thread.sleep(1000);
			s1.selectByIndex(2);
			Thread.sleep(1000);
			s1.selectByIndex(3);
			Thread.sleep(1000);
		}
			
			//Checkbox
		public static void exerciseFour(WebDriver driver) throws InterruptedException
		{
			driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
			driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();
			driver.findElement(By.xpath("//input[@id='checkBoxOption3']")).click();
			Thread.sleep(1000);
			
		}
		public static void exerciseFourPointTwo(WebDriver driver) throws InterruptedException
		{
			WebElement cb1=driver.findElement(By.id("checkBoxOption1"));
			System.out.println(cb1.isSelected());
			cb1.click();
			WebElement cb2=driver.findElement(By.id("checkBoxOption2"));
			System.out.println(cb1.isSelected());
			cb2.click();
			WebElement cb3=driver.findElement(By.id("checkBoxOption3"));
			System.out.println(cb1.isSelected());
			cb3.click();
			
		}
		
		
		public static void exerciseFive(WebDriver driver) throws InterruptedException
		{
			driver.findElement(By.id("openwindow")).click();
			System.out.println(driver.findElement(By.id("openwindow")).isDisplayed());
			String winHandleBefore=driver.getWindowHandle();
				for(String winHandle : driver.getWindowHandles()){
					driver.switchTo().window(winHandle);
				}
				Thread.sleep(1000);
				driver.close();
				driver.switchTo().window(winHandleBefore);
				System.out.println(driver.findElement(By.id("openwindow")).getText());
		}
		public static void exerciseSix(WebDriver driver) throws InterruptedException
		{
			System.out.println(driver.findElement(By.id("opentab")).isSelected());
			driver.findElement(By.id("opentab")).click();
			System.out.println(driver.findElement(By.id("opentab")).isDisplayed());
			String winHandleBefore = driver.getWindowHandle();
			for(String winHandle : driver.getWindowHandles()){
			    driver.switchTo().window(winHandle);
			}	
			Thread.sleep(3000);
			driver.close();	
			driver.switchTo().window(winHandleBefore);
		System.out.println(driver.findElement(By.id("opentab")).getText());
	}
		public static void exerciseSeven(WebDriver driver) throws InterruptedException
		{
			driver.findElement(By.id("name")).sendKeys("John");
			driver.findElement(By.id("alertbtn")).click();
			Alert alert=driver.switchTo().alert();
			Thread.sleep(1000);
			alert.accept();
		}
		public static void exerciseEight(WebDriver driver) throws InterruptedException
		{
			
			//scroll
			JavascriptExecutor jre=(JavascriptExecutor) driver;
			jre.executeScript("window.scrollBy(0,600);");
			WebElement table = driver.findElement(By.id("product"));
			List<WebElement> fr = table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th"));
			System.out.println(fr.get(0).getText());
			System.out.println(fr.get(1).getText());
			System.out.println(fr.get(2).getText());
			List<WebElement> sr = table.findElements(By.tagName("tr")).get(1).findElements(By.tagName("td"));
			System.out.println(sr.get(0).getText());
			System.out.println(sr.get(1).getText());
			System.out.println(sr.get(2).getText());
			List<WebElement> tr = table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
			System.out.println(tr.get(0).getText());
			System.out.println(tr.get(1).getText());
			System.out.println(tr.get(2).getText());
			List<WebElement> four = table.findElements(By.tagName("tr")).get(3).findElements(By.tagName("td"));
			System.out.println(four.get(0).getText());
			System.out.println(four.get(1).getText());
			System.out.println(four.get(2).getText());
			List<WebElement> fir = table.findElements(By.tagName("tr")).get(4).findElements(By.tagName("td"));
			System.out.println(fir.get(0).getText());
			System.out.println(fir.get(1).getText());
			System.out.println(fir.get(2).getText());
			List<WebElement> sir = table.findElements(By.tagName("tr")).get(5).findElements(By.tagName("td"));
			System.out.println(sir.get(0).getText());
			System.out.println(sir.get(1).getText());
			System.out.println(sir.get(2).getText());
			List<WebElement> ser = table.findElements(By.tagName("tr")).get(6).findElements(By.tagName("td"));
			System.out.println(ser.get(0).getText());
			System.out.println(ser.get(1).getText());
			System.out.println(ser.get(2).getText());
			List<WebElement> eir = table.findElements(By.tagName("tr")).get(9).findElements(By.tagName("td"));
			System.out.println(eir.get(0).getText());
			System.out.println(eir.get(1).getText());
			System.out.println(eir.get(2).getText());
			List<WebElement> nir = table.findElements(By.tagName("tr")).get(10).findElements(By.tagName("td"));
			System.out.println(nir.get(0).getText());
			System.out.println(nir.get(1).getText());
			System.out.println(nir.get(2).getText());
			}
		
		public static void exerciseNine(WebDriver driver) throws InterruptedException
		{
			
			//mouse over
			Actions act1=new Actions(driver);
			WebElement ele=driver.findElement(By.id("mousehover"));
			act1.moveToElement(ele).build().perform();
			act1.click().build().perform();
			WebElement ele1=driver.findElement(By.linkText("Top"));
			act1.moveToElement(ele1);
			act1.click().build().perform();		
		}
	}



	


