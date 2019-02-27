
import org.junit.Test;
import static org.junit.Assert.*;

public class VeilingTest {
	@Test
	public void hoogsteBodIsNul() {
	Veiling veiling = new Veiling ();
	assertEquals(0, new Veiling().getHoogsteBod());
	}
	@Test
	public void hoogsteBodIsEersteBod() {
	Veiling veiling = new Veiling ();
	veiling.doeBod(100);
	assertEquals(100, veiling.getHoogsteBod());
	}
	@Test
	public void meerdereBiedingen() {
	Veiling veiling = new Veiling ();
	veiling.doeBod(200);
	veiling.doeBod(100);
	assertEquals(200, veiling.getHoogsteBod());
	}

}
