package compare.xwj;

public class IterateString {

	@SuppressWarnings("unused")
	private static void printChar(int aChar) {
		System.out.println((char) (aChar));
	}

	public static void main(String[] args) {
		final String str = "w00t";
		//str.chars().forEach(System.out::println);
		//str.chars().forEach(IterateString::printChar);//类::方法
		//str.chars().mapToObj(ch -> Character.valueOf((char) ch)).forEach(System.out::println);
		//str.chars().filter(ch -> Character.isDigit(ch)).forEach(ch -> printChar(ch));
		str.chars().filter(Character::isDigit).forEach(IterateString::printChar);
	}
}
