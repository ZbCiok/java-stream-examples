package zjc.streams.collectors;

import org.junit.jupiter.api.Test;
import zjc.streams.collectors.GroupingBy.GroupingByClassifierSupplierCollector;

public class GroupingByClassifierSupplierCollectorTests {

    GroupingByClassifierSupplierCollector groupingByClassifierSupplierCollector = new GroupingByClassifierSupplierCollector();

    @Test
    public void groupingByCountingFiltering() {
        groupingByClassifierSupplierCollector.groupingByCountingFiltering();
    }
}
