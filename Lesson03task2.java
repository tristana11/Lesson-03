public class Lesson03task2 {
    public static void main(String[] args) {
        int dayOfTheWeek = 11;
        if (dayOfTheWeek == 1) {
            System.out.printf("%d - is Sunday.%n", dayOfTheWeek);
        } else if (dayOfTheWeek == 2) {
            System.out.printf("%d - is Monday.%n", dayOfTheWeek);
        } else if (dayOfTheWeek == 3) {
            System.out.printf("%d - is Tuesday.%n", dayOfTheWeek);
        } else if (dayOfTheWeek == 4) {
            System.out.printf("%d - is Wednesday.%n", dayOfTheWeek);
        } else if (dayOfTheWeek == 5) {
            System.out.printf("%d - is Thursday.%n", dayOfTheWeek);
        } else if (dayOfTheWeek == 6) {
            System.out.printf("%d - is Friday.%n", dayOfTheWeek);
        } else if (dayOfTheWeek == 7) {
            System.out.printf("%d - is Saturday.%n", dayOfTheWeek);
        } else {
            System.out.printf("%d - there is no such day of the week.%n",
                    dayOfTheWeek);
        }
    }
}
