import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class palindromes {
    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        
        while(left < right)
        {
            if(str.charAt(left) != str.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String [] args) {
        System.out.println("Enter your words:");
        Scanner in = new Scanner(System.in, "Cp866");
        String words = in.nextLine();
        in.close();
        Pattern p1 = Pattern.compile("\\d+");
        String[] splitted = words.split("\s");
        int counter = 0;
        for (int i = 0; i < splitted.length;i++) {
            Matcher matcher = p1.matcher(splitted[i]);
            if (matcher.matches()) {
                if (isPalindrome(splitted[i])) counter++;
            };
        };
        System.out.println("We have " + counter + " palindromic word(s) consisting only of numbers");
}
}