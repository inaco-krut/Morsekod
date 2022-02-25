import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Tester {

    @Test
    public void testSOS() {

        ConvertToText converter = new ConvertToText();
        String actual = converter.getConverterToText("... --- ...");

        assertEquals("sos", actual);

    }

    @Test
    public void TestOrd() {

        ConvertToText converter = new ConvertToText();
        String actual = converter.getConverterToText(".... . .--- ... .- -.");

        assertEquals("hejsan", actual);

    }

    @Test
    public void TestRemoveWhiteSpace() {

        ConvertToText converter = new ConvertToText();
        String actual = converter.getConverterToText(" ");

        assertEquals("", actual);
    }
}