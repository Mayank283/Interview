package language.java.v8.features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test2 {
	private static int batchSize = 4;

	public static void main(String[] args) {

		final List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		final List<List<Integer>> groups = IntStream.range(0, numbers.size()).boxed()
				.collect(Collectors.groupingBy(index -> index / batchSize)).values().stream()
				.map(indices -> indices.stream().map(numbers::get).collect(Collectors.toList()))
				.collect(Collectors.toList());
		System.out.println(groups);
	}
}
