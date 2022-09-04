public class SplitExamples {
    public static void main(String[] args) {
        String text = "Mr. Smith went to 123 Washington avenue.";
        //String text = "Let's pause, and then " + " reflect.";
        String tokens[] = text.split("\\s+");
        for(String token : tokens) {
            System.out.println(token);
        }
    }
}
