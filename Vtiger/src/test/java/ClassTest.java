
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassTest  extends ChromeDriver implements WebDriver{
	
	public static void main(String[] args) {
	
		System.getProperty("webdriver.geko.driver", "C:\\Users\\Ganesh J\\.eclipse\\Vtiger\\src\\test\\resources\\Reso\\geckodriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("www.anna.com");
		
		
		
	}

}
