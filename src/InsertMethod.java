import java.util.Scanner;

public class InsertMethod {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] array = new int[n];


        for (int i = 0; i < n; i++) {

            array[i] = scanner.nextInt();
        }

        insertMethod(array);

        for (int element : array) {
            System.out.print(element + " ");
        }

        scanner.close();
    }

    private static void insertMethod(int[] array) {
        int n = array.length;

        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = key;
        }
    }
}
