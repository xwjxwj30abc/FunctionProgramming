package collections.xwj;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Picking {

	final static void pickName(final List<String> names, final String startingLetter) {

		final Optional<String> foundName = names.stream().filter(name -> name.startsWith(startingLetter)).findFirst();
		foundName.ifPresent(name -> System.out.println("Hello" + name));
		System.out.println(String.format("starting with %s:%s", startingLetter, foundName.orElse("no name found")));
	}

	public static void main(String[] args) {

		final List<String> friends = Arrays.asList("addf", "hfo", "dsfj", "skdjf", "dskfp");
		pickName(friends, "l");
		pickName(friends, "d");
	}
}
