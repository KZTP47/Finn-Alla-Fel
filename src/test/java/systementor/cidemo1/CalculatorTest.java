package systementor.cidemo1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    private final int a = 1;
    private final int b = 2;


    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void addShouldReturn3() {
        int result = calculator.add(a,b);//tog bort +1000
        assertEquals(3,result);
    }

    @Test
    void subtractShouldReturnNegative1() {
        int result = calculator.subtract(a,b);
        assertEquals(-1,result);//stod -10, ska vara -1
    }

    @Test
    void multiplyShouldReturn2() {
        int result = calculator.multiply(a,b);//dividerade med 0, det får man inte göra. ändrade 0 -> b
        assertEquals(2,result);
    }


    @Test
    void divideShouldReturn0() {
        int result = calculator.divide(a,b);
        assertEquals(0,result);//ändrade andra argumentet till result
    }


    @Test
    void divideByZeroThrowsError(){
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(5,0));
    }



}
