public class MilitaryService {
    int age = 18;
    int ageLimit = 37;
    int height = 180;
    boolean check = true;

    public MilitaryService(int age, int height, boolean check) {
        this.age = age;
        this.height = height;
        this.check = check;
    }

    public MilitaryService() {
    }

    public String military(int age, int height, boolean check) {
        if (age < 18) {
            return "Ставим на учёт в военкомат и пока свободен, прийдёшь когда исполнится 18 лет";
        } else if (age > ageLimit) {
            return "Что припёрся! Иди работай!!!!!!!!!!";
        } else if (age >= 18 && age <= ageLimit) {
            if (check == true) {
                return "Молодец вообще красавчик, СВОБОДЕН!";
            } else {
                if (height >= 180) {
                    return "Дисант";
                } else if (height <= 150) {
                    return "Танкист";
                } else {
                    return "Пехота";

                }
            }
        }
        return "Работа выполнена";
   }
}
