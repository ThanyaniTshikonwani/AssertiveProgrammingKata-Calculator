import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest extends Calculator {

    @org.junit.jupiter.api.Test
    void additions() {
        assertEquals(5,additions(2,3));
        assertEquals(15,additions(1,2,3,4,5));
    }

    @org.junit.jupiter.api.Test
    void multiplication() {
        assertEquals(6,multiplication(2,3));
        assertEquals(120,multiplication(1,2,3,4,5));
    }
}