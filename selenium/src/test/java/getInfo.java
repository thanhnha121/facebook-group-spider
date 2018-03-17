
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getInfo {

    private static WebDriver driver = null;
    static String unpass = "http://thi.toiyeuptit.com/images/select_00.gif";
    static String pass = "http://thi.toiyeuptit.com/images/select_01.gif";

    public void firstBlood() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nha Hoang\\Desktop\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://thi.toiyeuptit.com/test.php");
        driver.findElement(By.name("username")).sendKeys("thanhnha121");
        driver.findElement(By.name("password")).sendKeys("thanhnha");
        driver.findElement(By.name("bsubmit")).click();
        driver.get("http://thi.toiyeuptit.com/test.php?testid=2");
        for (int k = 1; k < 40; k++) {
            driver.findElement(By.xpath("//*[@name='answer[" + k + "]'][@value='" + 1 + "']")).click();
            driver.findElement(By.className("btn")).click();
        }
        driver.findElement(By.xpath("//*[@name='answer[40]'][@value='" + 1 + "']")).click();
        driver.findElement(By.name("bsubmit")).click();
    }

    public int getId(String xpath) {
        StringBuilder rs = new StringBuilder();
        for (int i = xpath.length() - 1; i >= 0; i--) {
            if (xpath.charAt(i) != '=') {
                rs.append(xpath.charAt(i));
            } else {
                break;
            }
        }
        String xx = rs.reverse().toString();
        int x = Integer.parseInt(xx);
        return x;
    }

    public void getDic() {
        ArrayList<WebElement> lisA = (ArrayList<WebElement>) driver.findElements(By.tagName("a"));
        lisA.get(2).click();
        String url = driver.getCurrentUrl();
        int id = getId(url);
        Writer bw = null;
        try {
            bw = new OutputStreamWriter(new FileOutputStream("C:\\Users\\Nha Hoang\\Desktop\\hihi.txt"), "utf8");
        } catch (FileNotFoundException | UnsupportedEncodingException ex) {
            Logger.getLogger(getInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (int i = 1; i <= 40; i++) {
            try {
                String aref = "http://thi.toiyeuptit.com/reports-manager.php?action=viewa&answerid=" + i + "&resultid=" + id;
                driver.get(aref);
                ArrayList<WebElement> listab = (ArrayList<WebElement>) driver.findElements(By.tagName("table"));
                ArrayList<WebElement> lisimg = (ArrayList<WebElement>) listab.get(3).findElements(By.tagName("img"));
                ArrayList<WebElement> lisanse = (ArrayList<WebElement>) listab.get(3).findElements(By.tagName("td"));
                int vtpass = -1;
                for (int j = 16; j <= 22; j = j + 2) {
                    if (lisimg.get(j).getAttribute("src").equalsIgnoreCase(pass)) {
                        vtpass = (j - 16) / 2;
                    }
                }
                
                String quest = lisanse.get(20).getText();
                String ans1 = lisanse.get(vtpass * 2 + 22).getText();
                bw.write(quest);
                bw.write("@@" + ans1);
                bw.write("\r\n");
            } catch (IOException ex) {
                Logger.getLogger(getInfo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        try {
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(getInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void test(int id){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nha Hoang\\Desktop\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://thi.toiyeuptit.com/test.php");
        driver.findElement(By.name("username")).sendKeys("thanhnha121");
        driver.findElement(By.name("password")).sendKeys("thanhnha");
        driver.findElement(By.name("bsubmit")).click();
        Writer bw = null;
        try {
            bw = new OutputStreamWriter(new FileOutputStream("C:\\Users\\Nha Hoang\\Desktop\\hihi.txt"), "utf8");
        } catch (FileNotFoundException | UnsupportedEncodingException ex) {
            Logger.getLogger(getInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (int i = 2; i <= 40; i++) {
            try {
                String aref = "http://thi.toiyeuptit.com/reports-manager.php?action=viewa&answerid=" + i + "&resultid=" + id;
                driver.get(aref);
                ArrayList<WebElement> listab = (ArrayList<WebElement>) driver.findElements(By.tagName("table"));
                ArrayList<WebElement> lisimg = (ArrayList<WebElement>) listab.get(3).findElements(By.tagName("img"));
                ArrayList<WebElement> lisanse = (ArrayList<WebElement>) listab.get(3).findElements(By.tagName("td"));
                int vtpass = -1;
                for (int j = 16; j <= 22; j = j + 2) {
                    if (lisimg.get(j).getAttribute("src").equalsIgnoreCase(pass)) {
                        vtpass = (j - 16) / 2;
                    }
                }
                
                String quest = lisanse.get(20).getText();
                String ans1 = lisanse.get(vtpass * 2 + 22).getText();
                bw.write(quest);
                bw.write("@@" + ans1);
                bw.write("\r\n");
            } catch (IOException ex) {
                Logger.getLogger(getInfo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        try {
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(getInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
        new Control().run();
    }

    public static void main(String[] args) {
        new getInfo().firstBlood();
        new getInfo().getDic();
        new Control().run();
//        new getInfo().test(int id);
    }

}
