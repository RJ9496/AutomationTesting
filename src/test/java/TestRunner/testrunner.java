package TestRunner;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(

features="src/test/java/Feature"
,glue= {"StepDefination","Hook"},


plugin={"pretty","html:target/cucumber-preety","json:target/cucumber.json","junit:target/cucumber.xml"}
)
public class testrunner {

}
