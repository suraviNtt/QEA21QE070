package suitsRunner;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(JUnitPlatform.class)
@SelectClasses(testRunner.TestRunner.class)
public class SuitRunner {

	
}
