package compare.xwj;

import java.util.Arrays;
import java.util.List;

public class Compare {
	public static void main(String[] args) {
		final List<Person> person = Arrays.asList(new Person("John", 20), new Person("Sara", 21),
				new Person("Jane", 21), new Person("Greg", 35));
		/*List<Person> ascendingAge = person.stream().sorted((person1, person2) -> person1.agedifference(person2))
				.collect(Collectors.toList());
		ascendingAge.forEach(System.out::println);*/

		/*List<Person> byName = person.stream()
				.sorted((person1, person2) -> person1.getName().compareTo(person2.getName()))
				.collect(Collectors.toList());
		byName.forEach(System.out::println);*/

		/*final Function<Person, String> byName1 = person1 -> person1.getName();
		List<Person> ascendingAge = person.stream().sorted(Comparator.comparing(byName1)).collect(Collectors.toList());*/

		/*Comparator<Person> byAge=Comparator.comparing(Person::getAge);
		Map<Character,Optional<Person>> oldPersonInEachAlphabet=
				person.stream()
				.collect(groupingBy(person1->person1.getName().charAt(0),reducing(BinaryOperator.maxBy(byAge))));
		 */
		//代码有点问题

	}
}
