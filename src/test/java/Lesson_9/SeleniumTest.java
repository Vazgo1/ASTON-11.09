package Lesson_9;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SeleniumTest {

    @Test
    void testText (){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.mts.by");
        WebElement cooke = driver.findElement(By.xpath("//button[@class='btn btn_black cookie__ok']"));
        cooke.click();
        WebElement text = driver.findElement(By.xpath("//div[@class='pay__wrapper']//h2"));
      String retText =  text.getText();
      String actual = "Онлайн пополнение\n" +
              "без комиссии";
      if (retText.equals(actual)){
          System.out.println("Текст совпадает");
      }else {
          System.out.println("Текст не совпадает");
      }
      driver.quit();
    }

    @Test
    void getLogo(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.mts.by");
        WebElement cooke = driver.findElement(By.xpath("//button[@class='btn btn_black cookie__ok']"));
        cooke.click();
        WebElement logo1 = driver.findElement(By.xpath("//div[@class='pay__partners']//img[@alt='Visa']"));
        WebElement logo2 = driver.findElement(By.xpath("//div[@class='pay__partners']//img[@alt='Verified By Visa']"));
        WebElement logo3 = driver.findElement(By.xpath("//div[@class='pay__partners']//img[@alt='MasterCard']"));
        WebElement logo4 = driver.findElement(By.xpath("//div[@class='pay__partners']//img[@alt='MasterCard Secure Code']"));
        WebElement logo5 = driver.findElement(By.xpath("//div[@class='pay__partners']//img[@alt='Белкарт']"));
        Assert.assertTrue(logo1.isDisplayed());
        Assert.assertTrue(logo2.isDisplayed());
        Assert.assertTrue(logo3.isDisplayed());
        Assert.assertTrue(logo4.isDisplayed());
        Assert.assertTrue(logo5.isDisplayed());
        System.out.println("Логотипы  отображаются");
        driver.quit();
    }

    @Test
    void testHref (){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.mts.by");
        WebElement cooke = driver.findElement(By.xpath("//button[@class='btn btn_black cookie__ok']"));
        cooke.click();
        WebElement href = driver.findElement(By.xpath("//a[@href='/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/']"));
        href.click();
        driver.quit();
        System.out.println("ссылка работает");
    }

    @Test
    void inputTest (){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.mts.by");
        WebElement cooke = driver.findElement(By.xpath("//button[@class='btn btn_black cookie__ok']"));
        cooke.click();
        WebElement input = driver.findElement(By.xpath("//input[@id='connection-phone']"));
        input.sendKeys("297777777");
        WebElement input2 = driver.findElement(By.xpath("//input[@id='connection-sum']"));
        input2.sendKeys("100");
        WebElement button = driver.findElement(By.xpath("//button[@class='button button__default ']"));
        button.click();
        driver.quit();
        System.out.println("Форма работает");
    }
}
