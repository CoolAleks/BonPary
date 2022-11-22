import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HealthTest {
    Health man = new Health();

    @Test
    void shouldNormPressure() {
        String actual = man.ratePressure(110);
        String expected = "Норм давление";
        assertEquals(expected, actual);
    }
}