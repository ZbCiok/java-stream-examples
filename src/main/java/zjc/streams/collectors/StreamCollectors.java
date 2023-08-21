package zjc.streams.collectors;

/*
 * Collectors is a final class that extends the Object class.
 * It provides reduction operations, such as accumulating elements into collections,
 * summarizing elements according to various criteria, etc. Java Collectors class provides
 * various methods to deal with elements.
 * https://docs.oracle.com/javase/8/docs/api/java/util/stream/Collectors.html
 * https://medium.com/swlh/java-collectors-and-its-20-methods-2fc422920f18
 *
 * x averagingDouble(ToDoubleFunction<? super T> mapper)
 * x averagingInt(ToIntFunction<? super T> mapper)
 * x averagingLong(ToLongFunction<? super T> mapper)
 * x collectingAndThen(Collector<T,A,R> downstream, Function<R,RR> finisher)
 * x counting()
 * x groupingBy(Function<? super T,? extends K> classifier)
 * x groupingBy(Function<? super T,? extends K> classifier, Collector<? super T,A,D> downstream)
 * x groupingBy(Function<? super T,? extends K> classifier, Supplier<M> mapFactory, Collector<? super T,A,D> downstream)
 * groupingByConcurrent(Function<? super T,? extends K> classifier)
 * groupingByConcurrent(Function<? super T,? extends K> classifier, Collector<? super T,A,D> downstream)
 * groupingByConcurrent(Function<? super T,? extends K> classifier, Supplier<M> mapFactory, Collector<? super T,A,D> downstream)
 *
 * - https://www.educative.io/answers/what-is-the-collectorsjoining-method-in-java
 * x joining() is a static method of Collectors that returns a Collector that concatenates the input elements with the specified delimiter. There are three variations of the joining() method:
 * x joining(CharSequence delimiter)
 * x joining(CharSequence delimiter, CharSequence prefix, CharSequence suffix)
 *
 * x public static <T, U, A, R> Collector<T, ?, R> mapping(Function<? super T, ? extends U> mapper, Collector<? super U, A, R> downstream)
 *  is a static method of the Collectors class that returns a Collector. It converts a Collector accepting elements of one type to a Collector that accepts elements of another type.
 *  https://www.educative.io/answers/what-is-collectorsmapping-in-java
 * x maxBy(Comparator<? super T> comparator) is a static method of the Collectors class that is used to find the maximum element of the input elements using the passed comparator.
 *  https://www.educative.io/answers/what-is-collectorsmaxby-in-java
 * x minBy(Comparator<? super T> comparator)
 * partitioningBy(Predicate<? super T> predicate)
 * partitioningBy(Predicate<? super T> predicate, Collector<? super T,A,D> downstream)
 * reducing(BinaryOperator<T> op)
 * reducing(T identity, BinaryOperator<T> op)
 * reducing(U identity, Function<? super T,? extends U> mapper, BinaryOperator<U> op)
 * summarizingDouble(ToDoubleFunction<? super T> mapper)
 * summarizingInt(ToIntFunction<? super T> mapper)
 * summarizingLong(ToLongFunction<? super T> mapper)
 * summingDouble(ToDoubleFunction<? super T> mapper)
 * summingInt(ToIntFunction<? super T> mapper)
 * summingLong(ToLongFunction<? super T> mapper)
 * toCollection(Supplier<C> collectionFactory)
 * toConcurrentMap(Function<? super T,? extends K> keyMapper, Function<? super T,? extends U> valueMapper)
 * toConcurrentMap(Function<? super T,? extends K> keyMapper, Function<? super T,? extends U> valueMapper, BinaryOperator<U> mergeFunction)
 * toConcurrentMap(Function<? super T,? extends K> keyMapper, Function<? super T,? extends U> valueMapper, BinaryOperator<U> mergeFunction, Supplier<M> mapSupplier)
 * toList()
 * toMap(Function<? super T,? extends K> keyMapper, Function<? super T,? extends U> valueMapper)
 * toMap(Function<? super T,? extends K> keyMapper, Function<? super T,? extends U> valueMapper, BinaryOperator<U> mergeFunction)
 * toMap(Function<? super T,? extends K> keyMapper, Function<? super T,? extends U> valueMapper, BinaryOperator<U> mergeFunction, Supplier<M> mapSupplier)
 * toSet()
 */

