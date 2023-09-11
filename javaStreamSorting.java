import java.util.stream.Stream;

public class javaStreamSorting {
    public static void main(String[] args) {
        Stream<String> namesStream = Stream.of("Abdi", "Adul", "Abdul", "Ab", "Dul");

        namesStream.sorted()
                .forEach(System.out::println);
    }
}
