package zjc.misc;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

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
}
