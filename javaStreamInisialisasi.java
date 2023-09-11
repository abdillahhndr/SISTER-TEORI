import java.util.Arrays;
import java.util.stream.Stream;

public class javaStreamInisialisasi {
    public static void main(String[] args) {
        String[] namesArray = { "Abdi", "Adul", "Abdul", "Ab", "Dul" };
        Stream<String> namesStream = Arrays.stream(namesArray);

        namesStream.forEach(System.out::println);
    }
}
