package org.example.main;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;

public class RelMain {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");

        String[] img = {
                "E:\\system_logs\\short videos\\Fav\\106147727_698390634051606_6761756498750315206_n.mp4",
                "E:\\system_logs\\short videos\\Fav\\106282355_932545180550952_8558300346627094592_n.mp4",
                "E:\\system_logs\\short videos\\Fav\\106490546_294038441977741_4401465628270397209_n.mp4",
                "E:\\system_logs\\short videos\\Fav\\106546416_310519306653718_4938267549089838174_n.mp4",
                "E:\\system_logs\\short videos\\Fav\\106550372_373028710344330_6708322022148949938_n.mp4",
                "E:\\system_logs\\short videos\\Fav\\112035db7105d916881b2ed8f568176b_622024.mp4",
                "E:\\system_logs\\short videos\\Fav\\124d810705a130a6adcb837bc6e0f918_1570076.mp4",
                "E:\\system_logs\\short videos\\Fav\\12e6f03255e4b4c9ccb8da8d9d4434ba_2851582.mp4",
                "E:\\system_logs\\short videos\\Fav\\145b02ee2f34353cb00abcdcc3579bfa_1814242.mp4",
                "E:\\system_logs\\short videos\\Fav\\1485b2a592bcf0abae7bd3824a7e3ac6_2798034.mp4",
                "E:\\system_logs\\short videos\\Fav\\15468151d9406067c6317206eb25fb6b_3039730.mp4",
                "E:\\system_logs\\short videos\\Fav\\1572a131063a7c60303682642560b723_3140828.mp4",
                "E:\\system_logs\\short videos\\Fav\\18302369c8bc9a6c2ac53d3a0757929a_2702346.mp4",
                "E:\\system_logs\\short videos\\Fav\\188cd2b1f2298a920ca5e59f9470776c_1140394.mp4",
                "E:\\system_logs\\short videos\\Fav\\1ca19125ce9794a8aab93922fbe70938_1867272.mp4",
                "E:\\system_logs\\short videos\\Fav\\1cf3d450e749c90a36a3c728a0797eb0_2895756.mp4",
                "E:\\system_logs\\short videos\\Fav\\1ea4bf6b3dabc7d9ae6a122db4a7ea54_2761502.mp4",
                "E:\\system_logs\\short videos\\Fav\\1ef413ce2b175871503e600f7847ed59_1533932.mp4",
                "E:\\system_logs\\short videos\\Fav\\1efc1181cbb2cd8b7e1851e73d38cf06_1516223.mp4",
                "E:\\system_logs\\short videos\\Fav\\21533adfea02a9a86b6e560b3c437abd_952136.mp4",
                "E:\\system_logs\\short videos\\Fav\\22113f55fc7924dba89406c7bef06f82_2013879.mp4",
                "E:\\system_logs\\short videos\\Fav\\2241a4f67fe1451f03f3d4d1b17d9026_1537627.mp4",
                "E:\\system_logs\\short videos\\Fav\\24f66e50ceccfc964c211892350e2b65_2837263.mp4",
                "E:\\system_logs\\short videos\\Fav\\26542d39316e916379b83f4f17f2ce87_3200981.mp4",
                "E:\\system_logs\\short videos\\Fav\\26ede0394c4a77f4312d1c73a7703e19_1140860.mp4",
                "E:\\system_logs\\short videos\\Fav\\26f9895ac6cc0e6bdf319c00e2c5c22d_986499.mp4",
                "E:\\system_logs\\short videos\\Fav\\28ff968bdf028af9868c54da606b84f3_4314156.mp4",
                "E:\\system_logs\\short videos\\Fav\\2bf133967d2c6975cea9f6dabc7fb1a9_1439690.mp4",
                "E:\\system_logs\\short videos\\Fav\\2d49af101757ba66f1b654cb57f14316_3335904.mp4",
                "E:\\system_logs\\short videos\\Fav\\2e5fea3e8e24e4e7c344dbcdb66e2eb6_1897115.mp4",
                "E:\\system_logs\\short videos\\Fav\\2e8259c4ccac3e16f36d1925c28ed78b_2341158.mp4",
                "E:\\system_logs\\short videos\\Fav\\2eac6128c3dcc78800c331e1de919ff3_3716262.mp4",
                "E:\\system_logs\\short videos\\Fav\\311f6bef0c54e673bbdff762e2453cc3_2751383.mp4",
                "E:\\system_logs\\short videos\\Fav\\3186c526feef2601e34efdc8ef7b3689_1575853.mp4",
                "E:\\system_logs\\short videos\\Fav\\33cef5ba5d13c0ce74801ee7dbcd4183_2234632.mp4",
                "E:\\system_logs\\short videos\\Fav\\3491f920737be2ce77efee335c70d707_1609989.mp4",
                "E:\\system_logs\\short videos\\Fav\\34d30235fda00e2ce2eec9ea3a7a7dfa_2226084.mp4",
                "E:\\system_logs\\short videos\\Fav\\34fe7de1ef7b15dfedf81a39746b954a_2647550.mp4",
                "E:\\system_logs\\short videos\\Fav\\3546482d53b276a1ae581e4cd9539ed1_3639601.mp4",
                "E:\\system_logs\\short videos\\Fav\\365fcaf78fa7da3d38d515a545a39c38_3325950.mp4",
                "E:\\system_logs\\short videos\\Fav\\38a09de79364c01e1e0d58f263d940ef_1632176.mp4",
                "E:\\system_logs\\short videos\\Fav\\38ee5d6e6219c2ad87dd6475d3ff0669_3543871.mp4",
                "E:\\system_logs\\short videos\\Fav\\3b8f93fc99b77965403b0abe1e819f9d_2020191.mp4",
                "E:\\system_logs\\short videos\\Fav\\3cfbfca26a8eb48e06258b41d245cac7_1867394.mp4",
                "E:\\system_logs\\short videos\\Fav\\3d56cb93b8a1cebe3dff1a0b147cc6e6_910211.mp4",
                "E:\\system_logs\\short videos\\Fav\\3ed5efca454d56464133e57f789cbc56_2952740.mp4",
                "E:\\system_logs\\short videos\\Fav\\4045b4eb7b9766403f02a6652fabf169_1989645.mp4",
                "E:\\system_logs\\short videos\\Fav\\423cc62c748676d7b285b6036e3a2f85_2138573.mp4",
                "E:\\system_logs\\short videos\\Fav\\426a86eb9a9763e695a2a64f9ed56543_1219837.mp4",
                "E:\\system_logs\\short videos\\Fav\\42a8c073c02b3aa37ccb6fe287881143_2594969.mp4"
        };

