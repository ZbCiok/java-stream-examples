package zjc.lambda.examples;

import java.util.*;
import java.util.function.*;

public class DoubleColonOperatorConstructorExamples {
    static class PrintString {

        // super function to be called
        String print(String str) {
            return ("Hello " + str + "\n");
        }
    }

    public static class DoubleColonClass extends PrintString {

        // instance method to override super method
        @Override
        String print(String s) {

            // call the super method
            // using double colon operator
            Function<String, String> func = super::print;

            String newValue = func.apply(s);
            newValue += "Bye " + s + "\n";
            System.out.println(newValue);

            return newValue;
        }

        public void instanceMethod() {

            List<String> list = new ArrayList<String>();

            list.add("zjc");
            list.add("Generalized");
            list.add("java");
            list.add("stream");
            list.add("examples");

            // call the instance method
            // using double colon operator
            list.forEach(new DoubleColonClass()::print);

            System.out.println("------");

            // or
            list.forEach((n) -> new DoubleColonClass().print(n));
        }
    }
}
