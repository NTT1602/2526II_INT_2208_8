import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CS2045Test {

    @Test
    void TC_INV_01() {
        assertEquals("Invalid Input", CS2045.eval(17, 50.0, 650, 'C'));
    }

    @Test
    void TC_INV_02() {
        assertEquals("Invalid Input", CS2045.eval(66, 50.0, 650, 'C'));
    }

    @Test
    void TC_INV_03() {
        assertEquals("Invalid Input", CS2045.eval(30, 4.9, 650, 'C'));
    }

    @Test
    void TC_INV_04() {
        assertEquals("Invalid Input", CS2045.eval(30, 500.1, 650, 'C'));
    }

    @Test
    void TC_INV_05() {
        assertEquals("Invalid Input", CS2045.eval(30, 50.0, 299, 'C'));
    }

    @Test
    void TC_INV_06() {
        assertEquals("Invalid Input", CS2045.eval(30, 50.0, 851, 'C'));
    }

    @Test
    void TC_INV_07() {
        assertEquals("Invalid Input", CS2045.eval(30, 50.0, 650, 'X'));
    }

    @Test
    void TC_VAL_01() {
        assertEquals("REJECT", CS2045.eval(18, 5.0, 300, 'C'));
    }

    @Test
    void TC_VAL_02() {
        assertEquals("REJECT", CS2045.eval(30, 100.0, 500, 'F'));
    }

    @Test
    void TC_VAL_03() {
        assertEquals("REJECT", CS2045.eval(30, 14.9, 501, 'C'));
    }

    @Test
    void TC_VAL_04() {
        assertEquals("REJECT", CS2045.eval(30, 10.0, 700, 'F'));
    }

    @Test
    void TC_VAL_05() {
        assertEquals("REJECT", CS2045.eval(30, 12.0, 701, 'F'));
    }

    @Test
    void TC_VAL_06() {
        assertEquals("MANUAL REVIEW", CS2045.eval(65, 14.0, 850, 'C'));
    }

    @Test
    void TC_VAL_07() {
        assertEquals("APPROVE", CS2045.eval(30, 15.0, 600, 'C'));
    }

    @Test
    void TC_VAL_08() {
        assertEquals("APPROVE", CS2045.eval(30, 500.0, 800, 'C'));
    }

    @Test
    void TC_VAL_09() {
        assertEquals("MANUAL REVIEW", CS2045.eval(30, 25.0, 650, 'F'));
    }

    @Test
    void TC_VAL_10() {
        assertEquals("MANUAL REVIEW", CS2045.eval(30, 75.0, 750, 'F'));
    }
}
