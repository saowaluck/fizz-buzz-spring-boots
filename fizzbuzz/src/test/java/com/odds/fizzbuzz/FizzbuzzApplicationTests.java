package com.odds.fizzbuzz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FizzbuzzApplicationTests {

	@Test
	public void testShouldReturnFizzWhenInput3(){
		FizzbuzzApplication fizzbuzz = new FizzbuzzApplication();

		String actual = fizzbuzz.get(3);

		Assertions.assertEquals("fizz", actual);
	}

	@Test
	public void testShouldReturnBuzzWhenInput5(){
		FizzbuzzApplication fizzbuzz = new FizzbuzzApplication();

		String actual = fizzbuzz.get(5);

		Assertions.assertEquals("buzz", actual);
	}

	@Test
	public void testShouldReturnFizzBuzzWhenInput15(){
		FizzbuzzApplication fizzbuzz = new FizzbuzzApplication();

		String actual = fizzbuzz.get(15);

		Assertions.assertEquals("fizzbuzz", actual);
	}

	@Test
	public void testShouldReturn2WhenInput2(){
		FizzbuzzApplication fizzbuzz = new FizzbuzzApplication();

		String actual = fizzbuzz.get(2);

		Assertions.assertEquals("2", actual);
	}

}
