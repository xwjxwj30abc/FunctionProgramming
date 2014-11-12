package compare.xwj;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListFiles {
	public static void main(String[] args) throws IOException {
		Files.list(Paths.get(".")).filter(Files::isDirectory).forEach(System.out::println);
		Files.newDirectoryStream(Paths.get("."), path -> path.toString().endsWith("java")).forEach(System.out::println);
		final File[] files1 = new File(".").listFiles(file -> file.isHidden());
		final File[] files2 = new File(".").listFiles(File::isHidden);

		List<File> files = Stream.of(new File(".").listFiles())
				.flatMap(file -> file.listFiles() == null ? Stream.of(file) : Stream.of(file.listFiles()))
				.collect(Collectors.toList());
		System.out.println(files.size());
	}
}
