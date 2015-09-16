import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestQuadratic {

	private QuadraticEquationSolver p;

	@Before
	public void setUp(){
		p = new QuadraticEquationSolver(2, 3, -5);
	}

	@Test
	public void testTestInput() {
		
		assertEquals(2, p.getA());
		assertEquals(3, p.getB());
		assertEquals(-5, p.getC());
	}

	@Test
	public void testTestDelta() {
		assertEquals(-32, p.computeDelta());
	}

	@Test
	public void testTestX() {
		if(p.computeDelta() == 0){
			assertEquals(3, p.returnX());
		}
	}

	@Test
	public void testTestX1AndX2() {
		if(p.computeDelta() > 0){
			assertEquals(1, p.returnX1());
			assertEquals(-5.0/2, p.returnX2());
		}
	}

}
