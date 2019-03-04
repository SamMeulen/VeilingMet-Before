
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class VeilingTest {
	private Veiling veiling;
	@Before
	public void before() {
	veiling = new Veiling();
	}
	
	@Test
	public void hoogsteBodIsNul() {
	assertEquals(0, veiling.getHoogsteBod());
	}
	@Test
	public void hoogsteBodIsEersteBod() {
	veiling.doeBod(100);
	assertEquals(100, veiling.getHoogsteBod());
	}
	@Test
	public void meerdereBiedingen() {
	veiling.doeBod(200);
	veiling.doeBod(100);
	assertEquals(200, veiling.getHoogsteBod());
	}

}
