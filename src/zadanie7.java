import java.util.Scanner;

public class zadanie7 {

    public static void main(String[] args) {
        System.out.println("Количество элементов в массиве");
        Scanner scanner = new Scanner(System.in);
        int numbers = scanner.nextInt();
        int[] array = new int[numbers];
        System.out.println("Введите элементы массива");
        for (int i = 0; i < array.length; i++) {
            Scanner scanner1 = new Scanner(System.in);
            int znachenie = scanner1.nextInt();
            array[i] = znachenie;


    }}

}