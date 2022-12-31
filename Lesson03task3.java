public class Lesson03task3 {
    public static void main(String[] args) {
        int numHourDay = 11;
        if (numHourDay >= 0 && numHourDay < 6) {
            System.out.printf("%d - доброй ночи.", numHourDay);
        } else if (numHourDay >= 6 && numHourDay < 12) {
            System.out.printf("%d - доброе утро.", numHourDay);
        } else if (numHourDay >= 12 && numHourDay < 18) {
            System.out.printf("%d - добрый день.", numHourDay);
        } else if (numHourDay >= 18 && numHourDay < 24) {
            System.out.printf("%d - добрый вечер.", numHourDay);
        } else {
            System.out.printf("%d - такого часа в сутках нет.", numHourDay);
        }
    }
}
