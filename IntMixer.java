package IntMixer;

import java.util.stream.Stream;

public class IntMixer {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        return Stream.concat(
                first.limit(Math.min(first.count(), second.count())),
                second.limit(Math.min(first.count(), second.count()))
        );
    }

    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5);
        Stream<Integer> stream2 = Stream.of(10, 20, 30);

        Stream<Integer> zippedStream = zip(stream1, stream2);

        zippedStream.forEach(System.out::println);
    }
}

