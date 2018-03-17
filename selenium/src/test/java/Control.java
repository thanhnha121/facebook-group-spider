
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author Administrator
 */
public class Control {

    private static WebDriver driver = null;
    
    public static void main(String[] args) {
        new Control().run();
    }
    
    public void run(){
        InputStreamReader isr;
        String tudien[] = new String[40];
        ArrayList<String> arrques = new ArrayList<>();
        ArrayList<String> arrans = new ArrayList<>();
        try {
            isr = new InputStreamReader(new FileInputStream("C:\\Users\\Nha Hoang\\Desktop\\hihi.txt"), "utf8");
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nha Hoang\\Desktop\\chromedriver.exe");
            BufferedReader br = new BufferedReader(isr);
            for (int i = 0; i < 40; i++) {
                tudien[i] = br.readLine().trim();
                arrques.add(tudien[i].split("@@")[0].trim());
                arrans.add(tudien[i].split("@@")[1].trim());
            }
//            String tam = tudien[0];
//            tudien[0] = "";
//            for (int i = 1; i < tam.length(); i++) {
//                tudien[0] += tam.charAt(i);
//            }
//            arrques.set(0, tudien[0].split("@@")[0]);
//            arrans.set(0, tudien[0].split("@@")[1]);
            for (int i = 0; i < 40; i++) {
                System.out.println(i);
                System.out.println(tudien[i]);
            }
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Control.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Control.class.getName()).log(Level.SEVERE, null, ex);
        }
        driver = new ChromeDriver();
        driver.get("http://thi.toiyeuptit.com/test.php");
        driver.findElement(By.name("username")).sendKeys("thanhnha121");
        driver.findElement(By.name("password")).sendKeys("thanhnha");
        driver.findElement(By.name("bsubmit")).click();
        driver.get("http://thi.toiyeuptit.com/test.php?testid=2");
        String ans[] = new String[4];
        for (int k = 1; k < 40; k++) {
            List<WebElement> a = driver.findElements(By.className("answer"));
            String ques = driver.findElement(By.tagName("span")).getText().trim();
            for (int i = 0; i < 4; i++) {
                ans[i] = a.get(i).getText();
            }
            for (int i = 0; i < 40; i++) {
                if (ques.equals(arrques.get(i))) {
                    int n = 0;
                    for (int j = 0; j < 4; j++) {
                        if (ans[j].equals(arrans.get(i))) {
                            n = 1;
                            driver.findElement(By.xpath("//*[@name='answer[" + k + "]'][@value='" + (j + 1) + "']")).click();
                            driver.findElement(By.className("btn")).click();
                            arrans.remove(i);
                            arrques.remove(i);
                            break;
                        }
                    }
                    if (n == 1) {
                        break;
                    }
                }
            }
        }

        List<WebElement> a = driver.findElements(By.className("answer"));
        for (int i = 0; i < 4; i++) {
            ans[i] = a.get(i).getText();
        }
        for (int j = 0; j < 4; j++) {
            if (ans[j].equals(arrans.get(0))) {
                driver.findElement(By.xpath("//*[@name='answer[40]'][@value='" + (j + 1) + "']")).click();
                driver.findElement(By.name("bsubmit")).click();
                break;
            }
        }
    }
}
