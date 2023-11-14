import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
int[] array = new int[6];

System.out.println("все элементы в прямом порядке");
for (int i = 0; i < array.length; i++) {
    System.out.println(i);
}
        System.out.println("все элементы в обратном порядке");
        for (int i = array.length - 1;  i >= 0; i--) {
            System.out.println(i);
        }







    }
}