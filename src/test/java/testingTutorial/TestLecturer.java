package testingTutorial;

import org.junit.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestLecturer {

	@Test
	public void test() throws IOException {
		assertEquals("123", "123");
	}
}
