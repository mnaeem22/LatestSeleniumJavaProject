import org.openqa.selenium.chrome.ChromeDriver;

public class latestSeleniumJavaTest {
    public static void main(String[] args){

        ChromeDriver driver = new ChromeDriver();
        driver.get("http://google.com");
        driver.quit();
    }
}
