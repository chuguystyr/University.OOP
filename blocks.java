import java.util.Scanner;
public class blocks {
    static int findBlock(String str)
    {
        int blockCounter = 0;
        int blockCounterTemp = 0;
        char letter = str.charAt(0);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == letter) {
                blockCounterTemp ++;
            } else {
                if (blockCounter < blockCounterTemp)
                    blockCounter = blockCounterTemp;
                letter = str.charAt(i);
                blockCounterTemp = 1;
            }
        };
       return blockCounter;
    };
    public static void main(String [] args) {
        System.out.println("Enter your string for check:");
        Scanner in = new Scanner(System.in);
        String user = in.next();
        in.close();
        System.out.println(findBlock(user));
};
};