        // Initialize the Chrome driver
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.setExperimentalOption("debuggerAddress", "localhost:54762");
        ChromeDriver driver = new ChromeDriver(options);

        driver.getCapabilities().asMap().forEach((k, v) -> {
            System.out.println("K " + v);
        });

        int currentTab = 0;
        for (int i = 0; i < img.length; i++) {
            String s = img[i];
            if (currentTab == 2) currentTab = 0;
            System.out.println(s);

            try {
                driver.switchTo().window(driver.getWindowHandles().toArray()[currentTab].toString());
                Thread.sleep(2000);

                try {
                    // cross click button
                    driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[1]/div[1]/span/div/i")).click();
                    Thread.sleep(7000);
                } catch (Exception e) {
                }

                // reel click button
                driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[3]/div/div/div[1]/div[1]/div[2]/div/div/div/div/div[4]/div[2]/div/div[2]/div[1]/div/div/div/div/div[2]/div[3]/div[1]")).click();
                Thread.sleep(4000);

                // reel select button
                driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[5]/div/div/div[3]/form/div/div/div[1]/div/div[3]/div[1]/div[2]/div/div/div[1]/div/div/div")).click();
                Thread.sleep(3000);

                //select reel video
                ProcessBuilder builder = new ProcessBuilder("C:\\Users\\Administrator\\Desktop\\Career Automation\\AutoIT_Scripts\\UploadFile.exe", s);
                builder.start();
                Thread.sleep(6000);

                // Click next button
                try {
                    driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[5]/div/div/div[3]/form/div/div/div[1]/div/div[4]/div[2]/div/div/div")).click();
                    Thread.sleep(4000);
                } catch (Exception e) {
                }

                // Click next button
                driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[5]/div/div/div[3]/form/div/div/div[1]/div/div[4]/div[2]/div[2]/div[1]/div")).click();
                Thread.sleep(3000);

                // set description

                try {
                    driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[5]/div/div/div[3]/form/div/div/div[1]/div/div[3]/div[1]/div[2]/div/div/div/div/div[1]/div[1]/div[1]/div[1]")).sendKeys("""
                            Full Hot Video: bit.ly/hot-cute-bhabhi
                            .
                            .
                            #breastfeed #tandembreastfeeding #babysleep #reels
                            #reelsviral #reelsindia #love
                            #hindisong #foryou #love
                            #viral #fyp #reelsvideo
                            #freelsvideo #viralreels #viralreelsfb
                            #viral #viralvideo #fyp
                            #trend #trendingreels #song
                            #viralsongs #reelsvideo #instareel
                            #hotshot #reelsfb #bhabhilover
                            #dancevideo #sareelove #bhabhilover
                            
                            """);
                    Thread.sleep(3000);
                } catch (Exception e) {

                }
                Thread.sleep(8000);
                driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[5]/div/div/div[3]/form/div/div/div[1]/div/div[4]/div[2]/div[2]/div[1]/div/div[1]/div/span/span")).click();
                Thread.sleep(2000);

                currentTab++;
            } catch (Exception e) {
                System.err.println(">>>>> Error " + s + " >> " + e.getMessage());
                i--;
                Actions action = new Actions(driver);
                action.sendKeys(Keys.ESCAPE).perform();
                Thread.sleep(2000);
                driver.navigate().refresh();
                Thread.sleep(10000);
            }
        }
    }
}
