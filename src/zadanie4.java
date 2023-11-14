public class zadanie4 {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 0, 4, 6, 7, 0, 9};
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                count++;
            }
        }

        System.out.println("Количество нулевых элементов в массиве: " + count);

        if (count == 0) {
            System.out.println("Нулевых элементов в массиве нет.");
        }
















    }
    }