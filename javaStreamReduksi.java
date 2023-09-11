import java.util.stream.Stream;

public class javaStreamReduksi {
    public static void main(String[] args) {
        Stream<Integer> numbersStream = Stream.of(1, 2, 3, 4, 5);

        int sum = numbersStream.reduce(0, (a, b) -> a + b);
        System.out.println("Jumlah: " + sum);
    }
}
