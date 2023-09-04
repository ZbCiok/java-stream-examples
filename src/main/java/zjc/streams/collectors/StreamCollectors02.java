package zjc.streams.collectors;

/*
* https://www.educative.io/answers/what-is-collectorstocollection-in-java
* x toCollection(Supplier<C> collectionFactory)
*
* x https://www.logicbig.com/how-to/code-snippets/jcode-java-8-streams-collectors-toconcurrentmap.html
* x toConcurrentMap(Function<? super T,? extends K> keyMapper, Function<? super T,? extends U> valueMapper)
* x toConcurrentMap(Function<? super T,? extends K> keyMapper, Function<? super T,? extends U> valueMapper, BinaryOperator<U> mergeFunction)
* x toConcurrentMap(Function<? super T,? extends K> keyMapper, Function<? super T,? extends U> valueMapper, BinaryOperator<U> mergeFunction, Supplier<M> mapSupplier)
*
* Collectors.toList() - it is a terminal operation that collects the stream items into a mutable List.
* x toList()
*
*
* toMap(Function<? super T,? extends K> keyMapper, Function<? super T,? extends U> valueMapper)
* toMap(Function<? super T,? extends K> keyMapper, Function<? super T,? extends U> valueMapper, BinaryOperator<U> mergeFunction)
* toMap(Function<? super T,? extends K> keyMapper, Function<? super T,? extends U> valueMapper, BinaryOperator<U> mergeFunction, Supplier<M> mapSupplier)
*
* tx oSet()
*
*/

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Stream;

public class StreamCollectors02 {

    public void toCollection01() {
        List<String> stringList = Arrays.asList("zjc", "stream", "collectors");
        System.out.println("Stream before modification - " + stringList);
        Stream<String> stringStream = stringList.stream();
        List<String> uppercaseStream = stringStream.map(String::toUpperCase).collect(Collectors.toCollection(ArrayList::new));
        System.out.println("Stream after modification - " + uppercaseStream);
    }

    public void toCollection02() {
        Stream<String> stream = Stream.of("15", "5", "41", "110", "13", "40", "20");
        Collection<String> collection = stream.collect(Collectors.toCollection(TreeSet::new));
        System.out.println("Collection = "+collection);
    }

    public void toConcurrentMap01() {
        Stream<String> s = Stream.of("zjc", "stream", "concurrent_map");
        ConcurrentMap<Character, String> m = s.collect(Collectors.toConcurrentMap(s1 -> s1.charAt(0), String::toUpperCase));
        System.out.println(m);
    }

    public void toConcurrentMap02() {
        Stream<String> s = Stream.of("zjc", "stream", "concurrent_map");
        Map<Character, String> m = s.collect(Collectors.toConcurrentMap(s1 -> s1.charAt(0),
                                              String::toUpperCase,
                                              (s1, s2) -> s1 + "|" + s2));
        System.out.println(m);
    }

    public void toConcurrentMap03() {
        Stream<String> s = Stream.of("zjc", "stream", "concurrent_map");
        ConcurrentHashMap<Character, String> m = s.collect(Collectors.toConcurrentMap(s1 -> s1.charAt(0),
                                                           String::toUpperCase,
                                                           (s1, s2) -> s1 + "|" + s2,
                                                            ConcurrentHashMap::new));
        System.out.println(m);
    }

    public void toList() {
        Stream<String> language = Stream.of("zjc", "stream", "toList");
        List<String> result = language.collect(Collectors.toList());
        result.forEach(System.out::println);
    }

    public void toSet() {
        Stream<String> s = Stream.of("Collectors", "for", "zjc", "Stream");
        Set<String> mySet = s.collect(Collectors.toSet());
        System.out.println(mySet);
    }
}
