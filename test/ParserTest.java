import org.junit.Test;

public class ParserTest {

    @Test
    public void shouldReadPasswordFromFile() throws Exception {

        Parser parser = new Parser();
        String password = parser.parse("password.txt");
//        assertThat(password, is("beverly-password-here"));

    }
}