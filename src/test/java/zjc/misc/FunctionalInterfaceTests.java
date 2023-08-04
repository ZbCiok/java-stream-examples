package zjc.misc;

import org.junit.jupiter.api.Test;

public class FunctionalInterfaceTests {
    FunctionalInterface functionalInterface = new FunctionalInterface();

    @Test
    public void supplierInterface() {
        functionalInterface.supplierInterface();
    }

    @Test
    public void consumerInterface() {
        functionalInterface.consumerInterface();
    }

    @Test
    public void functionInterface() {
        functionalInterface.functionInterface();
    }

    @Test
    public void predicateInterface() {
        functionalInterface.predicateInterface();
    }

    @Test
    public void biFunction01() {
        functionalInterface.biFunction01();
    }

    @Test
    public void biOperator01() {
        functionalInterface.biOperator01();
    }
}