import zjc.data.StaticPerson;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollectors {
    public void averagingDouble() {
        // creating a string stream
        Stream<String> str = Stream.of("2.1", "3.0", "4.579", "5");

        // using Collectors averagingDouble(ToDoubleFunction mapper)
        // method to find arithmetic mean of inputs given
        double d = str
                .collect(Collectors
                        .averagingDouble(
                                num -> Double.parseDouble(num)));

        // displaying the result
        System.out.println(d);
    }

    public void averagingInt() {
        Stream<String> s = Stream.of("1","2","3");
        double o =  s.collect(Collectors.averagingInt(n->Integer.parseInt(n)));
        System.out.println(o);
    }

    public void averagingLong() {
        // creating a string stream
        Stream<String> str = Stream.of("3", "4", "5");

        // using Collectors averagingLong(ToLongFunction mapper)
        // method to find arithmetic mean of inputs given
        double ans = str
                .collect(Collectors
                        .averagingLong(
                                num -> Long.parseLong(num)));

        // displaying the result
        System.out.println(ans);
    }

    // Herd create an Immutable List.
    // Immutable Set, Immutable Map: https://www.geeksforgeeks.org/collectors-collectingandthen-method-in-java-with-examples/
    public void collectingAndThen() {
        // Create an Immutable List
        List<String> lt
                = Stream
                .of("GEEKS", "For", "GEEKS")
                .collect(Collectors
                        .collectingAndThen(
                                Collectors.toList(),
                                Collections::<String> unmodifiableList));
        System.out.println(lt);
    }

    public void counting() {
        // creating a stream of strings
        Stream<String> str = Stream.of("1", "a", "3", "4", "5", "x");

        // using Collectors counting() method to
        // count the number of input elements
        long n = str.collect(Collectors.counting());

        // or
        // long n = str.count();


        // displaying the required count
        System.out.println(n);
    }

    // groupingBy(Function<? super T,? extends K> classifier)
    // Returns a Collector implementing a "group by" operation on input elements of type T,
    // grouping elements according to a classification function,
    // and returning the results in a Map.
    public void groupingBy() {
        // Get the List
        List<String> str
                = Arrays.asList("Mango", "apple", "Mango");

        // Collect the list as map
        // by groupingBy() method
        Map<String, Long> result
                = str.stream().collect(
                Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // Print the result
        System.out.println(result);
    }

    public void collectToList() {
        List<Integer> list = new ArrayList<Integer>();

        for(int i = 1; i< 20; i++){
            list.add(i);
        }

        Stream<Integer> stream = list.stream();
        List<Integer> evenNumbersList = stream.filter(i -> i%2 == 0)
                .collect(Collectors.toList());
        System.out.print(evenNumbersList);
    }

    public void mapping() {
        List<StaticPerson.Person> personList = Arrays.asList(new StaticPerson.Person("bob", 34),
                                                             new StaticPerson.Person("bob", 43),
                                                             new StaticPerson.Person("mary", 84),
                                                             new StaticPerson.Person("john", 12),
                                                             new StaticPerson.Person("bob", 22));
        System.out.println("Person list - " + personList);
        Stream<StaticPerson.Person> personStream = personList.stream();
        Map<String, List<Integer>> result = personStream.collect(Collectors.groupingBy(p -> p.name,
                Collectors.mapping(e -> e.age, Collectors.toList())));
        System.out.println("Mapping result - " + result);
    }

    public void maxBy() {
        List<String> stringList = Arrays.asList("zjc", "streams", "collectors");
        System.out.println("Stream before modification - " + stringList);
        Stream<String> stringStream = stringList.stream();
        Optional<String> maxElement = stringStream.collect(Collectors.maxBy(Comparator.naturalOrder()));
        System.out.println("Maximum element of the stream - " + (maxElement.orElse("null")));
    }

    public void minBy() {
        List<String> stringList = Arrays.asList("zjc", "streams", "collectors");
        System.out.println("Stream before modification - " + stringList);
        Stream<String> stringStream = stringList.stream();
        Optional<String> minElement = stringStream.collect(Collectors.minBy(Comparator.naturalOrder()));
        System.out.println("Minimum element of the stream - " + (minElement.orElse("null")));
    }
}
