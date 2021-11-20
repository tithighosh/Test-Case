package aiub;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","H:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://portal.aiub.edu/");
        
          driver.findElement(By. name("UserName")).sendKeys("17-34572-2");
          driver.findElement(By.name("Password")).sendKeys("Humayra1*");
          driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/form/div[4]/button")).click();
        
        
        driver.findElement(By.xpath("//*[@id='main-content']/div/div/div[3]/div[2]/div/div[1]/div[2]/div/a")).click();
        driver.findElement(By.xpath("//*[@id='Notes']/a")).click();
        driver.findElement(By.xpath("//*[@id='Notices']/a")).click();
        driver.findElement(By.xpath("//*[@id='navigation-toggler']")).click();
        
        driver.findElement(By.xpath("//*[@id='main-content']/div/div/div[3]/div[2]/div/div[2]/div[2]/div[1]/a")).click();
        driver.findElement(By.xpath("//*[@id='Notes']/a")).click();
        driver.findElement(By.xpath("//*[@id='Notices']/a")).click();
        driver.findElement(By.xpath("//*[@id='navigation-toggler']")).click();

        driver.findElement(By.xpath("//*[@id='main-content']/div/div/div[3]/div[2]/div/div[2]/div[2]/div[2]/a")).click();
        driver.findElement(By.xpath("//*[@id='Notes']/a")).click();
        driver.findElement(By.xpath("//*[@id='Notices']/a")).click();
        driver.findElement(By.xpath("//*[@id='navigation-toggler']")).click();

        driver.findElement(By.xpath("//*[@id='main-content']/div/div/div[3]/div[2]/div/div[2]/div[2]/div[3]/a")).click();
        driver.findElement(By.xpath("//*[@id='Notes']/a")).click();
        driver.findElement(By.xpath("//*[@id='Notices']/a")).click();
        driver.findElement(By.xpath("//*[@id='navigation-toggler']")).click();
        

   driver.findElement(By.xpath("//*[@id='bs-example-navbar-collapse-00000000-0000-0000-0000-000000000000']/ul[2]/li/p/a/small")).click();
//        driver.findElement(By.xpath("//*[@id='Notices']/a")).click();
//        driver.findElement(By.xpath("//*[@id='Notices']/a")).click();
//        driver.findElement(By.xpath("//*[@id='Notices']/a")).click();

//        driver.findElement(By.xpath("//*[@id='collapse25da6797-419c-41cd-82d5-7c6ac0e9602b']/div/a[1]")).click();

        
        String exp_title= "Profile";
        String act_title = driver.getTitle();
        
        if (exp_title.equals(act_title) == true)
        {
      	  System.out.println("Passed");
        }
        else {
      	  System.out.println("Failed");
      	  

        }

	}

}
