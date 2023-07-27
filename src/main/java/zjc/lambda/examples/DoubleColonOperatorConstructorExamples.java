package zjc.lambda.examples;

import java.util.*;
import java.util.function.*;

public class DoubleColonOperatorConstructorExamples {
    class Test {

        // super function to be called
        String print(String str)
        {
            return ("Hello " + str + "\n");
        }
    }

    public class GFG extends Test {

        // instance method to override super method
        @Override
        String print(String s) {

            // call the super method
            // using double colon operator
            Function<String, String>
                    func = super::print;

            String newValue = func.apply(s);
            newValue += "Bye " + s + "\n";
            System.out.println(newValue);

            return newValue;
        }

        public void instanceMethod() {

            List<String> list = new ArrayList<String>();
            list.add("Geeks");
            list.add("For");
            list.add("GEEKS");

            // call the instance method
            // using double colon operator
            list.forEach(new GFG()::print);

            System.out.println("------");

            // or
            list.forEach((n) -> new GFG().print(n));
        }
    }
}
