package com.example.fizzbuzzsaas.fuzzbuzz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.stereotype.Service;

@Service
public class FBServiceImpl implements FBService {

	@Override
	public Map<String, List<Integer>> fizzbuzz(final int upperlimit) {

		if (upperlimit < 0) throw new IllegalArgumentException("The upper limit must be a positive integer");

		Map<String, List<Integer>> fbMapList = new HashMap<>();
		List<Integer> fizzList = new ArrayList<>();
		List<Integer> buzzList = new ArrayList<>();
		List<Integer> fizzBizzList = new ArrayList<>();

		IntStream.rangeClosed(1, upperlimit).parallel().forEachOrdered(i -> {

			if (isFizz(i)) fizzList.add(i);
			if (isBuzz(i)) buzzList.add(i);
			if (isFizzBuzz(i)) fizzBizzList.add(i);
		});

		fbMapList.put("Fizz", fizzList);
		fbMapList.put("Buzz", buzzList);
		fbMapList.put("FizzBuzz", fizzBizzList);
		return fbMapList;
	}

	private boolean isBuzz(int i) {
		return i % 5 == 0 & i % 3 != 0;
	}

	private boolean isFizz(int i) {
		return i % 3 == 0 && i % 5 != 0;
	}

	private boolean isFizzBuzz(int i) {
		return i % 3 == 0 && i % 5 == 0;
	}
}
