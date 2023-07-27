package zjc.lambda.examples;

import org.junit.jupiter.api.Test;

interface Printable {
    void print(String msg);
}


interface Drawable {
    void draw();
}

interface Sayable {
    String say();
}

interface Addable {
    int add(int a, int b);
}

interface IAvarage {
    double avg(int[] array);
}

public class LambdaExamples {
    public void ExampleSingleParameter() {
        // without lambda expression
        Printable printable = new Printable() {
            @Override
            public void print(String msg) {
                System.out.println(msg);
            }
        };
        printable.print(" Print message to console; without lambda....");

        // with lambda expression
        Printable withLambda = (msg) -> System.out.println(msg);
        withLambda.print(" Print message to console; with lambda (1)....");

        //Above lambda can be replaced with method reference
        withLambda = System.out::println;
        withLambda.print(" Print message to console; with lambda (2)....");
    }

    public void LambdaExpressionExample() {
        int width = 10;
        //with lambda
        Drawable withLambda = () -> {
            System.out.println("Drawing " + width);
        };
        withLambda.draw();
    }

    public void JLEExampleNoParameter() {
        // without lambda expression
        Sayable sayable = new Sayable() {
            @Override
            public String say() {
                return "Return something; without lambda..";
            }
        };
        System.out.println(sayable.say());

        // with lambda expression
        Sayable withLambda = () -> {
            return "Return something; with lambda ..";
        };
        System.out.println(withLambda.say());
    }


    public void JLEExampleMultipleParameters() {
        // without lambda expression
        Addable addable = new Addable() {
            @Override
            public int add(int a, int b) {
                return a + b;
            }
        };
        System.out.println("without lambda expression: " + addable.add(10, 20));

        // with lambda expression
        // Multiple parameters in lambda expression
        Addable withLambda = (a, b) -> (a + b);
        System.out.println("with lambda expression (1): " + withLambda.add(10, 20));

        // Multiple parameters with data type in lambda expression
        Addable withLambdaD = (int a, int b) -> (a + b);
        System.out.println("with lambda expression (2): " + withLambdaD.add(100, 200));
    }

    @Test
    public void JLEExampleMultipleStatements() {
        // without lambda expression, IAvarage implementation using anonymous class
        IAvarage avarage = new IAvarage() {
            @Override
            public double avg(int[] array) {
                double sum = 0;
                int arraySize = array.length;

                System.out.println("arraySize : " + arraySize);
                for (int i = 0; i < array.length; i++) {
                    sum = sum + array[i];
                }
                System.out.println("sum : " + sum);

                return (sum / arraySize);
            }
        };
        int[] array = {1, 4, 6, 8, 9};
        System.out.println("without lambda expression " + avarage.avg(array));

        // with a lambda expression
        // You can pass multiple statements in lambda expression
        IAvarage withLambda = (withLambdaArray) -> {
            double sum = 0;
            int arraySize = withLambdaArray.length;

            System.out.println("arraySize : " + arraySize);
            for (int i = 0; i < withLambdaArray.length; i++) {
                sum = sum + withLambdaArray[i];
            }
            System.out.println("sum : " + sum);

            return (sum / arraySize);
        };

        int[] withLambdaArray = {1, 4, 6, 8, 9};
        System.out.println("with lambda expression " + withLambda.avg(withLambdaArray));
    }

    //java.lang.Runnable
    public void JLEExampleRunnable() {
        //without lambda, Runnable implementation using anonymous class
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println(" Runnable example without lambda exp.");
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();

        //with lambda
        Runnable withLambda = () -> System.out.println(" Runnable example with lambda exp.");
        Thread thread1 = new Thread(withLambda);
        thread1.start();
    }
}

