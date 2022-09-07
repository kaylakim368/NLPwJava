import java.io.IOException;
import java.io.StreamTokenizer;
import java.io.StringReader;

public class StreamTokenizerExamples {
    public static void main(String[] args) throws IOException {
        try {
            StreamTokenizer tokenizer = new StreamTokenizer(
                    new StringReader("Let's pause, and then reflect."));
            tokenizer.ordinaryChar('\'');
            tokenizer.ordinaryChar(',');
            //tokenizer.whitespaceChars(); //specifies which characters are to be treated as whitespaces
            boolean isEOF = false;
            while (!isEOF) {
                int token = tokenizer.nextToken();
                switch (token) {
                    //ttype (int) the type of token read
                    case StreamTokenizer.TT_EOF: //(static int) a constant for the end of the stream
                        isEOF = true;
                        break;
                    case StreamTokenizer.TT_EOL: //(static int) a constant for the end of the line
                        break;
                    case StreamTokenizer.TT_WORD: //a constant indicating a word token
                        System.out.println(tokenizer.sval); //(String) contains the token if the current token is a word token
                        break;
                    case StreamTokenizer.TT_NUMBER: //the number of tokens read
                        System.out.println(tokenizer.nval); //(Double) contains a number if the current token is a number token
                        break;
                    default:
                        System.out.println((char) token);
                }
            }
        } catch (IOException ex) {
            //Handle the exception
        }
    }
}


