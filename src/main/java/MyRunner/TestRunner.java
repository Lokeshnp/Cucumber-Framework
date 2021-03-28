package MyRunner;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;




    @RunWith(Cucumber.class)
    @CucumberOptions(
            features = "D:\\Automation\\code\\Cucumber-Framework\\src\\main\\java\\Features\\tagging.feature", //the path of the feature files
            glue={"stepDefinitions"}, //the path of the step definition files
           format = {"pretty", "html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"} , //to generate different types of reporting
            dryRun = false,
           monochrome = true, //display the console output in a proper readable format
            strict = true, //it will check if any step is not defined in step definition file
         //   dryRun = false //to check the mapping is proper between feature file and step def file
            tags = {"@SmokeTest" , "@RegressionTest"}
    )

    // tags = {"@SmokeTest , @RegressionTest"} - OR -> executes all the test cases tagged as @SmokeTest or @RegressionTest
    // tags = {"@SmokeTest" , "@RegressionTest"} - AND -> executes all the test cases tagged as @SmokeTest and @RegressionTest
    // tags = {"~@SmokeTest" , "~@RegressionTest", "~@End2End"} -> ignoring test cases


    public class TestRunner {

}
