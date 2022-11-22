public class Health {

    public String ratePressure(int pressure) {
        while (pressure <= 120 && pressure >= 100) {
            return "Норм давление";
        }
        while (pressure < 100) {
            return "Низкое давление";
        }
        while (pressure > 120) {
            return "Высокое давление";
        }
        return null;
    }
}

