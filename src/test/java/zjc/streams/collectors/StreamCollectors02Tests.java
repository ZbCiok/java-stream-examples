package zjc.streams.collectors;

import org.junit.jupiter.api.Test;

public class StreamCollectors02Tests {

    StreamCollectors02 streamCollectors02 = new StreamCollectors02();
    @Test
    public void toCollection01() {
        streamCollectors02.toCollection01();
    }

    @Test
    public void toCollection02() {
        streamCollectors02.toCollection02();
    }

    @Test
    public void toConcurrentMap01() {
        streamCollectors02.toConcurrentMap01();
    }

    @Test
    public void toConcurrentMap02() {
        streamCollectors02.toConcurrentMap02();
    }

    @Test
    public void toConcurrentMap03() {
        streamCollectors02.toConcurrentMap03();
    }

    @Test
    public void toList() {
        streamCollectors02.toList();
    }

    @Test
    public void toSet() {
        streamCollectors02.toSet();
    }
}
