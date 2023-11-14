public class zadanie2 {
public static void main(String[] args) {
    int[] array = {6, 8, 3, 5, 1, 9, 45, 1234, 56, 87};
    int min = array[0];
    int max = array[0];

    for (int i = 0; i < array.length; i++) {
        if (array[i] < min) {
            min = array[i];
        }
        if (array[i] > max) {
            max = array[i];

        }
    }
    System.out.println( min);
    System.out.println( max);
}
}