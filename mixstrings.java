import java.util.Scanner;
public class mixstrings {
    public static void main(String [] args) {
        System.out.println("Enter your strings to be mixed:");
        Scanner in = new Scanner(System.in);
        String user = in.nextLine();
        String user2 = in.nextLine();
        in.close();
        StringBuffer str = new StringBuffer(user);
        int l = 1;
        for (int i = 0; i < user.length(); i++) {
            str.insert(l, user2.charAt(i));
            l += 2;
        };
        int lengthDifference = user2.length() - user.length();
        if (user.length() < user2.length()) str.append(user2.subSequence(lengthDifference-1, user2.length()));
        System.out.println(str);
};
};