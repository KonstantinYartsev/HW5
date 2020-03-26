import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import ru.lanit.framework.webdriver.WebDriverManager;

public class TestDevN7lanit {
    @Test
    public void TestDevN7lanit() throws InterruptedException {
        WebDriver webDriver = WebDriverManager.getDriver();
        webDriver.get("https://dev.n7lanit.ru/");
        Thread.sleep(1000);
        WebElement webElement = webDriver.findElement(By.xpath("//a[contains(text(),'Категории')]"));
        webElement.click();
        Thread.sleep(1000);
        Thread.sleep(1000);
        Assert.assertTrue(webDriver.findElement(By.xpath("//h1[text()='Категории']")).isDisplayed(), "Элемент \"Категории\" отсутствует");
        Thread.sleep(1000);
        webElement = webDriver.findElement(By.xpath("//a[contains(text(),'Пользователи')]"));
        webElement.click();
        Thread.sleep(1000);
        Assert.assertTrue(webDriver.findElement(By.xpath("//h1[text()='Пользователи']")).isDisplayed(), "Элемент \"Пользователи\" отсутствует");
        webElement = webDriver.findElement(By.xpath("//i[text()='search']"));
        webElement.click();
        Thread.sleep(1000);
        webElement = webDriver.findElement(By.xpath("//input[@placeholder=\"Поиск\"]"));
        webElement.click();
        Thread.sleep(1000);
        webElement.sendKeys("Konstantin");
        Thread.sleep(1000);
        Assert.assertTrue(webDriver.findElement(By.xpath("//h5[text()='Konstantin']")).isDisplayed(), "Элемент \"Konstantin\" отсутствует");
        webDriver.quit();

    }
}
