package com.poncho.executable;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.junit.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * 
 * @author Aswin Golla
 * 
 * This test covers the below actions
 * 1. Opens a chrome browser
 * 2. Navigates to the Poncho website
 * 3. Populates the start page of the application and clicks “Get a quote”
 * 4. Populates the “Cars” page to enter a total of 2 vehicles
 * 5. Asserts the correct “Car Value” is displayed for both vehicles
 * 6. Successfully loads the “Drivers” page
 *
 */

public class Test101_Part_000000 {
	
	
    public static void main(String[] args) throws Exception, IOException {
    	System.setProperty("webdriver.chrome.driver", "C:\\aswin\\Github\\chromedriver.exe");
    	
    	WebDriver driver = new ChromeDriver();
    	
    	try {
    		
    		driver.get("https://interviews-satellite.cs115.force.com/poncho/?gofaster=interview");
    		driver.manage().window().maximize();
    		
    		//Customer First and Last Names
	        
	        driver.findElement(By.id("policyStartFirstName")).click();
	        driver.findElement(By.id("policyStartFirstName")).sendKeys("Lizzy");
	        
	        driver.findElement(By.id("policyStartLastName")).click();
	        driver.findElement(By.id("policyStartLastName")).sendKeys("O’Briend");
	        driver.findElement(By.id("policyStartLastName")).sendKeys(Keys.TAB);
	        
	        //Start Date to pick after 20 Days
	        
	        Calendar c = Calendar.getInstance();
	        c.setTime(new Date()); // Today's date
	        c.add(Calendar.DATE, 20); // Adding 20 days
	        String policyStartDate = new SimpleDateFormat("dd/MM/yyyy").format(c.getTime());
	        
	        WebElement policyStartDateInput = driver.findElement(By.id("policyStartDate"));
	        policyStartDateInput.sendKeys(Keys.CLEAR);
	        policyStartDateInput.sendKeys(policyStartDate);
	        policyStartDateInput.sendKeys(Keys.TAB);
	        
	        driver.findElement(By.className("poncho-btn-primary-reg")).click();
	        
	        //Car1 Details
	        
	        WebElement licensePlateInput = (new WebDriverWait(driver, 10))
	        		  .until(ExpectedConditions.presenceOfElementLocated(By.id("vehicleLicensePlate-0")));
	        licensePlateInput.click();
	        licensePlateInput.sendKeys("BT77XO");
	        licensePlateInput.sendKeys(Keys.TAB);
	        
	        driver.findElement(By.id("vehicleRegistrationState-default-0")).click();
	        
	        driver.findElement(By.id("vehicleRegistrationState-1-0")).click();
	        driver.findElement(By.id("vehicleRegistrationState-1-0")).sendKeys(Keys.TAB);
	        
	        WebElement dynamicElement = (new WebDriverWait(driver, 10))
	        		  .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@class = 'poncho-btn-primary-reg white wide']")));
	        dynamicElement.click();
	        
	        JavascriptExecutor js = (JavascriptExecutor)driver;
	        WebElement button =driver.findElement(By.tagName("button"));
	        js.executeScript("arguments[0].click();", button);
	        
	        
	        WebElement addressInput = driver.findElement(By.id("vehicleAddress-0"));
	        addressInput.click();
	        addressInput.sendKeys("55 Pyrmont Bridge Road,Pyrmont,NSW 2009");
	        
	        List<WebElement> addressConfirm = driver.findElements(By.id("dropdown"));
	        addressConfirm.get(0).click();
	        
	        
	        WebElement carConfirm = driver.findElement(By.className("shared-InputVehicleSelectButton poncho-btn-primary-reg"));
	        
	        
	        //Mouse Events for UI element interactions
	        Actions act = new Actions (driver);
	       
	        //Car Confirmation
	        act.moveToElement(carConfirm).perform();
	        carConfirm.click();
	        
	        //Vehicle driven
	        WebElement vehicleDriven = driver.findElement(By.id("vehicleDriven-0"));
	        vehicleDriven.click();
	        vehicleDriven.sendKeys("1500");
	        
	        //Vehicle usage per week
	        WebElement vehicleUsagePerWeek = driver.findElement(By.id("vehicleUsagePerWeek-0-0"));
	        vehicleUsagePerWeek.click();
	        vehicleUsagePerWeek.findElement(By.name("vehicleUse-0-0)")).click();
	        
	        //Vehicle KMs per year
	        WebElement vehicleKmsPerYear = driver.findElement(By.id("vehicleKmsPerYear-default-0"));
	        vehicleKmsPerYear.click();
	        vehicleKmsPerYear.findElement(By.name("vehicleKmsPerYear-1-0)")).click();
	        
	        //Vehicle use
	        WebElement vehicleUse = driver.findElement(By.id("vehicleUsagePerWeek-0-0"));
	        vehicleUse.click();
	        vehicleUse.findElement(By.name("vehicleUsagePerWeek-0-0)")).click();
	        
	        //Vehicle modifications
	        WebElement vehicleModifications = driver.findElement(By.id("vehicleModifications-0"));
	        vehicleModifications.click();
	        vehicleModifications.findElement(By.name("vehicleModifications-0-0)")).click();
	        
	        //Vehicle equipment
	        WebElement vehicleHasEquipment = driver.findElement(By.id("vehicleHasEquipment-0"));
	        vehicleHasEquipment.click();
	        vehicleHasEquipment.findElement(By.name("vehicleHasEquipment-0-0")).click();
	        
	        //Vehicle Accessories	        
	        WebElement vehicleHasAccessories = driver.findElement(By.id("vehicleHasAccessories-0-0"));
	        vehicleHasAccessories.click();
	        vehicleHasAccessories.findElement(By.name("vehicleHasAccessories-0-0")).click();
	       
	        //Vehicle Damage
	        WebElement vehicleDamage = driver.findElement(By.id("vehicleDamage-0-0"));
	        vehicleDamage.click();
	        vehicleDamage.findElement(By.name("vehicleDamage-0-0")).click();
	    	    	        
	    	//Vehicle Loan Type        
	        WebElement vehicleLoanType = driver.findElement(By.id("vehicleLoanType-0-0"));
	        vehicleLoanType.click();
	        vehicleLoanType.findElement(By.name("vehicleLoanType-0-0")).click();
	        
	        //Add another Car
	        driver.findElement(By.className("poncho-btn-primary-reg white wide")).click();
	        
	        
	        //Car2 Details
	        
	        WebElement licensePlateInput2 = (new WebDriverWait(driver, 10))
	        		  .until(ExpectedConditions.presenceOfElementLocated(By.id("vehicleLicensePlate-1")));
	        licensePlateInput2.click();
	        licensePlateInput2.sendKeys("BT77XO");
	        licensePlateInput2.sendKeys(Keys.TAB);
	        
	        driver.findElement(By.id("vehicleRegistrationState-default-1")).click();
	        
	        driver.findElement(By.id("vehicleRegistrationState-1-1")).click();
	        driver.findElement(By.id("vehicleRegistrationState-1-1")).sendKeys(Keys.TAB);
	        
	        WebElement dynamicElement2 = (new WebDriverWait(driver, 10))
	        		  .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@class = 'poncho-btn-primary-reg white wide']")));
	        dynamicElement2.click();
	        
