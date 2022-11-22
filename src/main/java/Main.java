public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService(); // пишем new BonusService() и нажимаем на Ctrl+Alt+V

        // подготавливаем данные:
        long amount = 1000_60;
        boolean registered = true;
        long expected = 30;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        // если true - то PASS
        // если false - то FAIL
        boolean passed = expected == actual;

        //  выводим результат
        //    System.out.println(passed);


//        int x = 2;
//        int y = 4;
//        int z = x++;
//        int w = y++;
//        System.out.println("z равен " + z);
//        System.out.println("x равен " + x);
//        System.out.println("y равен " + y);
//        System.out.println("w равен " + w);


//        int[] numbers = new int[5];
//        numbers[0] = 12;
//        numbers[1] = 14;
////        System.out.println(numbers[4]);
////        int numbers2[] = new int[5];
//        String[] massiv = new String[3];
//        massiv[0] = "aplle";
//        massiv[1] = "banana";
//        massiv[0] = "doc";
////        System.out.println(massiv[0] + ", " + massiv[1] + ", " + massiv[2]);

        String[] family = {"Gala", "Gena", "Glacha"};
        System.out.println(family.length);
        for (int i = 0; i <= family.length; i++) {
            System.out.println(i + "Проход");
        }

        boolean[] tuk = {false, true, true};
//        int[][] sales = new int[2][2];
//        sales[0][0] = 555;
//        sales[1][1] = 333;
//        System.out.println(sales[0][0]);

        int[] items = {10, 20, 30, 40, 50};
//        for (int i = 0; i <= items.length; i++) {
        for (int i = items.length; i > 0; i--) {
            System.out.println(items[i - 1]);
        }
//        int sum = 0;
//        for (int item : items) {
//            if (item % 2 == 0) {
//                sum += item;
//            }
//
//        }
//        System.out.println(sum);
    }

    }

