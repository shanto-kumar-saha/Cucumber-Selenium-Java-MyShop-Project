package Sample.CucumberProject1;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;


@RunWith(cucumber.class)

@CucumberOptions{
	monochorme = true;
	publish = true,
	features = "featureFiles/login.feature",
	glue = "Sample.CucumberProject1"
			
}
public class RunCucumberTest {
}