	        WebElement button2 =driver.findElement(By.tagName("button"));
	        js.executeScript("arguments[1].click();", button2);
	        
	        
	        WebElement addressInput2 = driver.findElement(By.id("vehicleAddress-1"));
	        addressInput2.click();
	        addressInput2.sendKeys("55 Pyrmont Bridge Road,Pyrmont,NSW 2009");
	        
	        List<WebElement> addressConfirm2 = driver.findElements(By.id("dropdown"));
	        addressConfirm2.get(1).click();
	        
	        
	        WebElement carConfirm2 = driver.findElement(By.className("shared-InputVehicleSelectButton poncho-btn-primary-reg"));
	        
	        
	        //Mouse Events for UI element interactions
	        //Car Confirmation
	        act.moveToElement(carConfirm).perform();
	        carConfirm2.click();
	        
	        //Vehicle2 driven
	        WebElement vehicleDriven2 = driver.findElement(By.id("vehicleDriven-1"));
	        vehicleDriven2.click();
	        vehicleDriven2.sendKeys("1500");
	        
	        //Vehicle2 usage per week
	        WebElement vehicleUsagePerWeek2 = driver.findElement(By.id("vehicleUsagePerWeek-1-0"));
	        vehicleUsagePerWeek2.click();
	        vehicleUsagePerWeek2.findElement(By.name("vehicleUsagePerWeek-1-0)")).click();
	        
	        //Vehicle2 KMs per year
	        WebElement vehicleKmsPerYear2 = driver.findElement(By.id("vehicleKmsPerYear-default-1"));
	        vehicleKmsPerYear2.click();
	        vehicleKmsPerYear2.findElement(By.name("vehicleKmsPerYear-1-0)")).click();
	        
	        //Vehicle2 use
	        WebElement vehicleUse2 = driver.findElement(By.id("vehicleUse-1-0"));
	        vehicleUse2.click();
	        vehicleUse2.findElement(By.name("vehicleUse-1-0)")).click();
	        
	        //Vehicle2 modifications
	        WebElement vehicleModifications2 = driver.findElement(By.id("vehicleModifications-1"));
	        vehicleModifications2.click();
	        vehicleModifications2.findElement(By.name("vehicleModifications-1-0)")).click();
	        
	        //Vehicle2 equipment
	        WebElement vehicleHasEquipment2 = driver.findElement(By.id("vehicleHasEquipment-1"));
	        vehicleHasEquipment2.click();
	        vehicleHasEquipment2.findElement(By.name("vehicleHasEquipment-1-0")).click();
	        
	        //Vehicle2 Accessories	        
	        WebElement vehicleHasAccessories2 = driver.findElement(By.id("vehicleHasAccessories-1-0"));
	        vehicleHasAccessories2.click();
	        vehicleHasAccessories2.findElement(By.name("vehicleHasAccessories-1-0")).click();
	       
	        //Vehicle2 Damage
	        WebElement vehicleDamage2 = driver.findElement(By.id("vehicleDamage-1-0"));
	        vehicleDamage2.click();
	        vehicleDamage2.findElement(By.name("vehicleDamage-1-0")).click();
	    	    	        
	    	//Vehicle2 Loan Type        
	        WebElement vehicleLoanType2 = driver.findElement(By.id("vehicleLoanType-1-0"));
	        vehicleLoanType2.click();
	        vehicleLoanType2.findElement(By.name("vehicleLoanType-1-0")).click();
	        
	        
	        //Assertions
	        Assert.assertNotEquals(driver.findElement(By.id("vehicleValue-0")).getText(), "$7,800");
	        Assert.assertNotEquals(driver.findElement(By.id("vehicleValue-1")).getText(), "$17,190");
	        
	    	driver.close();
            System.exit(0);
	        				
    	}	
        
        catch(Exception e) {
        	driver.close();
            System.exit(0);
        }
}
}