package WordCountTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class compareWordCount {

	@Test
	void test() {
		RavenWordCount test = new RavenWordCount();
		int output = test.compare("and, of");
		assertEquals(95, output);
	}

}