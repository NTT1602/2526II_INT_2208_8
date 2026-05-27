import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

public class TamGiacTest {

    @Test
    void TC1() {
        assertEquals("Invalid Input", TamGiac.classify(0, 50, 50));
    }

    @Test
    void TC2() {
        assertEquals("Invalid Input", TamGiac.classify(50, 101, 50));
    }

    @Test
    void TC3() {
        assertEquals("Invalid Input", TamGiac.classify(50, 50, 0));
    }

    @Test
    void TC4() {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));
        TamGiac.main(new String[] { "a", "50", "50" });
        System.setOut(originalOut);
        assertEquals("Invalid Input", baos.toString().trim());
    }

    @Test
    void TC5() {
        assertEquals("Not a Triangle", TamGiac.classify(1, 2, 3));
    }

    @Test
    void TC6() {
        assertEquals("Not a Triangle", TamGiac.classify(2, 6, 2));
    }

    @Test
    void TC7() {
        assertEquals("Not a Triangle", TamGiac.classify(5, 2, 1));
    }

    @Test
    void TC8() {
        assertEquals("Equilateral", TamGiac.classify(1, 1, 1));
    }

    @Test
    void TC9() {
        assertEquals("Equilateral", TamGiac.classify(50, 50, 50));
    }

    @Test
    void TC10() {
        assertEquals("Equilateral", TamGiac.classify(100, 100, 100));
    }

    @Test
    void TC11() {
        assertEquals("Isosceles", TamGiac.classify(50, 50, 60));
    }

    @Test
    void TC12() {
        assertEquals("Isosceles", TamGiac.classify(50, 60, 50));
    }

    @Test
    void TC13() {
        assertEquals("Isosceles", TamGiac.classify(60, 50, 50));
    }

    @Test
    void TC14() {
        assertEquals("Scalene", TamGiac.classify(3, 4, 5));
    }

    @Test
    void TC15() {
        assertEquals("Scalene", TamGiac.classify(98, 99, 100));
    }
}
