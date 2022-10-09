import java.util.Scanner;
public class matrix {
    public static void main(String [] args) {
        System.out.println("Enter quantity of columns in matrix:");
        Scanner in = new Scanner(System.in);
        int columnsQuantity = in.nextInt();
        System.out.println("Enter quantity of strings:");
        int stringsQuantity = in.nextInt();
        int[][] array = new int[stringsQuantity][columnsQuantity];
        System.out.println("Enter your numbers:");
        for(int i = 0; i < stringsQuantity; i++) {
            for (int g = 0; g < columnsQuantity; g++) array[i][g] = in.nextInt();
        };
        in.close();
        int columnsCounter = 0;
        boolean withoutZero = true;
        for(int i = 0; i < columnsQuantity; i++) {
            for (int g = 0; g < stringsQuantity; g++) {
                if (array[g][i] == 0) {
                    withoutZero = false;
                    break;
                };
            };
            if (withoutZero == true) columnsCounter++;
            withoutZero = true;
        };
        System.out.println("We have " + columnsCounter + " column(s) without 0");
        boolean hasPositive = false;
        int[] sumArray = new int[stringsQuantity];
        for(int i = 0; i < stringsQuantity; i++) {
            for (int g = 0; g < columnsQuantity; g++) if (array[i][g] > 0) {
                hasPositive = true;
                break;
            };
            if (hasPositive == true) {
                int tmp = 0;
                for (int a = 0; a < columnsQuantity; a++) tmp += array[i][a];
                sumArray[i] = tmp;
        };
        hasPositive = false;
};
        System.out.println("Here's array of sums:");
        for (int i = 0; i < stringsQuantity;i++) if (sumArray[i] != 0) System.out.print(sumArray[i] + " ");
};
};