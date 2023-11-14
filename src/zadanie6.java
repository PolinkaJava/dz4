import java.util.Arrays;
import java.util.Scanner;
public class zadanie6 {
    public static void main(String[] args) {
        System.out.println("Количество элементов в массиве");
        Scanner scanner = new Scanner(System.in);
        int numbers = scanner.nextInt();
        int[] array = new int[numbers];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 50));
        }
        System.out.println("Полученный массив" + Arrays.toString(array));
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[1 + i]) {
                System.out.print("верно");
                break;
            } else
                System.out.println("неверно");
            break;
        }
    }
}

