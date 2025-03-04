import java.util.Scanner;

public class args{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        System.out.println("Введіть 5 чисел:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }
        scanner.close();
        System.out.println("Введені числа:");
        for (int num : numbers) {
            System.out.println(num);
        }
        System.out.println("Третє число: " + numbers[2]);
    }
}