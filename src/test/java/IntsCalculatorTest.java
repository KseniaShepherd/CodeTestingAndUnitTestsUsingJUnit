import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IntsCalculatorTest {
    private static IntsCalculator intsCalculator;

    @BeforeAll
    static void init() {
        intsCalculator = new IntsCalculator();
    }

    @Test
    void sum() {
        // given:
        final int a = 2;
        final int b = 2;
        final int expected = 4;
        // when:
        final int result = intsCalculator.sum(a, b);
        // then:
        assertEquals(expected, result);
    }

    @Test
    void mult() {
        // given:
        final int a = 2;
        final int b = 2;
        final int expected = 4;
        // when:
        final int result = intsCalculator.mult(a, b);
        // then:
        assertEquals(expected, result);
    }

    @Test
    void pow() {
        // given:
        final int a = 2;
        final int b = 2;
        final int expected = 4;
        // when:
        final int result = intsCalculator.pow(a, b);
        // then:
        assertEquals(expected, result);
    }
}