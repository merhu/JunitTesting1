package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class countATest {

	@Test
	void test() {

		JunitTesting test = new JunitTesting();
		int output = test.countA("Merhawit Ambaye");
		assertEquals(3, output);
	}

}
