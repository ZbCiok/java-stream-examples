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
public class  DoubleColonOperatorExamples {

    // Java code to print the elements of Stream
    public void doubleColon() {

        Stream<String> stream = Stream.of("zjc", "Generalized", "java", "stream", "examples");
        // Print the stream without ::
        stream.forEach(s -> System.out.println("Print the stream without '::' " + s));

        Stream<String> stream1 = Stream.of("zjc", "Generalized", "java", "stream", "examples");
        // Print the stream with ::
        stream1.forEach(System.out::println);
    }


    // Static function to be called
    static void someFunction1(String s) {

        System.out.println("Static Funcion " + s);
    }

    public void staticMethod() {

        List<String> list = new ArrayList<String>();
        list.add("zjc");
        list.add("Generalized");
        list.add("java");
        list.add("stream");
        list.add("examples");

        // call the static method using double colon operator
        list.forEach(DoubleColonOperatorExamples::someFunction1);
    }

    // Instance function to be called
    void someFunction2(String s) {

        System.out.println("Instance Method " + s);
    }
    public void instanceFunction() {
        List<String> list = new ArrayList<String>();
        list.add("zjc");
        list.add("Generalized");
        list.add("java");
        list.add("stream");
        list.add("examples");

        // call the instance method using double colon operator
        list.forEach((new DoubleColonOperatorExamples())::someFunction2);
    }
}

