package zjc.streams.collectors;

/*
* https://www.educative.io/answers/what-is-collectorstocollection-in-java
* x toCollection(Supplier<C> collectionFactory)
*
* toConcurrentMap(Function<? super T,? extends K> keyMapper, Function<? super T,? extends U> valueMapper)
* toConcurrentMap(Function<? super T,? extends K> keyMapper, Function<? super T,? extends U> valueMapper, BinaryOperator<U> mergeFunction)
* toConcurrentMap(Function<? super T,? extends K> keyMapper, Function<? super T,? extends U> valueMapper, BinaryOperator<U> mergeFunction, Supplier<M> mapSupplier)
*
* toList()
*
* toMap(Function<? super T,? extends K> keyMapper, Function<? super T,? extends U> valueMapper)
* toMap(Function<? super T,? extends K> keyMapper, Function<? super T,? extends U> valueMapper, BinaryOperator<U> mergeFunction)
* toMap(Function<? super T,? extends K> keyMapper, Function<? super T,? extends U> valueMapper, BinaryOperator<U> mergeFunction, Supplier<M> mapSupplier)
*
* toSet()
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollectors02 {

    public void toCollection01() {
        List<String> stringList = Arrays.asList("zjc", "stream", "collectors");
        System.out.println("Stream before modification - " + stringList);
        Stream<String> stringStream = stringList.stream();
        List<String> uppercaseStream = stringStream.map(String::toUpperCase).collect(Collectors.toCollection(ArrayList::new));
        System.out.println("Stream after modification - " + uppercaseStream);
    }
}
