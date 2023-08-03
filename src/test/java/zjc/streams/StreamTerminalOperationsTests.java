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
}
