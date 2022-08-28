import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Examples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner("Let's pause, and then " + " reflect.");
        List<String> list = new ArrayList<>();
        while(scanner.hasNext()) {
            String token = scanner.next();
            list.add(token);
        }
        for(String token : list) {
            System.out.println(token);
        }
    }
}
