package zjc.streams.collectors.GroupingBy;

import org.junit.jupiter.api.Test;

public class GroupingByClassifierDownstreamTests {

    GroupingByClassifierDownstream groupingByClassifierDownstream = new GroupingByClassifierDownstream();
    @Test
    public void groupingByCounting() {
        groupingByClassifierDownstream.groupingByCounting();
    }

}
