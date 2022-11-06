import java.nio.file.Files;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.nio.file.Path;
import java.io.IOException;
public class DifferentWords2 {
    static void printUniqueWords(String str) {
        HashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
        String[] words = str.split("\\W");
        for (String word : words) {
            if (map.containsKey(word.toLowerCase())) {
                map.put(word.toLowerCase(), map.get(word.toLowerCase()) + 1);
            }
            else
                map.put(word.toLowerCase(), 1);
        }
        System.out.println("Different words: ");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1)
                System.out.println(entry.getKey());
        }
        System.out.println("All words and how many times they happen in text: ");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + (float) entry.getValue() / 582);
        }
    }
    public static void main(String[] args) throws IOException {
        Path filePath = Path.of("D:\\Programing\\ООП\\Лабораторна робота №8\\random.txt");
        String str = Files.readString(filePath);
        printUniqueWords(str);
    }
}