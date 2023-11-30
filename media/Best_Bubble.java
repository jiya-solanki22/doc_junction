import java.util.Scanner;

public class BubbleSortSwaps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] data = new int[size];
        int[] data1 = new int[size];

        for (int i = 0; i < size; i++) {
            data[i] = scanner.nextInt();
            data1[i] = data[i];
        }

        int countDesc = bubbleSortDescend(data, size);
        int countAsc = bubbleSortAscend(data1, size);

        if (countDesc < countAsc) {
            System.out.print(countDesc);
        } else {
            System.out.print(countAsc);
        }
    }

    public static int bubbleSortDescend(int[] array, int size) {
        int count = 0;
        for (int step = 0; step < size - 1; step++) {
            boolean swapped = false;
            for (int i = 0; i < size - step - 1; i++) {
                if (array[i] < array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    count++;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        return count;
    }

    public static int bubbleSortAscend(int[] array, int size) {
        int count = 0;
        for (int step = 0; step < size - 1; step++) {
            boolean swapped = false;
            for (int i = 0; i < size - step - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    count++;
                    swapped = true;
                }
            }
            if (!swapped) {
                break; 
            }
        }
        return count;
    }
}