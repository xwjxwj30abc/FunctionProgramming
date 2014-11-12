package collections.xwj;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reducing {

	public static void main(String[] args) {

		final List<String> friends = Arrays.asList("addf", "hfo", "dsfj", "skdjf", "dskfp");
		System.out.println(friends.stream().mapToInt(name -> name.length()).sum());

		final Optional<String> aLongName1 = friends.stream().reduce(
				(name1, name2) -> name1.length() >= name2.length() ? name1 : name2);
		aLongName1.ifPresent(name -> System.out.println(String.format("a longest name:%s", name)));

		final String aLongName2 = friends.stream().reduce("Stevve",
				(name1, name2) -> name1.length() >= name2.length() ? name1 : name2);
		System.out.println(String.format("a longest name:%s", aLongName2));
	}
}