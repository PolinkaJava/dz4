public class zadanie3 {
    public static void main(String[] args) {
int[] array = {1,4,8,7,87,23,6,96};
int max = 0;
int min = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[min]) {
                min = i;
            }
            if (array[i] > array[max]) {
                max = i;

            }
        }
        System.out.println( min);
        System.out.println( max);
    }
}

















