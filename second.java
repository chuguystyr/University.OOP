import java.util.Scanner;
public class second {
    static int findSum(String str)
    {
        String temp = "0";
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch))
                temp += ch;
            else {
                sum += Integer.parseInt(temp);
                temp = "0";
            };
        };
        return sum + Integer.parseInt(temp);
    };
    public static void main(String [] args) {
        System.out.println("Enter your string for check:");
        Scanner in = new Scanner(System.in);
        String user = in.next();
        in.close();
        System.out.println((findSum(user)));
};
};