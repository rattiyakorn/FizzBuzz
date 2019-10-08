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
	String input7 = fizzbuzz.getnumber1(7);
	String input8 = fizzbuzz.getnumber1(8);
	String input9 = fizzbuzz.getnumber1(9);
	String input10 = fizzbuzz.getnumber1(10);
	String input11 = fizzbuzz.getnumber1(11);
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
	@Test
	void test7() {
		assertEquals("7", input7);
	}
	@Test
	void test8() {
		assertEquals("8", input8);
	}
	@Test
	void test9() {
		assertEquals(wordF, input9);
	}
	@Test
	void test10() {
		assertEquals(wordB, input10);
	}
	@Test
	void test11() {
		assertEquals("11", input11);
	}
	

}
