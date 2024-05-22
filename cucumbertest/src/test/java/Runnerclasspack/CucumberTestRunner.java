package Runnerclasspack;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Featurefiles", glue= {"loginsample"},
monochrome = true,
plugin=
{"pretty","html:target/htmlreport/htmlreports"},
//{"pretty","json:target/jsonreports/login.json"}
//{"pretty","junit:target/xmlreports/login.xml"}
tags="@test1"
		)
public class CucumberTestRunner {
}