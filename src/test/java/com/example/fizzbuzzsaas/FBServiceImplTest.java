package com.example.fizzbuzzsaas;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.example.fizzbuzzsaas.fuzzbuzz.FBService;
import com.example.fizzbuzzsaas.fuzzbuzz.FBServiceImpl;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class FBServiceImplTest {

	@TestConfiguration
	static class FBServiceImplTestContextConfiguration {

		@Bean
		public FBService fbService() {
			return new FBServiceImpl();
		}
	}

	@Autowired
	private FBService fbService;

	@Test
	public void fizzbizz_returnValidValues() {

		int upperbound = 15;
		// {"Fizz": [3, 6, 9, 12],"Bizz": [5, 10],"FizzBizz": [15]}
		List<Integer> fizzExpected = Arrays.asList(3,6,9,12);
		List<Integer> bizzExpected = Arrays.asList(5,10);
		List<Integer> fizzBizzExpected = Arrays.asList(15);

		Map<String, List<Integer>> fbresult = fbService.fizzbuzz(upperbound);

		assertTrue("Fizz list is not valid:" + fbresult.get("Fizz"),
				Arrays.equals(fizzExpected.toArray(), fbresult.get("Fizz").toArray()));
		assertTrue("Bizz list is not valid" + fbresult.get("Bizz"),
				Arrays.deepEquals(bizzExpected.toArray(), fbresult.get("Bizz").toArray()));
		assertTrue("FizzBizz list is not valid" + fbresult.get("FizzBizz"),
				Arrays.deepEquals(fizzBizzExpected.toArray(), fbresult.get("FizzBizz").toArray()));

		System.out.println("*******result is:");

		fbresult.forEach((s,i) -> System.out.format("%s: %s\n", s, i));

	}
}
