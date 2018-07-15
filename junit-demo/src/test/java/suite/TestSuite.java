package suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import cases.CalcAddSubTest;
import cases.CalcMulDivTest;

@RunWith(Suite.class)
@SuiteClasses({CalcAddSubTest.class, CalcMulDivTest.class})
public class TestSuite {

}
