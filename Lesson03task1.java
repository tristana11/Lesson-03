public class Lesson03task1 {
    public static void main(String[] args) {
        int dayOfTheWeek = 1;
        switch (dayOfTheWeek) {
            case 1:
                System.out.printf("%d - is Sunday.%n", dayOfTheWeek);
                break;
            case 2:
                System.out.printf("%d - is Monday.%n", dayOfTheWeek);
                break;
            case 3:
                System.out.printf("%d - is Tuesday.%n", dayOfTheWeek);
                break;
            case 4:
                System.out.printf("%d - is Wednesday.%n", dayOfTheWeek);
                break;
            case 5:
                System.out.printf("%d - is Thursday.%n", dayOfTheWeek);
                break;
            case 6:
                System.out.printf("%d - is Friday.%n", dayOfTheWeek);
                break;
            case 7:
                System.out.printf("%d - is Saturday.%n", dayOfTheWeek);
                break;
            default:
                System.out.printf("%d - there is no such day of the week.%n",
                        dayOfTheWeek);
        }
    }
}
