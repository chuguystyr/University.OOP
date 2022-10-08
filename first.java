import java.util.Scanner;
public class first {
    public static void main(String [] args) {
        System.out.println("Enter your string for check:");
        Scanner in = new Scanner(System.in);
        String user = in.next();
        in.close();
        System.out.println((user.endsWith("ed")));
};
};