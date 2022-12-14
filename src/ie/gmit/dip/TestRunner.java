package ie.gmit.dip;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
//import org.junit.platform.runner.JUnitPlatform;
//import org.junit.platform.suite.api.SelectClasses;

@RunWith(value=Suite.class)
@SuiteClasses(value={
	SurchargeGiverTestClass.class,
	AboveAgeTestClass.class,
	Accidents6OrGreaterTestClass.class,
	BelowAgeTestClass.class
	
	//The following 3 tests must be manually run. See README text file for details.
	
	//AccidentsCheckerTestClass.class, 
	//AccidentsInputTestClass.class,
	//AgeInputTestClass.class,
})

class TestRunner {
	
}

