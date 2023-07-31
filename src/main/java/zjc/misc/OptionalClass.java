package zjc.misc;

import java.util.Optional;

/*
*
* https://docs.oracle.com/javase/8/docs/api/java/util/Optional.html
*
* Syntax:
* -------
* public final class Optional<T> extends Object {
*     // code of the optional class
* }
*
* Member functions:
* -----------------
*  1. empty(): This function gives an empty Optional instance(Without any value in it).
*   public static <T> Optional<T> empty()
*
*  2. of(T value): This function gives an Optional instance(with the given non-null value).
*   public static <T> Optional<T> of( T value )
*
*  3. ofNullable(T value): This function gives an Optional instance(with the given value, if non-null, else an empty Optional.
*   public static <T> Optional<T> ofNullable(T value)
*
*  4. get(): This function gives the optional value if the value is present, else NoSuchElementException throws.
*   public T get()
*
*  5. isPresent(): This function gives true if the value is present in an Optional instance, otherwise false.
*   public boolean isPresent()
*
*  6. ifPresent(Consumer<? super T> consumer): This function invokes the given consumer with the specified value if a value is present, otherwise nothing performs.
*   public void ifPresent(Consumer<? super T> consumer)
*
*  7. filter(Predicate<? super T> predicate): This function returns an Optional instance with a given value if a value is present and that matches the specified predicate, otherwise empty Optional returns.
*   public Optional<T> filter(Predicate<? super T> predicate).
*
*  8. map(Function<? super T,? extends U> mapper): This function returns an Optional with the specified value if the value is there, and after applying the specified mapping function the give is non-null. Otherwise empty Optional returns.
*   public <U> Optional<U> map(Function<? super T,? extends U> mapper)
*
*  9. flatMap(Function<? super T,Optional<U> mapper): This function returns an Optional with a specified value if a value is present and after applying the specified optional mapping function the result is non-null. Otherwise empty Optional returns.
*   public <U> Optional<U> flatMap(Function<? super T,Optional<U> mapper)
*
* 10. orElse( T other ): This function gives the value, if it is present, otherwise give others.
*   public T orElse(T other)
*
* 11. orElseGet(Supplier<? extends T> other): This function gives the value if it is there, else others will invoke and return its result.
*   public T orElseGet(Supplier<? extends T> other)
*
* 12. orElseThrow(Supplier <? extends C> excepSupplier ) throws C extends Throwable: This function gives the present value, if it is there, else throws the provided supplier created an exception.
*   public <C extends Throwable> T orElseThrow(Supplier<? extends C> exceptionSupplier) t
*
* 13. equals( Object ob ): This function returns true if given ob object is equal to this Optional object. Otherwise, return false. The ob object can be equal if it is Optional or both objects have no value present or both objects present equal value.
*   public boolean equals(Object ob )
*
*/
public class OptionalClass {

    public void withoutOptionalExample01() {
        String[] info = new String[3];
        info[0] = "John";

        // with / without info[1] - see result
        //info[1] = "xxx";

        info[2] = new Integer(26).toString();

        System.out.println("info[0]: " + info[0]);
        System.out.println("info[1]: " + info[1].substring(0));
        System.out.println("info[2]: " + info[2]);
    }

    public void withOptionalExample01() {
        String[] info = new String[3];

        info[0] = "John";
        info[2] = new Integer(26).toString();

        Optional<String> optionalOf = Optional.of(info[0]);
        System.out.println("info[0]: " + info[0]);

        Optional<String> isNullInfo1 = Optional.ofNullable(info[1]);
        if(isNullInfo1.isEmpty()) {
            System.out.println("info[1]: " + "null");
        }


        Optional<String> isNullAge = Optional.of(info[2]);
        System.out.println("info[2]: " + info[2]);
    }
}
