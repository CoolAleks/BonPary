public class Student {

    public String exam(int level) {
        switch (level) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
                return "Введён не экзаменационный класс";
            case 4:
                return "Сдаёшь ОГЭ";
            case 9:
                return "Сдаёшь пробный ЕГЭ";
            case 11:
                return "Сдаёшь ЕГЭ";
        }
        return "Введены не корректные данные";
    }
}