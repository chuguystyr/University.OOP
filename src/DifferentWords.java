import java.nio.file.Files;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.nio.file.Path;
import java.io.IOException;
public class DifferentWords {
    static void printUniqueWords(String str) {
        HashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
        String[] words = str.split("\\W");
        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            }
            else
                map.put(word, 1);
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
                if (entry.getValue() == 1) System.out.println(entry.getKey());
        }
    }
    public static void main(String[] args) throws IOException {
        Path filePath = Path.of("D:\\Programing\\ООП\\Лабораторна робота №8\\random.txt");
        String str = Files.readString(filePath);
        printUniqueWords(str);
    }
}