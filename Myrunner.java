package myRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "D:\\Suraj_WorkSpace\\cucumberDemo\\src\\main\\java\\features\\login.feature", //the path of the feature files
		glue={"cucumberDemo.cucumberDemo"})//the path of the step definition files
		

public class Myrunner {

}
