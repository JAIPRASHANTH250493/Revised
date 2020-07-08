package SeleniumRevised;

import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

import org.testng.IClass;
import org.testng.IRetryAnalyzer;
import org.testng.ITestClass;
import org.testng.ITestNGMethod;
import org.testng.asserts.SoftAssert;
import org.testng.internal.ConstructorOrMethod;
import org.testng.xml.XmlTest;

public class Retryannotation implements ITestNGMethod {

	@Override
	public Class getRealClass() {
		// TODO Auto-generated method stub
		return null;SoftAssert s=new SoftAssert();
		
	}

	@Override
	public ITestClass getTestClass() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setTestClass(ITestClass cls) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getMethodName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getInstance() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long[] getInstanceHashCodes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] getGroups() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] getGroupsDependedUpon() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getMissingGroup() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setMissingGroup(String group) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String[] getBeforeGroups() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] getAfterGroups() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] getMethodsDependedUpon() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addMethodDependedUpon(String methodName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isTest() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isBeforeMethodConfiguration() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isAfterMethodConfiguration() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isBeforeClassConfiguration() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isAfterClassConfiguration() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isBeforeSuiteConfiguration() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isAfterSuiteConfiguration() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isBeforeTestConfiguration() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isAfterTestConfiguration() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isBeforeGroupsConfiguration() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isAfterGroupsConfiguration() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long getTimeOut() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setTimeOut(long timeOut) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getInvocationCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setInvocationCount(int count) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getSuccessPercentage() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setId(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public long getDate() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setDate(long date) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean canRunFromClass(IClass testClass) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isAlwaysRun() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getThreadPoolSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setThreadPoolSize(int threadPoolSize) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean getEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setDescription(String description) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void incrementCurrentInvocationCount() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getCurrentInvocationCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setParameterInvocationCount(int n) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getParameterInvocationCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setMoreInvocationChecker(Callable<Boolean> moreInvocationChecker) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean hasMoreInvocation() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ITestNGMethod clone() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IRetryAnalyzer getRetryAnalyzer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setRetryAnalyzer(IRetryAnalyzer retryAnalyzer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean skipFailedInvocations() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setSkipFailedInvocations(boolean skip) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public long getInvocationTimeOut() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean ignoreMissingDependencies() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setIgnoreMissingDependencies(boolean ignore) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Integer> getInvocationNumbers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setInvocationNumbers(List<Integer> numbers) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addFailedInvocationNumber(int number) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Integer> getFailedInvocationNumbers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getPriority() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setPriority(int priority) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getInterceptedPriority() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setInterceptedPriority(int priority) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public XmlTest getXmlTest() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ConstructorOrMethod getConstructorOrMethod() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, String> findMethodParameters(XmlTest test) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getQualifiedName() {
		// TODO Auto-generated method stub
		return null;
	}

}
