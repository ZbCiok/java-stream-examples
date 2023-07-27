package zjc.streams.collectors.GroupingBy;

import zjc.data.Department;
import zjc.data.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupingByClassifierSupplierCollector {

    List<Employee> employees = List.of(
            new Employee(1, "Alex", 30, new Department(1, "HR")),
            new Employee(2, "Alex", 36, new Department(1, "HR")),
            new Employee(3, "David", 30, new Department(1, "HR")),
            new Employee(4, "Andrew", 30, new Department(2, "Finance")),
            new Employee(5, "Edward", 31, new Department(2, "Finance")),
            new Employee(6, "Nathan", 42, new Department(3, "ADMIN")),
            new Employee(7, "Frank", 23, new Department(3, "ADMIN")),
            new Employee(8, "David", 30, new Department(1, "HR")));

    java.util.List<String> strings = Arrays.asList("Zohne", "Redy", "Zohne", "Redy", "Stome");

    // TODO
    public void groupingByCountingFiltering() {

    }
}
