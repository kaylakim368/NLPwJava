import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScannerExamples2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner("Let's pause, and then " + " reflect.");
        List<String> list = new ArrayList<>();
        scanner.useDelimiter("[ ,.]");

        /*
        scanner.useLocale(); //to set the default delimiter-matching
        scanner.radix(); //when working with numbers
        scanner.skip(); //skip input matching the pattern and ignore the delimiters
        scanner.findInLine(); //finds the next occurrence of a pattern ignoring delimiters
         */

        //scanner.reset();
        while(scanner.hasNext()) {
            String token = scanner.next();
            list.add(token);
        }
        for(String token : list) {
            System.out.println(token);
        }
    }
}
