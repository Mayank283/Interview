package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**http://www.baeldung.com/java-8-streams-introduction
 * http://www.baeldung.com/java-8-streams
 * http://www.baeldung.com/java-8-new-features*/

public class StreamLearn {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("Mayank");
		list.add("Srachendra");
		list.add("Rekha");

		String [] a = new String[]{"a","b","c"};
		StringBuilder role = new StringBuilder();

		list.forEach(action -> {
			role.append(action + ",");
		});

		System.out.println(role);

		String names = list.stream().map(mapper -> mapper.toUpperCase()).collect(Collectors.joining(","));
		System.out.println(Arrays.asList(names.split(",")).stream().map(mapper -> mapper.toLowerCase())
				.collect(Collectors.toList()));
		
		System.out.println(Arrays.stream(a).map(mapper -> mapper.toUpperCase()).collect(Collectors.toList()));
	}
}
