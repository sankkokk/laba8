import java.util.*;
import static java.lang.Math.*;
import static java.lang.System.exit;
public class zadanie_1_laba_8 {
    public static void main(String[] args) {
        System.out.println("input n");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        int result = 0;
        System.out.println("fill the array");
        for (int i = 0, j = n - 1; i < n; i++, j--)
        {
            arr [i] = in.nextInt();
            if (arr [i] > 1 || arr[i] < 0)
            {
                System.out.println("wrong number");
                exit(0);
            }
            result += arr[i] * pow(2,j);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(result + " in decimal");
        StringBuilder num = new StringBuilder();
        while (result > 0) {
            num.insert(0, result % 4);
            result = result / 4;
        }
        result = Integer.parseInt(num.toString());
        int [] arrAns = new int [num.length()];
        for (int i = num.toString().length() - 1; result > 0; i--){
            arrAns[i] = result % 10;
            result /= 10;
        }
        System.out.println(Arrays.toString(arrAns));
    }
}
