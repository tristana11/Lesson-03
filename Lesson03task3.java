public class Lesson03task3 {
    public static void main(String[] args) {
        int hourOfDay = 11;
        if (hourOfDay >= 0 && hourOfDay < 6) {
            System.out.printf("%d - доброй ночи.", hourOfDay);
        } else if (hourOfDay >= 6 && hourOfDay < 12) {
            System.out.printf("%d - доброе утро.", hourOfDay);
        } else if (hourOfDay >= 12 && hourOfDay < 18) {
            System.out.printf("%d - добрый день.", hourOfDay);
        } else if (hourOfDay >= 18 && hourOfDay < 24) {
            System.out.printf("%d - добрый вечер.", hourOfDay);
        } else {
            System.out.printf("%d - такого часа в сутках нет.", hourOfDay);
        }
    }
}
