import java.util.Arrays;

public class zadanie_1_laba_8 {
    public static void quickSort(int[] array, int low, int high) {
        int k = 0;
        if (array.length == 0)
            return;
        if (low >= high)
            return;
        int middle = low + (high - low) / 2;
        int opora = array[middle];
        int i = low, j = high;
        while (i <= j) {
            k++;
            while (array[i] < opora) {
                i++;
            }
            while (array[j] > opora) {
                j--;
            }
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j)
            quickSort(array, low, j);
        if (high > i)
            quickSort(array, i, high);
        if (k == 3) System.out.println(Arrays.toString(array)+ "comparison of the Quick sorting process on the 3th cycle");
    }
    public static void main(String[] args) {
        int[] x = { 8, 0, 4, 7, 3, 7, 10, 12, -3 };
        int[] x1 = { 8, 0, 4, 7, 3, 7, 10, 12, -3 };
        int counter = 0; int temp; int low = 0; int high = x.length - 1;
        System.out.println("Было");
        System.out.println(Arrays.toString(x));
        quickSort(x, low, high);
        System.out.println("Стало");
        System.out.println(Arrays.toString(x));
        boolean isSorted = false; // Bubblesort
        System.out.println("Было");
        System.out.println(Arrays.toString(x1));
        while (!isSorted) {
            isSorted = true;
            for (int j = 0; j < x.length - 1; j++) {
                if (x1[j] > x1[j + 1]) {
                    temp = x1[j];
                    x1[j] = x1[j + 1];
                    x1[j + 1] = temp;
                    isSorted = false;
                    counter++;
                    if (counter == 3) System.out.println(Arrays.toString(x) + "comparison of the Bubble sorting process on the 3th cycle");
                }
            }
        }
        System.out.println("YEEES");
        System.out.println(Arrays.toString(x1));
    }
}
