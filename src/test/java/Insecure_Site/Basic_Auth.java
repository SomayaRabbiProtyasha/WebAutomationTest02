package Insecure_Site;

import com.one.Base;

public class Basic_Auth extends Base {

	public static void main(String[] args) {
		launchChrome();
		BypassBasicAuth();
	}
   public static void BypassBasicAuth() {
		
		/*
		 * Technique
		 * driver.get("protocol//username:password@URL")
		 * 
		 */
			
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		System.out.println(driver.getTitle());
}
}
