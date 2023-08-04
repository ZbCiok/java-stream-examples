package zjc.misc;

/*
* https://www.appsdeveloperblog.com/bifunction-functional-interface-in-java/
*
* BiFunction<T, U, R>
* @FunctionalInterface
* public interface BiFunction<T, U, R> {
   /**
     * Applies this function to the given arguments.
     *
     * @param t the first function argument
     * @param u the second function argument
     * @return the function result
    */
/*
*    R apply(T t, U u);
*
* /**
 * Returns a composed function that first applies this function to
 * its input, and then applies the {@code after} function to the result.
 * If evaluation of either function throws an exception, it is relayed to
 * the caller of the composed function.
 *
 * @param <V> the type of output of the {@code after} function, and of the
 *           composed function
 * @param after the function to apply after this function is applied
 * @return a composed function that first applies this function and then
 * applies the {@code after} function
 * @throws NullPointerException if after is null
 */
/*default <V> BiFunction<T, U, V> andThen(Function<? super R, ? extends V> after) {
        Objects.requireNonNull(after);
        return (T t, U u) -> after.apply(apply(t, u));
        }
        }
*
*
*/

/*
* https://www.appsdeveloperblog.com/binaryoperator-functional-interface-in-java/
*
* BinaryOperator<T>
*
*@FunctionalInterface
*public interface BinaryOperator<T> extends BiFunction<T,T,T> {
 * /
    /**
     * Returns a {@link BinaryOperator} which returns the lesser of two elements
     * according to the specified {@code Comparator}.
     *
     * @param <T> the type of the input arguments of the comparator
     * @param comparator a {@code Comparator} for comparing the two values
     * @return a {@code BinaryOperator} which returns the lesser of its operands,
     *         according to the supplied {@code Comparator}
     * @throws NullPointerException if the argument is null
     */

    /*
     * Returns a {@link BinaryOperator} which returns the greater of two elements
     * according to the specified {@code Comparator}.
     *
     * @param <T> the type of the input arguments of the comparator
     * @param comparator a {@code Comparator} for comparing the two values
     * @return a {@code BinaryOperator} which returns the greater of its operands,
     *         according to the supplied {@code Comparator}
     * @throws NullPointerException if the argument is null
     */
/*    public static <T> BinaryOperator<T> maxBy(Comparator<? super T> comparator) {
*        Objects.requireNonNull(comparator);
*        return (a, b) -> comparator.compare(a, b) >= 0 ? a : b;
*    }
}
*
*/

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class FunctionalInterface {

    // Supplier
    public void supplierInterface() {
        // This function returns a random value.
        Supplier<Double> randomValue = () -> Math.random();

        // Print the random value using get()
        System.out.println(randomValue.get());
    }

    // Consumer
    public void consumerInterface() {
        // Consumer to display a number
        Consumer<Integer> display = a -> System.out.println(a);

        // Implement display using accept()
        display.accept(10);

        // Consumer to multiply 2 to every integer of a list
        Consumer<List<Integer> > modify = list ->
        {
            for (int i = 0; i < list.size(); i++)
                list.set(i, 2 * list.get(i));
        };

        // Consumer to display a list of numbers
        Consumer<List<Integer> >
                dispList = list -> list.stream()
                .forEach(a -> System.out.print(a + " "));

        List<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(1);
        list.add(3);

        // Implement modify using accept()
        modify.accept(list);

        // Implement dispList using accept()
        dispList.accept(list);
    }

    public void functionInterface() {
        Function<String, Integer> stringToInt = s -> Integer.parseInt(s);
        System.out.println(stringToInt.apply("100")); //100
    }

    public void predicateInterface() {
        Predicate<String> stringLength = s -> s.length() > 5;
        System.out.println(stringLength.test("Hello World")); //true
        System.out.println(stringLength.test("Java")); //false
    }

    public void biFunction01() {
        BiFunction<String, String, Integer> sumLengthsOfBothStrings = (str1, str2) -> str1.length() + str2.length();
        System.out.println("The sum of the lengths is: " + sumLengthsOfBothStrings.apply("zjc", "coding"));
    }

    public void biOperator01() {
        BinaryOperator<Integer> multiply = (num1, num2) -> num1 * num2;
        System.out.println("The result is: " + multiply.apply(5, 10));
    }
}
