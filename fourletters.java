import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class fourletters {
    public static void main(String [] args) {
        System.out.println("Enter your words:");
        Scanner in = new Scanner(System.in);
        String words = in.nextLine();
        in.close();
        Pattern p1 = Pattern.compile("\\b\\w{4}\\b");
        Matcher matcher = p1.matcher(words);
        while(matcher.find()){
            System.out.println(matcher.group());
        };
}
}