package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Administrator\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

        // Initialize the Chrome driver
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);

        // Specify the Instagram login credentials
            String username = "entertainment_reels_fresh";
        String password = "Cr5myhnk@11";

        // Log in to Instagram
        driver.get("https://www.instagram.com/");

        Thread.sleep(10000);

        driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[1]/div/label/input"))
                .sendKeys(username);
        driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[2]/div/label/input"))
                .sendKeys(password);
        driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]/button/div"))
                .click();

        Thread.sleep(40000);

        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div/div[1]/div[1]/div[1]/div/div/div/div/div[2]/div[7]/div/span/div/a/div"))
                .click();

        Thread.sleep(5000);

        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[3]/div/div/div[1]/div/div[3]/div/div/div/div/div[2]/div/div/div/div[2]/div[1]/div/div/div[2]/div/button"))
                .click();


        Thread.sleep(5000);
        Runtime.getRuntime().exec("C:\\Users\\Administrator\\Desktop\\Career Automation\\AutoIT_Scripts\\UploadFile.exe");
        Thread.sleep(5000);

        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[3]/div/div/div[1]/div/div[3]/div/div/div/div/div[2]/div/div/div/div[2]/div[1]/div/div/div/div[1]/div/div[2]/div/button/div"))
                .click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[3]/div/div/div[1]/div/div[3]/div/div/div/div/div[2]/div/div/div/div[2]/div[1]/div/div/div/div[1]/div/div[1]/div/button[1]/div"))
                .click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[3]/div/div/div[1]/div/div[3]/div/div/div/div/div[2]/div/div/div/div[1]/div/div/div[3]/div/div"))
                .click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[12]/div/div/div[3]/div/div/div[1]/div/div[3]/div/div/div/div/div[2]/div/div/div/div[1]/div/div/div[3]/div/div"))
                .click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[3]/div/div/div[1]/div/div[3]/div/div/div/div/div[2]/div/div/div/div[2]/div[2]/div/div/div/div[2]/div[1]/div[1]"))
                .click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[3]/div/div/div[1]/div/div[3]/div/div/div/div/div[2]/div/div/div/div[2]/div[2]/div/div/div/div[2]/div[1]/div[1]"))
                .sendKeys("ABC");

        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[3]/div/div/div[1]/div/div[3]/div/div/div/div/div[2]/div/div/div/div[1]/div/div/div[3]/div/div"))
                .click();

    }
}
