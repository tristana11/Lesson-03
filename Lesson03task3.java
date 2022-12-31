public class Lesson03task3 {
    public static void main(String[] args) {
        int numTimeDay = 6;
        if (numTimeDay >= 0 && numTimeDay < 6) {
            System.out.printf("%d - доброй ночи.", numTimeDay);
        } else if (numTimeDay >= 6 && numTimeDay < 12) {
            System.out.printf("%d - доброе утро.", numTimeDay);
        } else if (numTimeDay >= 12 && numTimeDay < 18) {
            System.out.printf("%d - добрый день.", numTimeDay);
        } else if (numTimeDay >= 18 && numTimeDay < 24) {
            System.out.printf("%d - добрый вечер.", numTimeDay);
        } else {
            System.out.printf("%d - такого часа в сутках нет.", numTimeDay);
        }
    }
}
