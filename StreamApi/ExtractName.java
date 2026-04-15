package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    private String name;

    // Constructor
    public Employee(String name) {
        this.name = name;
    }

    // Getter
    public String getName() {
        return name;
    }

    // toString() for printing
    @Override
    public String toString() {
        return "Employee{name='" + name + "'}";
    }
}

public class ExtractName {

    public static void main(String[] args) {
        
        List<String> list = Arrays.asList("Ankit", "Rahul","Navikant","Lakshay");
        System.out.println(list);

        // Convert List<String> to List<Employee>
        List<Employee> emp = list.stream()
                .map(n -> new Employee(n))
                .collect(Collectors.toList());

        System.out.println(emp);
    }
}
