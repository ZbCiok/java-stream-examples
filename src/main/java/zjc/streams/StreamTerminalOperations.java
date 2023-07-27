package zjc.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/*
* The terminal operations of the Java Stream interface typically return a single value.
*    anyMatch()   - Syntax: boolean anyMatch(Predicate<? super T> predicate)
*                   Stream anyMatch(Predicate predicate)
*                   returns whether any elements of this stream match the provided predicate.
*    allMatch()   -
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
}
