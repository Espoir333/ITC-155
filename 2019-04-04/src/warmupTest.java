import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class warmupTest {

	@Test
	void testBasic1() {
		assertEquals(1,warmup.area(1, 1));
	}
	
	@Test
	void testBasic2() {
		assertEquals(25,warmup.area(5, 5));
	}
	
	@Test
	void testBasic3() {
		assertEquals(20,warmup.area(4, 5));
	}
	
	@Test
	void testnNegative1() {
		assertEquals(1,warmup.area(-1, -1));
	}
	
	@Test
	void testNegative2() {
		assertEquals(-25,warmup.area(-5, 5));
	}
	
	@Test
	void testNegative3() {
		assertEquals(25,warmup.area(-5, -5));
	}
	
	@Test
	void testNegative4() {
		assertEquals(-20,warmup.area(5, -4));
	}

}
