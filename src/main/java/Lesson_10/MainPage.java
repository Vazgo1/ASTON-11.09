package Lesson_10;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;


public class MainPage {
    private WebDriver driver;

    private By cookieButton = By.xpath("//button[@class='btn btn_black cookie__ok']");
    private By payText = By.xpath("//div[@class='pay__wrapper']//h2");
    private By logo1 = By.xpath("//div[@class='pay__partners']//img[@alt='Visa']");
    private By logo2 = By.xpath("//div[@class='pay__partners']//img[@alt='Verified By Visa']");
    private By logo3 = By.xpath("//div[@class='pay__partners']//img[@alt='MasterCard']");
    private By logo4 = By.xpath("//div[@class='pay__partners']//img[@alt='MasterCard Secure Code']");
    private By logo5 = By.xpath("//div[@class='pay__partners']//img[@alt='Белкарт']");
    private By href = By.xpath("//a[@href='/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/']");
    private By inputPhone = By.xpath("//input[@id='connection-phone']");
    private By inputSum = By.xpath("//input[@id='connection-sum']");
    private By button = By.xpath("//button[@class='button button__default ']");
    private By inputText = By.xpath("//input[@placeholder=\"Номер телефона\"]");
    private By inputTextSum = By.xpath("//input[@placeholder=\"Сумма\"]");
    private By inputTextMail = By.xpath("//input[@placeholder=\"E-mail для отправки чека\"]");
    private By inputText2 = By.xpath("//input[@placeholder=\"Номер абонента\"]");
    private By inputText3 = By.xpath("//input[@placeholder=\"Номер счета на 44\"]");
    private By inputText4 = By.xpath("//input[@placeholder=\"Номер счета на 2073\"]");
    private By sum = By.xpath("//div[contains(@class,'pay-description__cost')]//span[contains(text(),'BYN')]");
    private By iframeNumber = By.xpath("//div[@class=\"pay-description__text\"]");
    private By iframeInput1 = By.xpath("//label[normalize-space(.)='Номер карты']");
    private By iframeInput2 = By.xpath("//label[normalize-space(.)='Срок действия']");
    private By iframeInput3 = By.xpath("//label[normalize-space(.)='Имя и фамилия на карте']");
    private By iframeInput4 = By.xpath("//label[normalize-space(.)='CVC']");
    private By iframeLogo = By.xpath("//div[contains(@class,'cards-brands')]/img[contains(@src,'visa-system.svg')]");

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get("https://www.mts.by");
    }

    public void acceptCookies() {
        WebElement cookie = driver.findElement(cookieButton);
        cookie.click();
    }

    public void getPayText(String actual) {
        WebElement text = driver.findElement(payText);
        String info = text.getText();
        if (info.equals(actual)) {
            System.out.println("Текст совпадает");
        } else {
            System.out.println("Текст не совпадает");
        }
    }


    public boolean getLogo1() {
        return driver.findElement(logo1).isDisplayed();
    }

    public boolean getLogo2() {
        return driver.findElement(logo2).isDisplayed();
    }

    public boolean getLogo3() {
        return driver.findElement(logo3).isDisplayed();
    }

    public boolean getLogo4() {
        return driver.findElement(logo4).isDisplayed();
    }

    public boolean getLogo5() {
        return driver.findElement(logo5).isDisplayed();
    }

    public void getHref() {
        WebElement linc = driver.findElement(href);
        linc.click();
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }


    public void enterPhone(String phone) {
        driver.findElement(inputPhone).sendKeys(phone);
    }

    public void enterSum(String sum) {
        driver.findElement(inputSum).sendKeys(sum);
    }

    public void clickButton() {
        driver.findElement(button).click();
    }

    public void inputGetText(String inp) {
        WebElement text = driver.findElement(inputText);
        String placeholderText = text.getAttribute("placeholder");
        if (placeholderText.equals(inp)) {
            System.out.println("Текст совпадает");
        } else {
            System.out.println("Текст не совпадает");
        }
    }

    public void inputGetText2(String inp) {
        WebElement text = driver.findElement(inputText2);
        String placeholderText = text.getAttribute("placeholder");
        if (placeholderText.equals(inp)) {
            System.out.println("Текст совпадает");
        } else {
            System.out.println("Текст не совпадает");
        }
    }

    public void inputGetText3(String inp) {
        WebElement text = driver.findElement(inputText3);
        String placeholderText = text.getAttribute("placeholder");
        if (placeholderText.equals(inp)) {
            System.out.println("Текст совпадает");
        } else {
            System.out.println("Текст не совпадает");
        }
    }

    public void inputGetText4(String inp) {
        WebElement text = driver.findElement(inputText4);
        String placeholderText = text.getAttribute("placeholder");
        if (placeholderText.equals(inp)) {
            System.out.println("Текст совпадает");
        } else {
            System.out.println("Текст не совпадает");
        }
    }

    public void inputGetSum(String inp) {
        WebElement text = driver.findElement(inputTextSum);
        String placeholderText = text.getAttribute("placeholder");
        if (placeholderText.equals(inp)) {
            System.out.println("Текст совпадает");
        } else {
            System.out.println("Текст не совпадает");
        }
    }

    public void inputGetMail(String inp) {
        WebElement text = driver.findElement(inputTextMail);
        String placeholderText = text.getAttribute("placeholder");
        if (placeholderText.equals(inp)) {
            System.out.println("Текст совпадает");
        } else {
            System.out.println("Текст не совпадает");
        }
    }


    public void getInfoSum(String massage) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement frame = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("iframe.bepaid-iframe")));
        driver.switchTo().frame(frame);
        WebElement text = wait.until(ExpectedConditions.visibilityOfElementLocated(sum));
        String gett = text.getText();
        if (gett.equals(massage)){
            System.out.println("Сумма в шапке iframe корректна");
        }else {
            System.out.println("Сумма в шапке iframe не корректна");
        }
        driver.switchTo().defaultContent();
    }
    public void getInfoNumber(String massage){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement frame = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("iframe.bepaid-iframe")));
        driver.switchTo().frame(frame);
        WebElement text = wait.until(ExpectedConditions.visibilityOfElementLocated(iframeNumber));
        String gett = text.getText();
        if (gett.equals(massage)){
            System.out.println("Номер телефона в iframe корректный");
        }else {
            System.out.println("Номер телефона в iframe не корректный");
        }
        driver.switchTo().defaultContent();
    }

    public void iframeInput(String inp){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement frame = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("iframe.bepaid-iframe")));
        driver.switchTo().frame(frame);
        WebElement text = driver.findElement(iframeInput1);
        String placeholderText = text.getText();
        if (placeholderText.equals(inp)) {
            System.out.println("ожидаемый текст  "+ inp + " фактический текст " + placeholderText +" Текст совпадает");
        } else {
            System.out.println("Текст не совпадает");
        }
        driver.switchTo().defaultContent();
    }

    public void iframeInput2(String inp){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement frame = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("iframe.bepaid-iframe")));
        driver.switchTo().frame(frame);
        WebElement text = driver.findElement(iframeInput2);
        String placeholderText = text.getText();
        if (placeholderText.equals(inp)) {
            System.out.println("ожидаемый текст  "+ inp + " фактический текст " + placeholderText +" Текст совпадает");
        } else {
            System.out.println("Текст не совпадает");
        }
        driver.switchTo().defaultContent();
    }

    public void iframeInput3(String inp){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement frame = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("iframe.bepaid-iframe")));
        driver.switchTo().frame(frame);
        WebElement text = driver.findElement(iframeInput3);
        String placeholderText = text.getText();
        if (placeholderText.equals(inp)) {
            System.out.println("ожидаемый текст  "+ inp + " фактический текст " + placeholderText +" Текст совпадает");
        } else {
            System.out.println("Текст не совпадает");
        }
        driver.switchTo().defaultContent();
    }

    public void iframeInput4(String inp){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement frame = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("iframe.bepaid-iframe")));
        driver.switchTo().frame(frame);
        WebElement text = driver.findElement(iframeInput4);
        String placeholderText = text.getText();
        if (placeholderText.equals(inp)) {
            System.out.println("ожидаемый текст  "+ inp + " фактический текст " + placeholderText +" Текст совпадает");
        } else {
            System.out.println("Текст не совпадает");
        }
        driver.switchTo().defaultContent();
    }

    public boolean getIframeLogo() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement frame = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("iframe.bepaid-iframe")));
        driver.switchTo().frame(frame);
        return driver.findElement(iframeLogo).isDisplayed();
    }
    }




