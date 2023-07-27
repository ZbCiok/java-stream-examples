package zjc.lambda.examples;

import java.util.stream.*;
import java.util.*;


/*
 *
 * The double colon (::) operator, also known as method reference operator in Java,
 * is used to call a method by referring to it with the help of its class directly.
 * They behave exactly as the lambda expressions.
 *
 * Syntax:
 * <Class name>::<method name>
 *
 * Method reference or double colon operator can be used to refer:
 *    a static method,
 *    an instance method, or
 *    a constructor.
 *
 */
public class DoubleColonOperatorExamples {
    // ==================== Java code to print the elements of Stream
    public void GFG() {

        Stream<String> stream
                = Stream.of("Geeks", "For", "Geeks", "A", "Computer", "Portal");

        // Print the stream without ::
        stream.forEach(s -> System.out.println("Print the stream without '::' " + s));

        Stream<String> stream1
                = Stream.of("Geeks", "For", "Geeks", "A", "Computer", "Portal");

        // Print the stream with ::
        stream1.forEach(System.out::println);
    }


    // ======================= Static function
    // static function to be called
    static void someFunction1(String s) {
        System.out.println("Static Funcion " + s);
    }

    public void StaticMethod() {

        List<String> list = new ArrayList<String>();
        list.add("Geeks");
        list.add("For");
        list.add("GEEKS");

        // call the static method
        // using double colon operator
        list.forEach(DoubleColonOperatorExamples::someFunction1);
    }

    // ======================= Instance method
    // instance function to be called
    void someFunction2(String s) {
        System.out.println("Instance Method " + s);
    }
    public void InstanceFunction() {
        List<String> list = new ArrayList<String>();
        list.add("Geeks");
        list.add("For");
        list.add("GEEKS");

        // call the instance method
        // using double colon operator
        list.forEach((new DoubleColonOperatorExamples())::someFunction2);
    }
}

