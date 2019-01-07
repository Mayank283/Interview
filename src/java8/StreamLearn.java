package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * http://www.baeldung.com/java-8-streams-introduction
 * http://www.baeldung.com/java-8-streams
 * http://www.baeldung.com/java-8-new-features
 * http://www.concretepage.com/java/jdk-8/
 * 
 * Types of operations on stream or stream pipelining Create Stream -> apply
 * multiple intermediate operations -> Final termination(Only once) An
 * intermediate operation is called only after terminate operation
 * 
 * Intermediate operations which reduce the size of the stream should be placed
 * before operations which are applying to each element. example: skip(n);
 * 
 * Intermediate Operations: map,filter
 * 
 * Terminating Operations:
 * collect(),reduce(),sum(),max(),min(),findAny(),findFirst();
 * 
 * Ways to create Stream: 1. from arrays using Arrays.stream(array); 2. from any
 * Collections using collection.stream(); 3. from primitives example
 * IntStream.range 4. Stream builder Stream.<T>builder().add().build() 5. Using
 * Stream.generate(); 6. Using Stream.iterate(); 7. From file using Files.lines
 * 8. using Stream.of
 */

public class StreamLearn {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("Mayank");
		list.add("Srachendra");
		list.add("Rekha");

		String[] a = new String[] { "a", "b", "c" };
		StringBuilder role = new StringBuilder();

		list.forEach(action -> role.append(action + ","));

		System.out.println(role);

		String names = list.stream().map(mapper -> mapper.toUpperCase()).collect(Collectors.joining(","));
		System.out.println(Arrays.asList(names.split(",")).stream().map(mapper -> mapper.toLowerCase())
				.collect(Collectors.toList()));

		System.out.println(Arrays.stream(a).map(mapper -> mapper.toUpperCase()).collect(Collectors.toList()));
	}
}
