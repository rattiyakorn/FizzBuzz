package TDD;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;



class TestClassFizzBuzz {
	FizzBuzz fizzbuzz = new FizzBuzz();
	String input1 = fizzbuzz.getnumber1(1);
	String input2 = fizzbuzz.getnumber1(2);
	String input3 = fizzbuzz.getnumber1(3);
	String input4 = fizzbuzz.getnumber1(4);
	String input5 = fizzbuzz.getnumber1(5);
	String input6 = fizzbuzz.getnumber1(6);
	String wordF ="Fizz";
	String wordB ="Buzz";
	
	@Test
	void test1() {
		assertEquals("1", input1);
	}
	@Test
	void test2() {
		assertEquals("2", input2);
	}
	@Test
	void test3() {
		assertEquals(wordF, input3);
	
	}
	@Test
	void test4() {
		assertEquals("4", input4);
	}
	@Test
	void test5() {
		assertEquals(wordB, input5);
	}
	@Test
	void test6() {
		assertEquals(wordF, input6);
	}
	
}
