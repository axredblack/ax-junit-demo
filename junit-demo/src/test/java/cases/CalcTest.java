package cases;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.Calc;

public class CalcTest {

	private Calc calc;

	@Before
	public void setUp() throws Exception {
		calc=new Calc();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	
	public void testAdd() {

	    assertEquals(5, calc.add(4, 1));
	}

	@Test
	public void testSubtract() {
		assertThat(5, is(calc.subtract(15, 10)));
	}

}
