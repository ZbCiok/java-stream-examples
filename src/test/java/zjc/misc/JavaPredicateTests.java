package zjc.misc;

import org.junit.jupiter.api.Test;

public class JavaPredicateTests {
    JavaPredicate javaPredicate = new JavaPredicate();

    @Test
    public void divisibleBy3() {
        javaPredicate.divisibleBy3();
    }

    @Test
    public void filterFirstUpperCase() {
        javaPredicate.filterFirstUpperCase();
    }

    @Test
    public void greaterThan6() {
        javaPredicate.greaterThan6();
    }

    @Test
    public void isEqualTestPredicate() {
        javaPredicate.isEqualTestPredicate();
    }

    @Test
    public void isEqualPredicate() {
        javaPredicate.isEqualPredicate();
    }

    @Test
    public void andPredicate() {
        javaPredicate.andPredicate();
    }

    @Test
    public void negatePredicate() {
        javaPredicate.negatePredicate();
    }

    @Test
    public void orPredicate() {
        javaPredicate.orPredicate();
    }
}
