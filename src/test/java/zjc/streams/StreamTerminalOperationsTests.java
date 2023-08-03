package zjc.streams;

import org.junit.jupiter.api.Test;

public class StreamTerminalOperationsTests {

    StreamTerminalOperations streamTerminalOperations = new StreamTerminalOperations();
    @Test public void streamAnyMatch() {
        streamTerminalOperations.streamAnyMatch();
    }

    @Test
    public void streamAllMatch() {
        streamTerminalOperations.streamAnyMatch();
    }

    @Test
    public void streamNoneMatch() {
        streamTerminalOperations.streamNoneMatch();
    }

    @Test
    public void collectToMap01() {
        streamTerminalOperations.collectToMap01();
    }

    // IllegalStateException - duplicate keys
    @Test
    public void collectToMap02() {
        streamTerminalOperations.collectToMap02();
    }

    @Test
    public void collectToMap03() {
        streamTerminalOperations.collectToMap03();
    }

    @Test
    public void collectToMap04() {
        streamTerminalOperations.collectToMap04();
    }
}
