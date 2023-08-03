package zjc.streams;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.function.Predicate;
import java.util.Map;

/*
* The terminal operations of the Java Stream interface typically return a single value.
*    anyMatch()   - Syntax: boolean anyMatch(Predicate<? super T> predicate)
*                   Stream anyMatch(Predicate predicate)
*                   returns whether any elements of this stream match the provided predicate.
*    allMatch()   - Syntax: boolean allMatch(Predicate<? super T> predicate)
*                   The allMatch() method returns always a true or false, based on the result of the evaluation.
*    noneMatch()  - Syntax: boolean noneMatch(Predicate<? super T> predicate)
*
*    collect()    - Syntax:
*                   <T,K,U> Collector<T,?,Map<K,U>> toMap(Function<? super T,? extends K> keyMapper,
*                                                         Function<? super T,? extends U> valueMapper)
*                   <T,K,U> Collector<T,?,Map<K,U>> toMap(Function<? super T,? extends K> keyMapper,
*                                                         Function<? super T,? extends U> valueMapper,
*                                                         BinaryOperator<U> mergeFunction)
*                   <T,K,U,M extends Map<K,U>> Collector<T,?,M> toMap(Function<? super T,? extends K> keyMapper,
*                                                                     Function<? super T,? extends U> valueMapper,
*                                                                     BinaryOperator<U> mergeFunction,
*                                                                     Supplier<M> mapSupplier)
*                   - Parameters:
*                   keyMapper: A mapping function to produce the map keys for each input stream element.
*                   valueMapper: A mapping function to produce the map values for each input stream element.
*                   mergeFunction: A binary operator which is to resolve collisions between values associated with the same key. The inputs to this function are the values which belong to the same key.
*                   mapSupplier: A function which provides a new instance of the desired implementation of the Map.
*                   - The method Collectors.toMap(keyMapper, valueMapper) will throw IllegalStateException if there are duplicate keys as provided by keyMapper function.
*                   - https://www.logicbig.com/how-to/code-snippets/jcode-java-8-streams-collectors-tomap.html
*    count()      -
*    findAny()    -
*    findFirst()  -
*    forEach()    -
*    min()        -
*    max()        -
*    reduce()     -
*    toArray()    -
*/
public class StreamTerminalOperations {
    public void streamAnyMatch() {
        List<String> stringList = new ArrayList<String>();

        stringList.add("Java Guides");
        stringList.add("Python Guides");
        stringList.add("C Guides");

        Stream<String> stream = stringList.stream();

        boolean anyMatch = stream.anyMatch((value) -> { return value.startsWith("Java"); });
        System.out.println(anyMatch);
    }

    public void streamAllMatch() {
        Stream<String> stream = Stream.of("one", "two", "three", "four");
        Predicate<String> containsDigit = s -> s.contains("\\d+") == false;
        boolean match = stream.allMatch(containsDigit);

        System.out.println(match);
    }

    public void streamNoneMatch() {
        Stream<String> stream = Stream.of("one", "two", "three", "four");
        boolean answer = stream.noneMatch(str -> (str.length() == 10));
        System.out.println(answer);
    }

    public void collectToMap01() {
        Stream<String> s = Stream.of("apple", "banana", "orange");
        Map<Character, String> m = s.collect(Collectors.toMap(s1 -> s1.charAt(0), s1 -> s1));
        System.out.println(m);
    }

    // IllegalStateException - duplicate keys
    public void collectToMap02() {
        Stream<String> s = Stream.of("apple", "banana", "apricot", "orange");
        Map<Character, String> m = s.collect(Collectors.toMap(s1 -> s1.charAt(0), s1 -> s1));
        System.out.println(m);
    }

    public void collectToMap03() {
        Stream<String> s = Stream.of("apple", "banana", "apricot", "orange", "apple");
        Map<Character, String> m = s.collect(Collectors.toMap(s1 -> s1.charAt(0),
                                             s1 -> s1,
                                             (s1, s2) -> s1 + "|" + s2));
        System.out.println(m);
    }

    public void collectToMap04() {
        Stream<String> s = Stream.of("apple", "banana", "apricot", "orange", "apple");
        LinkedHashMap<Character, String> m = s.collect(
                Collectors.toMap(s1 -> s1.charAt(0),
                                 s1 -> s1,
                                 (s1, s2) -> s1 + "|" + s2,
                                  LinkedHashMap::new));
        System.out.println(m);
    }
}
