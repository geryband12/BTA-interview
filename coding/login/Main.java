import java.nio.file.*;
import java.util.*;
import org.json.*;

public class Main {

    public static void main(String[] args) throws Exception {
        String jsonContent = Files.readString(Paths.get("employees.json"));
        JSONArray employees = new JSONArray(jsonContent);
        Map<String, Double> result = averageSalaryByDepartment(employees);
        System.out.println(result);
    }

    public static Map<String, Double> averageSalaryByDepartment(JSONArray employees) {
        // TODO: Implement average salary logic
        return new HashMap<>();
    }
}
