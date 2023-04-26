package testrunnermarathonfour;

import finalmarathonbasepack.FinalMarathonBaseClass;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features={"src/main/java/marathonfourFeatures"},
glue="stepDefinitionsmarathonfour",
monochrome=true, 
plugin ={"pretty", "html:test-output/CucumberReports/cucumber-reports"}

)

public class Testrunnerclassmarathofour extends FinalMarathonBaseClass {

	
	
}
