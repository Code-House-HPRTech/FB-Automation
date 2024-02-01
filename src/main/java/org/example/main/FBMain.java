package org.example.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;

public class FBMain {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");

        String[] img = {
                "E:\\system_logs\\uploads\\FB_IMG_16093495172163529.jpg",
                "E:\\system_logs\\uploads\\FB_IMG_16093495622229993.jpg",
                "E:\\system_logs\\uploads\\FB_IMG_16093496445048135.jpg",
                "E:\\system_logs\\uploads\\FB_IMG_16093496773195654.jpg",
                "E:\\system_logs\\uploads\\FB_IMG_16093498840980153.jpg",
                "E:\\system_logs\\uploads\\FB_IMG_16093498927813062.jpg",
                "E:\\system_logs\\uploads\\FB_IMG_16093499113195023.jpg",
                "E:\\system_logs\\uploads\\FB_IMG_16093499689257973.jpg",
                "E:\\system_logs\\uploads\\FB_IMG_16093809236858609.jpg",
                "E:\\system_logs\\uploads\\FB_IMG_16093810265748743.jpg",
                "E:\\system_logs\\uploads\\FB_IMG_16093810377467377.jpg",
                "E:\\system_logs\\uploads\\FB_IMG_16093810647425278.jpg",
                "E:\\system_logs\\uploads\\FB_IMG_16093810780562636.jpg",
                "E:\\system_logs\\uploads\\FB_IMG_16093811270862415.jpg",
                "E:\\system_logs\\uploads\\FB_IMG_16093814474827490.jpg",
                "E:\\system_logs\\uploads\\FB_IMG_16093815610319912.jpg",
                "E:\\system_logs\\uploads\\FB_IMG_16093815741679680.jpg",
                "E:\\system_logs\\uploads\\FB_IMG_16093816320974018.jpg",
                "E:\\system_logs\\uploads\\FB_IMG_16093816480993688.jpg",
                "E:\\system_logs\\uploads\\FB_IMG_16094050742361314.jpg",
                "E:\\system_logs\\uploads\\FB_IMG_16094051493178967.jpg",
                "E:\\system_logs\\uploads\\FB_IMG_16094052198676086.jpg",
                "E:\\system_logs\\uploads\\FB_IMG_16094054963374059.jpg",
                "E:\\system_logs\\uploads\\FB_IMG_16094066667349008.jpg",
                "E:\\system_logs\\uploads\\FB_IMG_16094066927817355.jpg"
        };

        // Initialize the Chrome driver
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.setExperimentalOption("debuggerAddress", "localhost:55687");
        ChromeDriver driver = new ChromeDriver(options);

        driver.getCapabilities().asMap().forEach((k, v) -> {
            System.out.println("K " + v);
        });


//        // Specify the Instagram login credentials
//        String username = Constant.un;
//        String password = Constant.pw;
//
//        // Log in to Instagram
//        driver.get("https://www.facebook.com/");
//        Thread.sleep(10000);
//
//        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(username);
//        driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(password);
//        driver.findElement(By.xpath("//*[@name=\"login\"]")).click();
//        Thread.sleep(15000);

//        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[3]/div/div/div/div[1]/div[1]/div/div[1]/div/div/div[1]/div/div/div[1]/div[1]/ul/li[2]/div/a/div[1]")).click();
//        Thread.sleep(20000);
//        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[3]/div/div/div/div[1]/div[1]/div[1]/div/div[2]/div[1]/div[2]/div[2]/div/a/div[1]/div[2]/div/div/div")).click();
//        Thread.sleep(20000);
//        driver.findElement(By.xpath("//*[starts-with(@id, 'mount_0_0_')]/div/div[1]/div/div[3]/div/div/div/div[1]/div[1]/div[2]/div/div/div/div/div[4]/div[1]/div/div/div/div/div/div/div/div[2]/div/div/div")).click();
//        Thread.sleep(10000);

        int currentTab = 0;

        for (int i = 0; i < img.length; i++) {
            String s = img[i];
            if (currentTab == 2) currentTab = 0;
            System.out.println(s);

            try {
                driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[4]/div/div[2]/div[1]/div/div[2]/div/div/div/div[3]/div[2]/div/div[1]/div[2]/div")).click();
            } catch (Exception ignored) {
            }

            try {

                Thread.sleep(1000);
                driver.switchTo().window(driver.getWindowHandles().toArray()[currentTab].toString());
                Thread.sleep(1000);
                // photo select btn
                driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[3]/div/div/div[1]/div[1]/div[2]/div/div/div/div/div[4]/div[2]/div/div[2]/div[1]/div/div/div/div/div[2]/div[2]")).click();
                Thread.sleep(2000);

                // description
                driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[4]/div/div/div[1]/div/div[2]/div/div/div/form/div/div[1]/div/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div[1]")).click();
                Thread.sleep(1000);
                driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[4]/div/div/div[1]/div/div[2]/div/div/div/form/div/div[1]/div/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div[1]")).sendKeys("""
                        Full Hot Video: bit.ly/hot-cute-bhabhi
                        .
                        .
                        #sareelove #cutegirls #sareelove #bhabhilover #reelsvideo #bhabhiloves
                        #BollywoodQueen1 #Bollywood Queen #BollywoodActress #bollywood actress #bollywoodqueen
                        #beautiful
                        #BestPhotographyChallenge
                        #queenchallenge
                        #bestfriends
                        #beautiful
                        #Beauty
                        #black. Ke
                        #beautychallenge1k""");

                driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[4]/div/div/div[1]/div/div[2]/div/div/div/form/div/div[1]/div/div/div/div[2]/div[1]/div[2]/div/div[1]/div/div/div/div[1]/div/div/div")).click();
                Thread.sleep(4000);

                ProcessBuilder builder = new ProcessBuilder("C:\\Users\\Administrator\\Desktop\\Career Automation\\AutoIT_Scripts\\UploadFile.exe", s);
                builder.start();
                Thread.sleep(6000);


                driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[4]/div/div/div[1]/div/div[2]/div/div/div/form/div/div[1]/div/div/div/div[3]/div[4]/div/div")).click();
                Thread.sleep(5000);

                try {
                    driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[4]/div/div[2]/div[1]/div/div[2]/div/div/div/div[3]/div[2]/div/div[1]/div[2]/div")).click();
                } catch (Exception e) {
                    System.err.println(">>>" + e.getMessage());
                }

                currentTab++;
            } catch (Exception e) {
                System.err.println(">>>>> Error " + s + " >> " + e.getMessage());
                i--;
                driver.navigate().refresh();
                Thread.sleep(10000);
            }
        }
    }
}
