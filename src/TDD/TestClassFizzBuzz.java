package TDD;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;



class TestClassFizzBuzz {
	FizzBuzz fizzbuzz = new FizzBuzz();
	String input1 = fizzbuzz.getnumber1(1);
	String input2 = fizzbuzz.getnumber1(2);
	
	
	@Test
	void test1() {
		assertEquals("1", input1);
	}
	@Test
	void test2() {
		assertEquals("2", input2);
	}
}
