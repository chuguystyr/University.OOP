import java.util.Scanner;
public class third {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter numbers for array");
        int[] array;
        array = new int[10];
        int sum = 0;
    for (int i = 0; i < 10; i++) {
        array[i] = in.nextInt();
        sum += array[i];
    };
    in.close();
    int halfSum = 0;
    if (sum %2 == 0) {
        halfSum = sum / 2;}
        else {
            System.out.println("false");
            return;
        };
    sum = 0;
    for (int i = 0; i < array.length; i++)
    {
        if (sum + array[i] == halfSum) {
            System.out.println("true");
            break;
        };
        if (sum + array[i] > halfSum) {
            System.out.println("false");
            break;
        };
        sum += array[i];
    };
    };
};