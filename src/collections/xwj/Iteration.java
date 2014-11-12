package collections.xwj;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Iteration {
	public static void main(String[] args) {

		final List<String> friends = Arrays.asList("addf", "hfo", "dsfj", "skdjf", "dskfp");
		//1
		/*for (String name : friends) {
			System.out.println(name);
		}*/
		//2
		friends.forEach(new Consumer<String>() {
			@Override
			public void accept(final String name) {
				System.out.println(name);
			}
		});
		//3
		//friends.forEach((final String name) -> System.out.println(name));
		//friends.forEach((name) -> System.out.println(name));
		friends.forEach(System.out::println);

	}
}
