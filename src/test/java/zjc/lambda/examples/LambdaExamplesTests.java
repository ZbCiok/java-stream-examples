package zjc.lambda.examples;

import org.junit.jupiter.api.Test;

public class LambdaExamplesTests {
    LambdaExamples lambdaExamplesTests = new LambdaExamples();
    LambdaComparatorExample lambdaComparatorExampleTest = new LambdaComparatorExample();

    @Test
    public void ExampleSingleParameter() {
        lambdaExamplesTests.ExampleSingleParameter();
    }

    @Test
    public void LambdaExpressionExample() {
        lambdaExamplesTests.LambdaExpressionExample();
    }

    @Test
    public void JLEExampleNoParameter() {
        lambdaExamplesTests.JLEExampleNoParameter();
    }

    @Test
    public void JLEExampleMultipleParameters() {
        lambdaExamplesTests.JLEExampleMultipleParameters();
    }

    @Test
    public void JLEExampleMultipleStatements() {
        lambdaExamplesTests.JLEExampleMultipleStatements();
    }

    @Test
    public void JLEExampleRunnable() {
        lambdaExamplesTests.JLEExampleRunnable();
    }

    @Test
    public void JLEComparatorExample() {
        lambdaComparatorExampleTest.JLEComparatorExample();
    }
}
