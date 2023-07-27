# java-streams-examples

## Dictionary
- reduction 
  - Stream reduction is an operation that returns one value by combining the elements of a stream. The Java stream API contains a set of predefined reduction operations, such as average() , sum() , min() , max() , and count() .
- mutable reduction operation
  - A mutable reduction operation that accumulates input elements into a mutable result container, optionally transforming the accumulated result into a final representation after all input elements have been processed. Reduction operations can be performed either sequentially or in parallel.
  - Examples of mutable reduction operations include: accumulating elements into a Collection; concatenating strings using a StringBuilder; computing summary information about elements such as sum, min, max, or average; computing "pivot table" summaries such as "maximum valued transaction by seller", etc. The class Collectors provides implementations of many common mutable reductions.
- collect() Terminal Operation
  - We can collect the stream elements as List, Map, and Set with the collect() method.
- Terminal Operations https://github.com/swtestacademy/java-functional/tree/main/src/test/java/functional/stream/terminaloperations
  - anyMatch()
  - collect()
  - count()
  - findAny()
  - findFirst()
  - min()
  - max()
  - noneMatch()
  - allMatch()
  

## Based on:
### Java Predicate:
- https://howtodoinjava.com/java8/how-to-use-predicate-in-java-8/

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

  
