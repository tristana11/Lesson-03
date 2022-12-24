public class Lesson03task3 {
    public static void main(String[] args) {
        int hour = 11;
        if (hour >= 0 && hour < 6) {
            System.out.printf("%d - доброй ночи.", hour);
        } else if (hour >=6 && hour < 12) {
            System.out.printf("%d - доброе утро.", hour);
        } else if (hour >=12 && hour < 18) {
            System.out.printf("%d - добрый день.", hour);
        } else if (hour >=18 && hour < 24) {
            System.out.printf("%d - добрый вечер.", hour);
        } else if (hour == 24) {
            System.out.printf("%d - доброй ночи.", hour);
        } else {
            System.out.printf("%d - такого часа в сутках нет.", hour);
        }
    }
}
