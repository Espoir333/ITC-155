import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class stringTest {

	@Test
	void test1() {
		assertEquals("we are the champions", string.lower("WE ARE THE CHAMPIONS"));
	}
	
	@Test
	void test2() {
		assertNotEquals("WE ARE THE CHAMPIONS", string.lower("WE ARE THE CHAMPIONS"));
	}
	
	@Test
	void test3() {
		assertNotEquals("DOG", string.lower("cat"));
	}
	
	@Test
	void test4() {
		assertNotNull(string.lower("cat"));
	}
}
