package first_Demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc_Swaglogin {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.ChromeDriver", "C:\\Users\\Administrator\\eclipse-workspace\\samplee\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/");
		WebElement txtusrname = driver.findElement(By.id("user-name"));
		txtusrname.sendKeys("standard_user");
		WebElement txtpswd = driver.findElement(By.id("password"));
		txtusrname.sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		WebElement sortproduct = driver.findElement(By.xpath("//select[@class='product_sort_container']//option[text()='Name (A to Z)']"));
		sortproduct.click();
		WebElement Addtocart1 = driver.findElement(By.xpath("(//button[@class='btn_primary btn_inventory'])[1]"));
		Addtocart1.click();
		WebElement Addtocart2 = driver.findElement(By.xpath("(//button[@class='btn_primary btn_inventory'])[2]"));
		Addtocart2.click();
		WebElement Addtocart3 = driver.findElement(By.xpath("(//button[@class='btn_primary btn_inventory'])[3"));
        Addtocart3.click();
		WebElement Addtocart4 = driver.findElement(By.xpath("(//button[@class='btn_primary btn_inventory'])[4"));
        Addtocart4.click();
		WebElement Addtocart5 = driver.findElement(By.xpath("(//button[@class='btn_primary btn_inventory'])[5"));
        Addtocart5.click();
        WebElement Addtocart6 = driver.findElement(By.xpath("(//button[@class='btn_primary btn_inventory'])[6"));
        Addtocart6.click();
        WebElement cart = driver.findElement(By.xpath("((//div[@id='shopping_cart_container'])"));
        cart.click();
        
        WebElement remove = driver.findElement(By.xpath("((//button[@class='btn_secondary cart_button'])[1])"));
        remove.click();
        WebElement remove1 = driver.findElement(By.xpath("((//button[@class='btn_secondary cart_button'])[3])"));
        remove1.click();
        WebElement remove2 = driver.findElement(By.xpath("((//button[@class='btn_secondary cart_button'])[4])"));
        remove2.click();
        WebElement remove3 = driver.findElement(By.xpath("((//button[@class='btn_secondary cart_button'])[4])"));
        remove2.click();
        WebElement checkout = driver.findElement(By.xpath("//a[@class='btn_action checkout_button']"));
        checkout.click();
        WebElement Firstname = driver.findElement(By.id("first-name"));
        Firstname.sendKeys("Captain");
        WebElement Lastname = driver.findElement(By.id("last-name"));
        Lastname.sendKeys("America");
        WebElement Postalcode = driver.findElement(By.id("postal-code"));
        Postalcode.sendKeys("963485");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        WebElement Finish = driver.findElement(By.xpath("//a[@class='btn_action cart_button']"));
        Finish.click();
        TakesScreenshot scrShot =((TakesScreenshot)driver);
        driver.close();
       {
    	     	   
    	}
       }
	 
		 
}
	 
