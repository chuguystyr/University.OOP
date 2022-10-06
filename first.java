import java.util.Scanner;
public class first {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter numbers for array");
        int[] array;
        array = new int[10];
    for (int i = 0; i < 10; i++) {
        array[i] = in.nextInt();
    };
    in.close();
    boolean a = true;
    for (int i = 1; i < 10; i++) {
        if (array[i] >= array[i-1]) a = true;
        else {
        a = false;
        break;
    };
    };
    if (a == true) System.out.print("true");
    else System.out.print("false");
    };
};