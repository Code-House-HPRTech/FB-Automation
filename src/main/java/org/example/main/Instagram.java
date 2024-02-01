package org.example.main;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;
import java.time.Duration;

public class Instagram {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");

        String[] img = {
                "E:\\system_logs\\Insta-Done\\FB_PROG\\FB_IMG_16088709527096515.jpg",
                "E:\\system_logs\\Insta-Done\\FB_PROG\\FB_IMG_16088709579966456.jpg",
                "E:\\system_logs\\Insta-Done\\FB_PROG\\FB_IMG_16088709765868707.jpg",
                "E:\\system_logs\\Insta-Done\\FB_PROG\\FB_IMG_16088829179594518.jpg",
                "E:\\system_logs\\Insta-Done\\FB_PROG\\FB_IMG_16088829250508709.jpg",
                "E:\\system_logs\\Insta-Done\\FB_PROG\\FB_IMG_16088829302423499.jpg",
                "E:\\system_logs\\Insta-Done\\FB_PROG\\FB_IMG_16088829517801667.jpg",
                "E:\\system_logs\\Insta-Done\\FB_PROG\\FB_IMG_16088829800684226.jpg",
                "E:\\system_logs\\Insta-Done\\FB_PROG\\FB_IMG_16088858769097636.jpg",
                "E:\\system_logs\\Insta-Done\\FB_PROG\\FB_IMG_16088858880742053.jpg",
                "E:\\system_logs\\Insta-Done\\FB_PROG\\FB_IMG_16088859919275896.jpg",
                "E:\\system_logs\\Insta-Done\\FB_PROG\\FB_IMG_16088861523520928.jpg",
                "E:\\system_logs\\Insta-Done\\FB_PROG\\FB_IMG_16088861755241710.jpg",
                "E:\\system_logs\\Insta-Done\\FB_PROG\\FB_IMG_16088861949373336.jpg",
                "E:\\system_logs\\Insta-Done\\FB_PROG\\FB_IMG_16088862247646539.jpg",
                "E:\\system_logs\\Insta-Done\\FB_PROG\\FB_IMG_16088862474128834.jpg",
                "E:\\system_logs\\Insta-Done\\FB_PROG\\FB_IMG_16088862803932613.jpg",
                "E:\\system_logs\\Insta-Done\\FB_PROG\\FB_IMG_16088863505027673.jpg",
                "E:\\system_logs\\Insta-Done\\FB_PROG\\FB_IMG_16088864148233344.jpg",
                "E:\\system_logs\\Insta-Done\\FB_PROG\\FB_IMG_16088864633166488.jpg",
                "E:\\system_logs\\Insta-Done\\FB_PROG\\FB_IMG_16088865098518733.jpg",
                "E:\\system_logs\\Insta-Done\\FB_PROG\\FB_IMG_16088865231105916.jpg",
                "E:\\system_logs\\Insta-Done\\FB_PROG\\FB_IMG_16088865502994350.jpg",
                "E:\\system_logs\\Insta-Done\\FB_PROG\\FB_IMG_16088865580923332.jpg",
                "E:\\system_logs\\Insta-Done\\FB_PROG\\FB_IMG_16088866256922044.jpg"
        };

        // Initialize the Chrome driver
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.setExperimentalOption("debuggerAddress", "localhost:62134");
        ChromeDriver driver = new ChromeDriver(options);
        driver.getCapabilities().asMap().forEach((k, v) -> {
            System.out.println("K " + v);
        });

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        int currentTab = 0;
        int count = 0;

        for (int i = 0; i < img.length; i++) {
            String s = img[i];
            if (currentTab == 2) currentTab = 0;
            System.out.println("> " + (count++) + " - " + s);

            try {
                driver.findElement(By.xpath("/html/body/div[2]/div/div/div[3]/div/div/div[1]/div/div[2]/div/div")).click();
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("");
            }
            Thread.sleep(1000);

            try {
                driver.switchTo().window(driver.getWindowHandles().toArray()[currentTab].toString());
                Thread.sleep(1000);

                driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div/div[1]/div[1]/div[1]/div/div/div/div/div[2]/div[7]/div/span/div/a/div")).click();
                Thread.sleep(3000);
                driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div[1]/div[1]/div[1]/div/div/div/div/div[2]/div[7]/div/span/div/div/div/div[1]/a[1]/div[1]")).click();
                Thread.sleep(3000);

                driver.findElement(By.xpath("/html/body/div[2]/div/div/div[3]/div/div/div[1]/div/div[3]/div/div/div/div/div[2]/div/div/div/div[2]/div[1]/div/div/div[2]/div/button")).click();
                Thread.sleep(3000);

                ProcessBuilder builder = new ProcessBuilder("C:\\Users\\Administrator\\Desktop\\Career Automation\\AutoIT_Scripts\\UploadFile.exe", s);
                builder.start();
                Thread.sleep(3000);

                driver.findElement(By.xpath("/html/body/div[2]/div/div/div[3]/div/div/div[1]/div/div[3]/div/div/div/div/div[2]/div/div/div/div[2]/div[1]/div/div/div/div[1]/div/div[2]/div/button/div")).click();
                Thread.sleep(1000);

                driver.findElement(By.xpath("/html/body/div[2]/div/div/div[3]/div/div/div[1]/div/div[3]/div/div/div/div/div[2]/div/div/div/div[2]/div[1]/div/div/div/div[1]/div/div[1]/div/div[1]/div/div[2]")).click();

                Thread.sleep(1000);

                driver.findElement(By.xpath("/html/body/div[2]/div/div/div[3]/div/div/div[1]/div/div[3]/div/div/div/div/div[2]/div/div/div/div[1]/div/div/div[3]/div/div")).click();

                Thread.sleep(1000);

                driver.findElement(By.xpath("/html/body/div[2]/div/div/div[3]/div/div/div[1]/div/div[3]/div/div/div/div/div[2]/div/div/div/div[1]/div/div/div[3]/div/div")).click();

                Thread.sleep(1000);

                driver.findElement(By.xpath("/html/body/div[2]/div/div/div[3]/div/div/div[1]/div/div[3]/div/div/div/div/div[2]/div/div/div/div[2]/div[2]/div/div/div/div[2]/div[1]/div[1]")).click();

                Thread.sleep(1500);

                driver.findElement(By.xpath("/html/body/div[2]/div/div/div[3]/div/div/div[1]/div/div[3]/div/div/div/div/div[2]/div/div/div/div[2]/div[2]/div/div/div/div[2]/div[1]/div[1]")).sendKeys("""
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
                        #beautychallenge1k
                        """);
                Thread.sleep(1500);
                driver.findElement(By.xpath("/html/body/div[2]/div/div/div[3]/div/div/div[1]/div/div[3]/div/div/div/div/div[2]/div/div/div/div[1]/div/div/div[3]/div/div")).click();

                Thread.sleep(6000);
                currentTab++;
            } catch (Exception e) {
                e.printStackTrace();
                System.err.println(">>>>> Error " + s);
                i--;
                driver.navigate().refresh();
                Thread.sleep(10000);
            }
        }
    }
}
