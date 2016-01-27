package test.junit.suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import test.junit.anno.BasicTest;

@RunWith(Suite.class)
@SuiteClasses({ BasicTest.class, SuiteTest.class })
public class AllTests {
	
}
