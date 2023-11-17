import java.util.Scanner;
import java.util.Arrays;

public class zadanie {
    public static void main(String[] args) {
        System.out.println(" размер массива: ");
        Scanner sc = new Scanner(System.in);
        int colichestvo = sc.nextInt();
        int[] array = new int[colichestvo];
        System.out.println("элементы массива: ");
        for (int i = 0; i < array.length; i++) {
            int element = sc.nextInt();
            array[i] = element;
        }

        for (int i = array.length - 1; i >= 0; i--) {
            array[i]++;
            if (array[i] != 10) {
                break;
            }
            if (i == 0) {
                array = new int[array.length + 1];
                array[0] = 1;
            } else {
                array[i] = 0;
            }
        }
        System.out.println("полученный массив: " + Arrays.toString(array));
    }
}