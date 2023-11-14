import java.util.Arrays;
import java.util.Scanner;
public class zadanie5 {
    public static void main(String[] args) {
        System.out.println("Количество элементов в массиве");
        Scanner scanner = new Scanner(System.in);
        int numbers = scanner.nextInt();
        int [] array = new int[numbers];
        for (int i = 0; i < array.length; i++)
        {array[i] = ((int) (Math.random() * 50));}
//        { array[i] = scanner.nextInt(); }
        System.out.println("Полученный массив" + Arrays.toString(array));
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[  array.length- i - 1];
            array[array.length - i - 1] = temp; }

            System.out.print("Значения в обратном порядке " + Arrays.toString(array));
        }
    }



