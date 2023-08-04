package zjc.streams.collectors.GroupingBy;

import org.junit.jupiter.api.Test;

public class GroupingByClassifierCollectorTests {

    GroupingByClassifierCollector groupingByClassifierCollector = new GroupingByClassifierCollector();
    @Test
    public void groupingByCounting() {
        groupingByClassifierCollector.groupingByCounting();
    }

    public static class GroupingByClassifierSupplierCollectorTests {

        GroupingByClassifierSupplierCollector groupingByClassifierSupplierCollector = new GroupingByClassifierSupplierCollector();

        @Test
        public void groupingByCountingFiltering() {
            groupingByClassifierSupplierCollector.groupingWithFiltering();
        }
    }
}
