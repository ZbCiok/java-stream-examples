package zjc.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import java.util.function.Predicate;

/*
* The terminal operations of the Java Stream interface typically return a single value.
*    anyMatch()   - Syntax: boolean anyMatch(Predicate<? super T> predicate)
*                   Stream anyMatch(Predicate predicate)
*                   returns whether any elements of this stream match the provided predicate.
*    allMatch()   - Syntax: boolean allMatch(Predicate<? super T> predicate)
*                   The allMatch() method returns always a true or false, based on the result of the evaluation.
*    noneMatch()  -
*    collect()    -
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
}
