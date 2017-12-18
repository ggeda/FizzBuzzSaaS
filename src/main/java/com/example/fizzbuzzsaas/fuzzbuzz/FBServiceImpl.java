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
	public Map<String, List<Integer>> fizzbuzz(int upperlimit) {

		Map<String, List<Integer>> fbMapList = new HashMap<>();
		List<Integer> fizzList = new ArrayList<>();
		List<Integer> buzzList = new ArrayList<>();
		List<Integer> fizzBizzList = new ArrayList<>();

		IntStream.rangeClosed(1, upperlimit).parallel().forEachOrdered(i -> {
			if (i % 3 == 0 && i % 5 == 0) {
				fizzBizzList.add(i);
			} else if (i % 3 == 0 ) {
				fizzList.add(i);
			} else if (i % 5 == 0) {
				buzzList.add(i);
			}
		});

		fbMapList.put("Fizz", fizzList);
		fbMapList.put("Buzz", buzzList);
		fbMapList.put("FizzBuzz", fizzBizzList);
		return fbMapList;
	}
}
