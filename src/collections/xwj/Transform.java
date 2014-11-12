package collections.xwj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Transform {

	public static Predicate<String> startWithLetter(final String letter) {
		return name -> name.startsWith(letter);
	}

	public static void main(String[] args) {
		final List<String> friends = Arrays.asList("addf", "hfo", "dsfj", "skdjf", "dskfp");
		final List<String> uppercaseNames = new ArrayList<String>();
		/*
				for (String name : friends) {
					uppercaseNames.add(name.toUpperCase());
				}
		 */
		final Function<String, Predicate<String>> startWithLett1 = (String letter) -> {
			Predicate<String> checkStartWith = (String name) -> name.startsWith(letter);
			return checkStartWith;
		};

		@SuppressWarnings("unused")
		final Function<String, Predicate<String>> startWithLett2 = (String letter) -> (String name) -> name
		.startsWith(letter);

		@SuppressWarnings("unused")
		final Function<String, Predicate<String>> startWithLett3 = letter -> name -> name.startsWith(letter);

		final long countFriendsStartS = friends.stream().filter(startWithLett1.apply("s")).count();
		System.out.println(countFriendsStartS);

		friends.forEach(name -> uppercaseNames.add(name.toUpperCase()));
		System.out.println(uppercaseNames);

		final Predicate<String> startWithS1 = name -> name.startsWith("s");
		final List<String> startWithS = friends.stream().filter(startWithS1).collect(Collectors.toList());
		System.out.println(String.format("Found %d names", startWithS.size()));

		friends.stream().map(name -> name.toUpperCase()).forEach(name -> System.out.println(name + " "));

		friends.stream().map(String::toUpperCase).forEach(name -> System.out.println(name + " "));//method references
		friends.stream().map(name -> name.length()).forEach(name -> System.out.println(name + " "));

		final List<String> startWithS2 = friends.stream().filter(name -> name.startsWith("s"))
				.collect(Collectors.toList());
		System.out.println(String.format("Found %d names", startWithS2.size()));

		final List<String> startWithS3 = friends.stream().filter(startWithLetter("s")).collect(Collectors.toList());
		System.out.println(String.format("Found %d names", startWithS3.size()));

	}
}