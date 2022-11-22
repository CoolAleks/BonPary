import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MilitaryServiceTest {

    MilitaryService service = new MilitaryService();


    @ParameterizedTest (name = "{index} {0} {1} {2} {3}")
    @CsvSource(value={"Soldier, 18, 180, true, 'Молодец вообще красавчик, СВОБОДЕН!'",
            "Tankist, 18, 149, false, Танкист",
            "Tankist, 18, 149, false, Танкист",
            "Tankist, 18, 149, false, Танкист",
            "Tankist, 18, 149, false, Танкист"})
    void shouldValid(String testName, int age, int height, boolean check, String expected) {
        String actual = service.military(age, height, check);
        assertEquals(expected, actual);
    }
}