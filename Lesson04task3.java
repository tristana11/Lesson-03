public class Lesson04task3 {
    // Используя while, вывести в Standard Output первых 10 чисел Фибоначчи.
    public static void main(String[] args) {
        String textFib = "Число Фибоначчи";
        System.out.println("  10 Чисел Фибоначчи:");
        System.out.printf("1. %s  0 %n", textFib);
        System.out.printf("2. %s  1 %n", textFib);

        int firstNumFib = 0;
        int secondNumFib = 1;
        int counter = 3;
        int numFibonacci;
        while (counter < 11) {
            numFibonacci = firstNumFib + secondNumFib;
            firstNumFib = secondNumFib;
            secondNumFib = numFibonacci;
            System.out.printf("%d. %s %d %n", counter, textFib, numFibonacci);
            counter++;
        }
    }
}
