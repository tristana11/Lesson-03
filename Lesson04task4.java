public class Lesson04task4 {
    // Вывести таблицу умножения чисел от 1 до 10 (используя while внутри while).
    public static void main(String[] args) {
        int[] multiNum = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int i = 0;
        int j = 0;
        int multiResult;
        while (i < 10) {
            while (j < 10) {
                multiResult = multiNum[i] * multiNum[j];
                System.out.printf("%d ", multiResult);
                j++;
            }
            j = 0;
            i++;
            System.out.println();
        }
    }
}
