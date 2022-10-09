import java.util.Scanner;
public class massive {
    public static void main(String [] args) {
        System.out.println("How many number do you want to have in array?");
        Scanner in = new Scanner(System.in);
        int numberdQuantity = in.nextInt();
        System.out.println("Enter your numbers for the array:");
        float[] array = new float[numberdQuantity];
        for (int i = 0; i < numberdQuantity; i++)
        {
            array[i] = in.nextInt();
        };
        in.close();
        float sumPositive = 0;
        for (int i = 0; i < numberdQuantity; i++)
        {
            if (array[i] > 0) sumPositive += array[i];
        };
        System.out.println("Sum of positive elements: " + sumPositive);
        int min = 0;
        for (int i = 1; i < numberdQuantity; i++)
        {
            if(Math.abs(array[i]) < Math.abs(array[min])) min = i;
        };
        int max = 0;
        for (int i = 1; i < numberdQuantity; i++)
        {
            if(Math.abs(array[i]) > Math.abs(array[max])) max = i;
        };
        float product = 1;
        if (max > min) for (int i = min+1; i < max; i++) {
            product = product * array[i];
        } else for (int i = max+1; i < min; i++) {
            product = product * array[i];
        };
        System.out.println("Product: " + product);
};
};