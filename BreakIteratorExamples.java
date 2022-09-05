import java.text.BreakIterator;

public class BreakIteratorExamples {
    public static void main(String[] args) {
        BreakIterator wordIterator = BreakIterator.getWordInstance();
        String text = "Let's pause, and then reflect.";
        wordIterator.setText(text); //associates a string with a BreakIterator instance
        int boundary = wordIterator.first(); //returns the first boundary of the text
        while (boundary != BreakIterator.DONE) {
            int begin = boundary;
            System.out.print(boundary + "-");
            boundary = wordIterator.next(); //returns the next boundary following the current one
            int end = boundary;
            if(end == BreakIterator.DONE) break;
            System.out.println(boundary + " ["
                    + text.substring(begin, end) + "]");

            //wordIterator.previous(); //returns the boundary preceding the current one
        }
    }
}


