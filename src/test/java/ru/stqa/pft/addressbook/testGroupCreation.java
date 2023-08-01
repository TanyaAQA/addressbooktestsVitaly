package ru.stqa.pft.addressbook;

import org.junit.Test;
import org.openqa.selenium.By;

public class testGroupCreation extends TestBase {


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

}
