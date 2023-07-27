package zjc.lambda.examples;

import org.junit.jupiter.api.Test;
public class DoubleColonOperatorExamplesTests {
    DoubleColonOperatorExamples doubleColonOperatorExamples = new DoubleColonOperatorExamples();

    DoubleColonOperatorConstructorExamples doubleColonOperatorConstructorExamples = new DoubleColonOperatorConstructorExamples();
    @Test
    public void GFG() {
        doubleColonOperatorExamples.GFG();
    }
    @Test
    public void StaticMethod() {
        doubleColonOperatorExamples.StaticMethod();
    }

    @Test
    public void InstanceFunction() {
        doubleColonOperatorExamples.InstanceFunction();
    }

    @Test
    public void instanceMethod() {
        doubleColonOperatorConstructorExamples.new GFG().instanceMethod();
    }
}
