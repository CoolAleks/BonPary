import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BonusServiceTest2 {
    BonusService service = new BonusService();


    @ParameterizedTest(name = "{index} {0}")
    @CsvSource(value = {"'shouldCalculateForRegisteredAndUnderLimit', 1000_60, true, 30",
            "'shouldCalculateForRegisteredAndOverLimit', 1_000_000_60, true, 500",
            "'shouldCalculateForNotRegisteredAndOverLimit', 1_000_000_60, false, 500",
            "'shouldCalculateForNotRegisteredAndUnderLimit', 1000_60, false, 10"})
    void shouldCalculate(String nameTest, long amount, boolean registered, long expected) {
        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);
    }
}