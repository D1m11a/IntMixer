import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class IntMixer {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        List<T> firstList = first.toList();
        List<T> secondList = second.toList();
        
        List<T> mixedList = new ArrayList<>();
        int maxLength = Math.max(firstList.size(), secondList.size());
        
        for (int i = 0; i < maxLength; i++) {
            if (i < firstList.size()) {
                mixedList.add(firstList.get(i));
            }
            if (i < secondList.size()) {
                mixedList.add(secondList.get(i));
            }
        }
        
        Collections.shuffle(mixedList);
        
        return mixedList.stream();
    }

