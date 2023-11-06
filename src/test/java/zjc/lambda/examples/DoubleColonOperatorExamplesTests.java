package zjc.lambda.examples;

import org.junit.jupiter.api.Test;
public class DoubleColonOperatorExamplesTests {
    DoubleColonOperatorExamples doubleColonOperatorExamples = new DoubleColonOperatorExamples();

    DoubleColonOperatorConstructorExamples doubleColonOperatorConstructorExamples = new DoubleColonOperatorConstructorExamples();
    @Test
    public void doubleColon() {
        doubleColonOperatorExamples.doubleColon();
    }
    @Test
    public void doubleColonStaticMethod() {
        doubleColonOperatorExamples.staticMethod();
    }

    @Test
    public void doubleColonInstanceFunction() {
        doubleColonOperatorExamples.instanceFunction();
    }

    @Test
    public void doubleColonInstanceMethod() {
        new DoubleColonOperatorConstructorExamples.DoubleColonClass().instanceMethod();
    }
}
