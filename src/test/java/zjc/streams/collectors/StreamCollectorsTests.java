package zjc.streams.collectors;

import org.junit.jupiter.api.Test;
import zjc.streams.collectors.StreamCollectors;

public class StreamCollectorsTests {
    StreamCollectors streamCollectors = new StreamCollectors();

    @Test
    public void StreamCollectors() {
        streamCollectors.averagingDouble();
    }

    @Test
    public void averagingInt() {
        streamCollectors.averagingInt();
    }

    @Test
    public void averagingLong() {
        streamCollectors.averagingLong();
    }

    @Test
    public void collectingAndThen() {
        streamCollectors.collectingAndThen();
    }

    @Test
    public void counting() {
        streamCollectors.counting();
    }

    @Test
    public void groupingBy() {
        streamCollectors.groupingBy();
    }

    @Test
    public void CollectToList() {
        streamCollectors.collectToList();
    }

    @Test
    public void mapping() {
        streamCollectors.mapping();
    }

    @Test
    public void maxBy() {
        streamCollectors.maxBy();
    }

    @Test
    public void minBy() {
        streamCollectors.minBy();
    }
}
