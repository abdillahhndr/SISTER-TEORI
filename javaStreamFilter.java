import java.util.stream.Stream;

public class javaStreamFilter {
    public static void main(String[] args) {
        Stream<String> namesStream = Stream.of("Abdi", "Jdul", "Abdul", "Ab", "Dul");

        namesStream.filter(name -> name.startsWith("J"))
                .forEach(System.out::println);
    }
}
