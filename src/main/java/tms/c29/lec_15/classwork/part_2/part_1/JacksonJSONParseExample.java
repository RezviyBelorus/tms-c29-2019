package tms.c29.lec_15.classwork.part_2.part_1;

import com.fasterxml.jackson.databind.ObjectMapper;
import tms.c29.lec_15.entity.Employee;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class JacksonJSONParseExample {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        Employee employee = mapper.readValue(new File("resources/lec_15/json/employee.json"), Employee.class);

        FileWriter fileWriter = new FileWriter("resources/lec_15/json/output.json");

        System.out.println(employee);

        Employee employee1 = new Employee();
        employee1.setFirstName("Trololo");
        List<Employee> employees = Arrays.asList(employee, employee1);
        mapper.writeValue(fileWriter, employees);
    }
}
