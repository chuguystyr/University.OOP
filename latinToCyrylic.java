import java.util.Scanner;
public class latinToCyrylic {
    public static void main(String [] args) {
        System.out.println("Enter your word:");
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        in.close();
        word = word.replaceAll("a", "(а|эй)");
        word = word.replaceAll("b", "б");
        word = word.replaceAll("c", "(ц|к|с)");
        word = word.replaceAll("d", "д");
        if (word.endsWith("e")) {word = word.replace("e", "");}
        else word = word.replaceAll("e", "(|и|э)");
        word = word.replaceAll("f", "ф");
        word = word.replaceAll("g", "г");
        word = word.replaceAll("h", "х");
        word = word.replaceAll("i", "(и|ай|)");
        word = word.replaceAll("j", "дж");
        word = word.replaceAll("k", "к");
        word = word.replaceAll("l", "л");
        word = word.replaceAll("m", "м");
        word = word.replaceAll("n", "н");
        word = word.replaceAll("o", "о");
        word = word.replaceAll("p", "п");
        word = word.replaceAll("q", "кв");
        word = word.replaceAll("r", "р");
        word = word.replaceAll("s", "с");
        word = word.replaceAll("t", "т");
        word = word.replaceAll("u", "(у|ю|а)");
        word = word.replaceAll("v|w", "в");
        word = word.replaceAll("x", "кс");
        word = word.replaceAll("y", "(й|ай)");
        word = word.replaceAll("z", "з");
        System.out.println(word);
}
}