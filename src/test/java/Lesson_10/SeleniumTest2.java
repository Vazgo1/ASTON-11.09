package Lesson_10;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SeleniumTest2 {
    @Test
    void testText() {
        WebDriver driver = new ChromeDriver();
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.acceptCookies();
        mainPage.getPayText("Онлайн пополнение\n" +
                "без комиссии");
        driver.quit();
    }

    @Test
    void getLogo() {
        WebDriver driver = new ChromeDriver();
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.acceptCookies();
        Assert.assertTrue(mainPage.getLogo1()||mainPage.getLogo2()||mainPage.getLogo3()||mainPage.getLogo4()||mainPage.getLogo5());
        System.out.println("Логотипы  отображаются");
        driver.quit();
    }

    @Test
    void testHref (){
        WebDriver driver = new ChromeDriver();
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.acceptCookies();
        mainPage.getHref();
        System.out.println("Переход на страницу состоялся " + mainPage.getCurrentUrl());
        driver.quit();
    }

    @Test
    void inputTest () {
        WebDriver driver = new ChromeDriver();
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.acceptCookies();
        mainPage.enterPhone("297777777");
        mainPage.enterSum("100");
        mainPage.clickButton();
        System.out.println("Форма работает");
        driver.quit();
    }

    @Test
    void inputTextTest () {
        WebDriver driver = new ChromeDriver();
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.acceptCookies();
        mainPage.inputGetText("Номер телефона");
        mainPage.inputGetSum("Сумма");
        mainPage.inputGetMail("E-mail для отправки чека");
        driver.quit();
    }

    @Test
    void inputTextTest2 () {
        WebDriver driver = new ChromeDriver();
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.acceptCookies();
        WebElement button = driver.findElement(By.xpath("//button[@class='select__header']"));
        button.click();
        WebElement button2 = driver.findElement(By.xpath("//p[@class='select__option' and text()='Домашний интернет']"));
        button2.click();
        mainPage.inputGetText2("Номер абонента");
        mainPage.inputGetSum("Сумма");
        mainPage.inputGetMail("E-mail для отправки чека");
        driver.quit();
    }

    @Test
    void inputTextTest3 () {
        WebDriver driver = new ChromeDriver();
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.acceptCookies();
        WebElement button = driver.findElement(By.xpath("//button[@class='select__header']"));
        button.click();
        WebElement button2 = driver.findElement(By.xpath("//p[@class='select__option' and text()='Рассрочка']"));
        button2.click();
        mainPage.inputGetText3("Номер счета на 44");
        mainPage.inputGetSum("Сумма");
        mainPage.inputGetMail("E-mail для отправки чека");
        driver.quit();
    }

    @Test
    void inputTextTest4 () {
        WebDriver driver = new ChromeDriver();
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.acceptCookies();
        WebElement button = driver.findElement(By.xpath("//button[@class='select__header']"));
        button.click();
        WebElement button2 = driver.findElement(By.xpath("//p[@class='select__option' and text()='Задолженность']"));
        button2.click();
        mainPage.inputGetText4("Номер счета на 2073");
        mainPage.inputGetSum("Сумма");
        mainPage.inputGetMail("E-mail для отправки чека");
        driver.quit();
    }

    @Test
    void communicationServices () {
        WebDriver driver = new ChromeDriver();
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.acceptCookies();
        mainPage.enterPhone("297777777");
        mainPage.enterSum("100");
        mainPage.clickButton();
        mainPage.getInfoSum("100.00 BYN");
        mainPage.getInfoNumber("Оплата: Услуги связи Номер:375297777777");
        mainPage.iframeInput("Номер карты");
        mainPage.iframeInput2("Срок действия");
        mainPage.iframeInput3("Имя и фамилия на карте");
        mainPage.iframeInput4("CVC");
        mainPage.getIframeLogo();
        driver.quit();
    }
}