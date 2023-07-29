package ru.stqa.pft.addressbook;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.Map;

public class testGroupCreation {
  private WebDriver driver;
  JavascriptExecutor js;



  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    Map<String, Object> vars = new HashMap<String, Object>();
    driver.get("http://localhost/addressbook/addressbook/");
    driver.manage().window().setSize(new Dimension(1550, 838));
    driver.findElement(By.name("user")).click();
    driver.findElement(By.name("user")).sendKeys("admin");
    driver.findElement(By.id("LoginForm")).click();
    driver.findElement(By.name("pass")).click();
    driver.findElement(By.name("pass")).sendKeys("secret");
    driver.findElement(By.cssSelector("input:nth-child(7)")).click();
  }

  @Test
  public void testGroupCreation() {
    driver.findElement(By.linkText("groups")).click();
    driver.findElement(By.name("new")).click();
    driver.findElement(By.name("group_name")).click();
    driver.findElement(By.name("group_name")).sendKeys("test");
    driver.findElement(By.name("group_header")).click();
    driver.findElement(By.name("group_header")).sendKeys("test1");
    driver.findElement(By.name("group_footer")).click();
    driver.findElement(By.name("group_footer")).sendKeys("test2");
    driver.findElement(By.name("submit")).click();
    driver.findElement(By.linkText("group page")).click();
  }

  @After
  public void tearDown() {
    driver.quit();
  }
}
