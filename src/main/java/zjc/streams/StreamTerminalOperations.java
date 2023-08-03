package zjc.streams;

import zjc.data.Item;
import zjc.data.Person;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.function.Predicate;

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
*    distinct     - method to find all instances of a class with unique id.
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

    public void streamCount() {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 7, 9, 22, 19, 18, 47, 3, 12, 29, 17, 44, 78, 99));
        long count = numbers.stream().count();
        System.out.println(count);
    }

    // Get distinct people by id
    public void streamDistinct() {
        Person doeOne = new Person(1, "John", "Doe");
        Person doeTwo = new Person(1, "John", "Doe");
        Person doeThree = new Person(1, "John", "Doe");
        Person brianOne = new Person(2, "Brian", "Clooney");
        Person brianTwo = new Person(2, "Brian", "Clooney");
        Person alex = new Person(3, "Alex", "Kolen");

        Collection<Person> list = Arrays.asList(
                alex,
                brianOne,
                brianTwo,
                doeOne,
                doeTwo,
                doeThree);

        List<Person> distinctElements = list.stream()
                .distinct()
                .collect( Collectors.toList() );

        System.out.println( distinctElements );
    }


    // Find duplicates by grouping
    private <T> Set<T> groupingFindDuplicatesS(Stream<T> stream) {
        // Group the elements along with their frequency in a map
        return stream.collect(Collectors.groupingBy(
                 Function.identity(), Collectors.counting()))
                // Convert this map into a stream
                .entrySet()
                .stream()
                // Check if frequency > 1 for duplicate elements
                .filter(m -> m.getValue() > 1)
                // Find such elements
                .map(Map.Entry::getKey)
                // And Collect them in a Set
                .collect(Collectors.toSet());
    }

    public void streamDuplicates() {
        // Initial stream
        Stream<Integer> stream = Stream.of(5, 13, 4, 21, 13, 27, 2, 59, 59, 34);
        // Print the found duplicate elements
        System.out.println(groupingFindDuplicatesS(stream));
    }
}
