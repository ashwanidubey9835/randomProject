package Debugger;

 

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;
public class Debugger {

 

public static void main(String[] args) throws AWTException, InterruptedException, IOException {

 

System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\a\\chromedriver.exe");

ChromeOptions chromeOptions = new ChromeOptions();

chromeOptions.setExperimentalOption("debuggerAddress", "localhost:9014");

WebDriver driver = new ChromeDriver(chromeOptions);
/*Select select=new Select(driver.findElement(By.xpath("//select[@id='blog-cat-dropdown']")));
List<WebElement> listOption= select.getOptions();
ArrayList<String> sOption= new ArrayList<String>();
for(int i=0;i<listOption.size();i++)
{
	sOption.add(listOption.get(i).getText());
}

for(int j=1;j<sOption.size();j++)
{
	
	System.out.println("Option "+j+" is "+sOption.get(j));
}
Actions action= new Actions(driver);
WebElement seo=driver.findElement(By.xpath("//a[contains(text(),'SEO & Revenue Generation')]"));
action.moveToElement(seo).build().perform();*/

WebElement element = driver.findElement(By.linkText("SEO Services"));
JavascriptExecutor executor = (JavascriptExecutor)driver;
executor.executeScript("arguments[0].click();", element);

/*driver.findElement(By.xpath("//a[contains(text(),'SEO & Revenue Generation')]")).click();
driver.findElement(By.linkText("SEO Services")).click();
File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//Now you can do whatever you need to do with it, for example copy somewhere
String path = System. getProperty("user.dir");
Random ran=new Random();
int n = ran.nextInt(100);
Files.copy(scrFile, new File(""+path+"\\screenshot"+n+" "+".png"));*/












}
}