import java.util.stream.Stream;

public class javaStreamMap {
    public static void main(String[] args) {
        Stream<String> namesStream = Stream.of("Abdi", "Adul", "Abdul", "Ab", "Dul");

        namesStream.map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
