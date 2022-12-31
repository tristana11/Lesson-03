public class Lesson03task4 {
    public static void main(String[] args) {
        int numHourDay = 7;
        System.out.printf("%d - ", numHourDay);
        String day = "Добрый день";
        String evening = "Добрый вечер";
        String night = "Доброй ночи";
        String morning = "Доброе утро";
        /*textTimeDay(day);
        textTimeDay(evening);
        textTimeDay(night);
        textTimeDay(morning);*/

        switch (numHourDay) {
            case 0:
                textTimesOfDay(night);
                break;
            case 1:
                textTimesOfDay(night);
                break;
            case 2:
                textTimesOfDay(night);
                break;
            case 3:
                textTimesOfDay(night);
                break;
            case 4:
                textTimesOfDay(night);
                break;
            case 5:
                textTimesOfDay(night);
                break;
            case 6:
                textTimesOfDay(morning);
                break;
            case 7:
                textTimesOfDay(morning);
                break;
            case 8:
                textTimesOfDay(morning);
                break;
            case 9:
                textTimesOfDay(morning);
                break;
            case 10:
                textTimesOfDay(morning);
                break;
            case 11:
                textTimesOfDay(morning);
                break;
            case 12:
                textTimesOfDay(day);
                break;
            case 13:
                textTimesOfDay(day);
                break;
            case 14:
                textTimesOfDay(day);
                break;
            case 15:
                textTimesOfDay(day);
                break;
            case 16:
                textTimesOfDay(day);
                break;
            case 17:
                textTimesOfDay(day);
                break;
            case 18:
                textTimesOfDay(evening);
                break;
            case 19:
                textTimesOfDay(evening);
                break;
            case 20:
                textTimesOfDay(evening);
                break;
            case 21:
                textTimesOfDay(evening);
                break;
            case 22:
                textTimesOfDay(evening);
                break;
            case 23:
                textTimesOfDay(evening);
                break;
            default:
                System.out.println("такого часа в сутках нет");
        }
}
    public static void textTimesOfDay(String word) {
        System.out.println(word);
    }
}
