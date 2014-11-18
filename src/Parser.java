import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Parser {

    public String parse(String filename) throws IOException {

        BufferedReader in = new BufferedReader(new FileReader(filename));
        String line = in.readLine();
        in.close();
        return line;

    }
}
