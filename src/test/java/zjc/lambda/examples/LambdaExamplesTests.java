package zjc.lambda.examples;

import org.junit.jupiter.api.Test;

public class LambdaExamplesTests {
    LambdaExamples lambdaExamples = new LambdaExamples();
    LambdaComparatorExample lambdaComparatorExample = new LambdaComparatorExample();

    @Test
    public void ExampleSingleParameter() {
        lambdaExamples.ExampleSingleParameter();
    }

    @Test
    public void LambdaExpressionExample() {
        lambdaExamples.LambdaExpressionExample();
    }

    @Test
    public void JLEExampleNoParameter() {
        lambdaExamples.lExampleNoParameter();
    }

    @Test
    public void JLEExampleMultipleParameters() {
        lambdaExamples.lExampleMultipleParameters();
    }

    @Test
    public void JLEExampleMultipleStatements() {
        lambdaExamples.lExampleMultipleStatements();
    }

    @Test
    public void JLEExampleRunnable() {
        lambdaExamples.lExampleRunnable();
    }

    @Test
    public void JLEComparatorExample() {
        lambdaComparatorExample.lComparatorExample();
    }
}
