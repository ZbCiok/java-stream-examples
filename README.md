# java-stream-examples

## Dictionary
- anonymous class
  - Sometimes we can declare inner class without name such type of inner class are called anonymous class. Java anonymous class is a inner class with no name. https://javabydeveloper.com/java-anonymous-class-with-examples/
    We may use java anonymous classe 3 ways:
    - Anonymous inner class that extends a class.
    - Anonymous inner class that implements an interface.
    - Anonymous inner class that defined as arguments of method / constructor.
- Stream filter(Predicate predicate) - returns a stream consisting of the elements of this stream that match the given predicate. This is an intermediate operation. https://www.geeksforgeeks.org/stream-filter-java-examples/
- flatMap
  - Stream flatMap(Function mapper) is an intermediate operation.
  - https://www.baeldung.com/java-difference-map-and-flatmap
  - https://mkyong.com/java8/java-8-flatmap-example/
- Stream map(Function mapper) is an intermediate operation.
  - https://www.geeksforgeeks.org/stream-map-java-examples/
- optional is a container type for a value which may be absent. It allows developers to represent the empty state. 
  - https://docs.oracle.com/javase/8/docs/api/java/util/Optional.html, 
  - https://www.callicoder.com/java-8-optional-tutorial/, 
  - https://www.baeldung.com/java-filter-stream-of-optional
  - https://www.digitalocean.com/community/tutorials/java-8-stream#java.util.optional
- reduction 
  - Stream reduction is an operation that returns one value by combining the elements of a stream. The Java stream API contains a set of predefined reduction operations, such as average() , sum() , min() , max() , and count() .
- stream
  - https://www.oracle.com/java/technologies/ma14-java-se-8-streams.html
  - https://www.oracle.com/java/technologies/architect-streams-pt2.html
  - https://stackify.com/streams-guide-java-8/
- mutable reduction operation
  - A mutable reduction operation that accumulates input elements into a mutable result container, optionally transforming the accumulated result into a final representation after all input elements have been processed. Reduction operations can be performed either sequentially or in parallel.
  - Examples of mutable reduction operations include: accumulating elements into a Collection; concatenating strings using a StringBuilder; computing summary information about elements such as sum, min, max, or average; computing "pivot table" summaries such as "maximum valued transaction by seller", etc. The class Collectors provides implementations of many common mutable reductions.
- collect() Terminal Operation
  - We can collect the stream elements as List, Map, and Set with the collect() method.
- terminal operations https://github.com/swtestacademy/java-functional/tree/main/src/test/java/functional/stream/terminaloperations
  - anyMatch()
  - collect()
  - count()
  - findAny()
  - findFirst()
  - min()
  - max()
  - noneMatch()
  - allMatch()
- functional interface
  - A functional interface is an interface that contains only one abstract method. They can have only one functionality to exhibit. From Java 8 onwards, lambda expressions can be used to represent the instance of a functional interface. A functional interface can have any number of default methods. Runnable, ActionListener, and Comparable are some of the examples of functional interfaces. https://www.geeksforgeeks.org/functional-interfaces-java/
    - Consumer
    - Predicate
    - Function
    - Supplier
- PREDICATE - Predicate is a functional interface, which accepts an argument and returns a boolean. Usually, it used to apply in a filter for a collection of objects.
    https://docs.oracle.com/javase/8/docs/api/java/util/function/Predicate.html, https://www.geeksforgeeks.org/java-8-predicate-with-examples/ , https://howtodoinjava.com/java8/how-to-use-predicate-in-java-8/ , https://mkyong.com/java8/java-8-predicate-examples/
  - The Functional Interface PREDICATE is defined in the java.util.function package. It improves manageability of code, helps in unit-testing them separately, and contain some methods like:
    - isEqual(Object targetRef)
    - and(Predicate other)
    - negate()
    - or(Predicate other)
    - test(T t)

## Based on:

### Lambda:
- https://www.javaguides.net/2020/03/java-lambda-expressions-examples.html
- https://www.geeksforgeeks.org/double-colon-operator-in-java/

### Streams:
- https://howtodoinjava.com/java/stream/java-streams-by-examples/
- Collectors:
  - https://betterprogramming.pub/java-stream-collectors-explained-6209a67a4c29
  - Grouping by examples: 
    - https://salithachathuranga94.medium.com/java-8-streams-groupby-b15054d9e6c8 
    - https://www.davidvlijmincx.com/posts/java_stream_group_by/ 
    - * https://howtodoinjava.com/java/stream/collectors-groupingby/
    - *** https://www.logicbig.com/how-to/code-snippets/jcode-java-8-streams-collectors-groupingby.html
    - *** https://javadeveloperzone.com/java-basic/java-8-stream-group-count/
    - https://theboreddev.com/group-elements-in-java/
    - https://4comprehension.com/the-ultimate-guide-to-the-java-stream-api-groupingby-collector/
  - https://docs.oracle.com/javase/8/docs/api/java/util/stream/Collectors.html
  - https://medium.com/swlh/java-collectors-and-its-20-methods-2fc422920f18
  - https://belief-driven-design.com/java-stream-collectors-explained-42f69943c64/
  - https://linuxhint.com/java-stream-collector/
- Intermediate Operations:
  - https://www.javacodegeeks.com/2020/04/java-8-stream-intermediate-operations-methods-examples.html
  - Java Stream peek(): https://www.concretepage.com/java/java-8/java-stream-peek
  - https://www.javaguides.net/2021/11/java-stream-intermediate-operations.html
- Terminal Operations:
  - https://www.javaguides.net/2021/11/java-stream-terminal-operations-examples.html
  - https://www.swtestacademy.com/java-streams-terminal-operations/
  - https://www.codejava.net/java-core/collections/java-8-stream-terminal-operations-examples

  
