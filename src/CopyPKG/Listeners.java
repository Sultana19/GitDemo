package CopyPKG;
import org.testng.ITestListener;
import org.testng.ITestResult;

//ITestListener interface which implements Testng listeners
public class Listeners implements ITestListener {
	
public void onTestSuccess(ITestResult result)	{
	System.out.println("i successfully executed listner pass code");
}

	
}
