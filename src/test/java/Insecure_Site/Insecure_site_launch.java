package Insecure_Site;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.one.Base;

public class Insecure_site_launch extends Base {

	public static void main(String[] args) {

	BypassCertificate();
	CloseChrome();
}

public static void BypassCertificate() {
	System.setProperty("webdriver.chrome.driver", "D:\\java\\New folder\\tools\\chromedriver.exe");			
	ChromeOptions opt=new ChromeOptions();	
	opt.setAcceptInsecureCerts(true);		
	WebDriver driver=new ChromeDriver(opt);	
	
	driver.get("https://cacert.org/");
	
	System.out.println(driver.getTitle());
}

}
