package collections.xwj;

import java.util.Arrays;
import java.util.List;

public class Joining {

	public static void main(String[] args) {

		final List<String> friends = Arrays.asList("addf", "hfo", "dsfj", "skdjf", "dskfp");
		System.out.println(String.join(",  ", friends));
		//System.out.println(friends.stream().map(String::toUpperCase).collect(joining(",  ")));
	}
}