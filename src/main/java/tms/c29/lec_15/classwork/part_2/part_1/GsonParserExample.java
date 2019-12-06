package tms.c29.lec_15.classwork.part_2.part_1;

import com.google.gson.Gson;
import org.json.JSONObject;
import tms.c29.lec_15.entity.Employee;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class GsonParserExample {
    public static void main(String[] args) throws FileNotFoundException {
        JSONObject jsonObject = new JSONObject("{\n" +
            "  \"id\": \"1\",\n" +
            "  \"firstname\": \"Alex\",\n" +
            "  \"lastname\": \"Fomin\",\n" +
            "  \"location\": \"Minsk\"\n" +
            "}");


        String id = jsonObject.getString("id");
        System.out.println(id);


        Gson gson = new Gson();
        FileReader fr = new FileReader("resources/lec_15/json/employee.json");
        Employee employee = gson.fromJson(fr, Employee.class);

        System.out.println(employee);

    }
}
