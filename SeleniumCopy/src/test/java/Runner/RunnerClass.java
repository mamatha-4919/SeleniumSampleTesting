package Runner;


import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(features =  "Amazon.feature" , glue = { "StepDefinition" })

public class RunnerClass 
  {

}
