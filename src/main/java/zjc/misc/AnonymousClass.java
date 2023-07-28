package zjc.misc;

public class AnonymousClass {
    class Greeter {

        public void wish() {
            System.out.println("Hello");
        }
    }

    // Anonymous class that extends a class
    public void anonymousClassThatExtendsClass() {
        // Annonymous Inner class
        Greeter greeter = new Greeter() {

            // This is equivalent code of extending Greeter class and then overriding wish() method
            public void wish() {
                System.out.println("Hi");
                frenchWish();// Only can access inside this anonymous class
            }

            String frenchwish = "tout le monde"; // Can declare local variables
            //static String spanishWish = "mundo"; //not allowed, Only static constants allowed
            static final String spanWish = "mundo"; // Can declare static constants

            //Can write its own methods inside anonymous inner class
            public void frenchWish() {

                System.out.println(frenchwish);
                System.out.println(spanWish);
            }
        };

        greeter.wish(); // Hi
        // Can't call anonymous inner class methods, because it's depending on parent reference
        // p.frenchWish();
        Greeter p1 = new Greeter();
        p1.wish();//Hello
    }

    // Anonymous class that implements an interface
    public void anonymousClassThatImplementsInterface() {
        // Implementing Runnable Interface and overriding run()
        Runnable r = new Runnable() {
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Test Thread");
                }
            }
        };
        Thread thread = new Thread(r);
        thread.start();
        for (int i = 0; i < 4; i++) {
            System.out.println("Main Thread");
        }
    }

    // Anonymous class as argument of method / constructor
    public void anonymousClassAsArgumentOfMethodOrConstructor() {
        // Anonymous inner class as constructor argument
        new Thread( new Runnable() {

            public void run(){

                for(int i=0; i<5; i++) {
                    System.out.println("Test Thread");
                }
            }
        }).start();

        for(int i=0; i<5; i++){
            System.out.println("Main Thread");
        }
    }
}
