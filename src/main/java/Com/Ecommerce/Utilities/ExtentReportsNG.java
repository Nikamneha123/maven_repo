package Com.Ecommerce.Utilities;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import com.aventstack.extentreports.ExtentReports;

/*public class ExtentReportsNG {
	
	static ExtentReports extents;
	
	public static ExtentReports getReportObject() {
		
		String Timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
				
		String Name = "ExtentReport --"+Timestamp;
		
		Path resourceDirectory=Paths.get("src", "test","resoures");
		String absolutePath=resourceDirectory.toFile().getAbsolutePath();
		System.out.println(absolutePath);
		
		String Path = absolutePath+"//Reports//"+Name+" "+".html";
		
		ExtentHtmlReporter reporter =new ExtentHtmlReporter(Path);
		
		//7ExtentReporter reporter=new ExtentReporter(Path);
		
		
		reporter.config().setReportName("Maven_project extent report");
		reporter.config().setDocumentTitle("Maven_project execution result");

		extents= new ExtentReports();
		
		extents.attachReporter(reporter);
		
		extents.setSystemInfo("QA Automation engineer", "Neha Nikam");
		extents.setSystemInfo("Suite Name", "Regression/Smoke");

       return extents;
	}*/
public class ExtentReportsNG {

	static ExtentReports extents;
		
	public static ExtentReports getReportObject(){
		
		String Timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
				
		String Name = "ExtentReport --"+Timestamp;
		
		//String Path = System.getProperty("user.dir")+"//Reporter//"+Name+" "+".html";
		
		Path resourceDirectory = Paths.get("src", "test", "resources");
		
        String absolutePath = resourceDirectory.toFile().getAbsolutePath();
		
		System.out.println(absolutePath);
		
		String Path = absolutePath + "//Reporter//"+Name+" "+".html";
		
		ExtentHtmlReporter reporter =new ExtentHtmlReporter(Path);
		
		reporter.config().setReportName("11March Framework extent report");
		reporter.config().setDocumentTitle("11March Framework execution result");

		extents= new ExtentReports();
		
		extents.attachReporter(reporter);
		
		extents.setSystemInfo("QA Automation engineer", "Neha Nikam");
		extents.setSystemInfo("Suite Name", "Regression/Smoke");

       return extents;
	}
	
}

	


