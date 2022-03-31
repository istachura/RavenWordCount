package WordCountTesting;

import org.junit.jupiter.api.Test;

class wordCount {

	@Test
	public void test() {
		RavenWordCount test = new RavenWordCount();
		@SuppressWarnings("unused")
		int output = test.countAnd("https://www.gutenberg.org/files/1065/1065-h/1065-h.htm");
		
	}

}
