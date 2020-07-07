package SeleniumRevised;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Listerner implements IRetryAnalyzer{

	@Override
	public boolean retry(ITestResult result) {
		int a=3;
		for(int i=0;i<3;i++) {
			System.out.println(",,.............retrying");
			return true;
			
		}
				
		return false;
	}

}
