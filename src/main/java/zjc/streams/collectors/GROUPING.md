https://docs.oracle.com/javase/8/docs/api/java/util/stream/Collectors.html

## Parameters

classifier - this function returned value is used as map key. Inputs to this function are stream elements.

downstream - this collector transforms the map values to type D.

mapFactory - this function creates the desired Map implementation. 

T - the type of the input elements

K - the type of the keys

A - the intermediate accumulation type of the downstream collector

D - the result type of the downstream reduction

M - the type of the resulting Map

## Syntax

<T,K> Collector<T,?,Map<K,List<T>>> groupingBy(

                 Function<? super T,? extends K> classifier)


<T,K,A,D> Collector<T,?,Map<K,D>> groupingBy(

                                Function<? super T,? extends K> classifier,

                                Collector<? super T,A,D> downstream)


<T,K,D,A,M extends Map<K,D>> Collector<T,?,M> groupingBy(

                                Function<? super T,? extends K> classifier,

                                Supplier<M> mapFactory,

                                Collector<? super T,A,D> downstream)


<T,K> Collector<T,?,ConcurrentMap<K,List<T>>> groupingByConcurrent(

                                          Function<? super T,? extends K> classifier)


<T,K,A,D> Collector<T,?,ConcurrentMap<K,D>> groupingByConcurrent(

                                          Function<? super T,? extends K> classifier,

                                          Collector<? super T,A,D> downstream)


<T,K,A,D,M extends ConcurrentMap<K,D>> Collector<T,?,M> groupingByConcurrent(

                                          Function<? super T,? extends K> classifier,

                                          Supplier<M> mapFactory,

                                          Collector<? super T,A,D> downstream)


