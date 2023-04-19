import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SectionCTest {
    
    @Test
    public void testValidISBN13() {
        String isbn = "9780544272990";
        assertEquals("Valid", SectionC.check_ISBN(isbn));
    }
    
    @Test
    public void testInvalidISBN13() {
        String isbn = "9780544272999";
        assertEquals("Invalid", SectionC.check_ISBN(isbn));
    }
    
    @Test
    public void testConvertISBN10ToISBN13() {
        String isbn10 = "0544272994";
        String expectedIsbn13 = "9780544272990";
        assertEquals(expectedIsbn13, SectionC.check_ISBN(isbn10));
    }
    
    @Test
    public void testValidISBN10() {
        String isbn = "0544272994";
        assertEquals("Valid", SectionC.check_ISBN(isbn));
    }
    
    @Test
    public void testInvalidISBN10() {
        String isbn = "0544272999";
        assertEquals("Invalid", SectionC.check_ISBN(isbn));
    }
    
    @Test
    public void testInvalidFormat() {
        String isbn = "978-05-44-2729-90";
        assertEquals("Invalid", SectionC.check_ISBN(isbn));
    }
    
    @Test
    public void testISBN13WithX() {
        String isbn = "9780306406157X";
        assertEquals("Valid", SectionC.check_ISBN(isbn));
    }
}
