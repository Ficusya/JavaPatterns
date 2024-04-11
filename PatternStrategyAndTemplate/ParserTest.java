import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ParserTest {
    @Test
    public void testLettersParser() {
        ParserStrategy lettersParser = new LettersParser();
        String input = "123abc!@#";
        String expected = "abc";
        String actual = lettersParser.parse(input);
        assertEquals(expected, actual, "LettersParser должен извлекать только буквы");
    }

    @Test
    public void testDigitsParser() {
        ParserStrategy digitsParser = new DigitsParser();
        String input = "123abc!@#";
        String expected = "123";
        String actual = digitsParser.parse(input);
        assertEquals(expected, actual, "DigitsParser должен извлекать только цифры");
    }

    @Test
    public void testBothParser() {
        ParserStrategy bothParser = new BothParser();
        String input = "123abc!@#";
        String expected = "123abc";
        String actual = bothParser.parse(input);
        assertEquals(expected, actual, "BothParser должен извлекать буквы и цифры");
    }
}