import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

Student student = new Student();

    @ParameterizedTest(name = "{index} {0}  Класс" )
    @CsvSource(value = {" 4, 'Сдаёшь ОГЭ'",
            "9, 'Сдаёшь пробный ЕГЭ'",
            "11, 'Сдаёшь ЕГЭ'",
            "1, 'Введён не экзаменационный класс'",
            "0, 'Введены не корректные данные'",
            "12, 'Введены не корректные данные'"})
    void shouldExamCorrect(int level, String expected) {
        String actual = student.exam(level);
        assertEquals(expected, actual);
    }
}