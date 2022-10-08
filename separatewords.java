import java.util.Scanner;
public class separatewords {
    public static void main(String [] args) {
        System.out.println("Enter your string:");
        Scanner in = new Scanner(System.in);
        String user = in.nextLine();
        in.close();
        user = user.replaceAll("\\d", "");
        user = user.replaceAll("  ", " ");
        String[] splitted = user.split(" ");
        for (int i = 0; i < splitted.length; i++) {
            System.out.println(splitted[i]);
        };
};
};