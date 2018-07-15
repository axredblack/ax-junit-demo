package cases;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import main.Calc;

@RunWith(Parameterized.class)
public class CalcMulDivTest {
	
	private Calc calc;
	
	@Parameter(0)
    public int x;
    @Parameter(1)
    public int y;
    @Parameter(2)
    public int multiply;
    @Parameter(3)
    public int divide;
    
    @Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][] {{ 5, 0, 0, 1 }, { 10 , 0, 0, 0 }};
        return Arrays.asList(data);  
    }
    
    @Rule
    public ExpectedException exception = ExpectedException.none();
	
	
	@Before
	public void setUp() throws Exception {
		calc=new Calc();
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test(expected = ArithmeticException.class)
	public void testDivide() {
//		exception.expect(Exception.class);
	    assertEquals(divide, calc.divide(x, y));
	}

	@Test
	public void testMultiply() {
		assertThat(multiply, is(calc.multiply(x, y)));
	}

}
