package cases;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.stubbing.OngoingStubbing;

import main.Calc;
import main.CalcService;

@RunWith(Parameterized.class)
public class CalcAddSubTest {
	
	@Mock
	private CalcService cserviceMock;
	
	@InjectMocks
	private Calc calc;
	
	@Parameter(0)
    public int x;
    @Parameter(1)
    public int y;
    @Parameter(2)
    public int add;
    @Parameter(3)
    public int subtract;
    
    @Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][] { { 10 , 2, 12, 8 }, { 5, 3, 8, 2 }};
        return Arrays.asList(data);  
    }
    
	@Before
	public void setUp() throws Exception {
		calc=new Calc();
		 MockitoAnnotations.initMocks(this);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test	
	public void testAdd() {
		
		OngoingStubbing<Integer> stub = Mockito.when(cserviceMock.add(x,y)).thenReturn(add);
	    assertEquals(add, calc.add(x, y));
	}

	@Test
	public void testSubtract() {
		OngoingStubbing<Integer> stub = Mockito.when(cserviceMock.subtract(x,y)).thenReturn(subtract);
		assertThat(subtract, is(calc.subtract(x, y)));
	}

}
