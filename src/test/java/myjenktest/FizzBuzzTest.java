package myjenktest;

import org.junit.jupiter.api.*;

public class FizzBuzzTest {
	public FizzBuzz fb;

		@BeforeEach
		public void setup() {
			fb=new FizzBuzz();
		}
		
		@DisplayName("Play FizzBuzz with number=1")		
		@Test
		public void testNumber() {
			String risultato=fb.play(1);
			Assertions.assertEquals(risultato, "1");
		}
		
}