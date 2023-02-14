package A.CUSTOMFRAMEWORK;//this is hooks file and multiple run file too 


  import org.junit.runner.RunWith;
  
  import io.cucumber.junit.Cucumber; import io.cucumber.junit.CucumberOptions;
  
  @RunWith(Cucumber.class)
  
  @CucumberOptions(features = "Feature", 
  tags = "@smoke", 
  glue =  "steps_definations",
  plugin = {"pretty","html:target/report.html"}, 
  monochrome = true )
  
 
 public class AppTest {
 
 
  
  }
 
//glue is a key word of cucumber option and we need to give path of step definition package 
  //Monochrome= if is there any steps are missing then it will be flagged 