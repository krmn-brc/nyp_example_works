import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        //numberList();
       

        List<Employee> employees = Arrays.asList(
            new Employee("Ahmet", 20d), 
            new Employee("Emin", 23d), 
            new Employee("Adnan", 21d), 
            new Employee("Zekeriya", 22d), 
            new Employee("Davut", 19d)
            );
        
        writeList(employees);
       Collections.sort(employees);
        writeList(employees);

    }

    private static void numberList() {
        List<Integer> numbers = Arrays.asList(60, 90, 80, 70, 40);

        writeList(numbers);
        Collections.sort(numbers);
        writeList(numbers);
    }

    private static void writeList(Iterable collection) {
        System.out.println("\n--------------\n");
        for (Object item : collection) {
            System.out.println(item);
        }
    }
}




