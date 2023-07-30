package zjc.misc;

/*
* Predicate is understood as a boolean-valued function 'P:X ? {true, false}',
* called the predicate on X.
* https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/function/Predicate.html
*
* Stream filter(Predicate predicate)
* - returns a stream consisting of the elements of this stream that match the given predicate.
* This is an intermediate operation.
 */

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaPredicate {
    public void divisibleBy3() {
        // Creating a list of Integers
        List<Integer> list = Arrays.asList(3, 4, 6, 12, 20, 22, 21);

        // Getting a stream consisting of the elements that are divisible by 3
        // Using Stream filter(Predicate predicate)
        list.stream()
                .filter(num -> num % 3 == 0)
                .forEach(System.out::println);
    }

    public void filterFirstUpperCase() {
        // Creating a stream of strings
        Stream<String> stream = Stream.of("Upper", "fOr", "uPper", "UPPERCase");

        // Getting a stream consisting of the elements having UpperCase Character
        // at custom index say be it '1' using Stream filter(Predicate predicate)
        stream.filter(str -> Character.isUpperCase(str.charAt(1)))
                .forEach(System.out::println);
    }

    public void greaterThan6() {
        Predicate<Integer> greaterThan6 = x -> x > 6;

        // Creating a list of Integers
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> collect = list.stream()
                .filter(greaterThan6)
                .collect(Collectors.toList());

        System.out.println(collect);
    }

    // test
    public void isEqualTestPredicate() {

        System.out.println(Predicate.isEqual(11).test(12)); // false
        System.out.println(Predicate.isEqual(11).test(11)); // true
    }

    // isEqual
    public void isEqualPredicate() {

        List<String> names = Arrays.asList(
                "John",
                "Peter",
                "Alex",
                "Richard",
                "Mike"
        );

        String MATCH = "Alex";

        // find a name that is equals "Alex"
        names.stream()
                .filter(Predicate.isEqual(MATCH))
                .forEach(System.out::println);
    }

    public void andPredicate() {
        Predicate<Integer> greaterThan5 = x -> x > 5;
        Predicate<Integer> lessThan8 = x -> x < 8;

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> collect = list.stream()
                .filter(greaterThan5.and(lessThan8))
                .collect(Collectors.toList());

        System.out.println(collect);
    }

    public void negatePredicate() {
        Predicate<String> startWithA = x -> x.startsWith("A");

        List<String> list = Arrays.asList("A", "AA", "AAA", "B", "BB", "BBB");

        List<String> collect = list.stream()
                .filter(startWithA.negate())
                .collect(Collectors.toList());

        System.out.println(collect);
    }

    public void orPredicate() {
        Predicate<String> lengthIs3 = x -> x.length() == 3;
        Predicate<String> startWithA = x -> x.startsWith("A");

        List<String> list = Arrays.asList("A", "AA", "AAA", "B", "BB", "BBB");

        List<String> collect = list.stream()
                .filter(lengthIs3.or(startWithA))
                .collect(Collectors.toList());

        System.out.println(collect);
    }
}


