import java.nio.file.Files;
import java.util.ArrayList;
import java.nio.file.Path;
import java.util.Collections;
public class Sorting {
    public static void main(String[] args) throws Exception {
        Path filePath = Path.of("D:\\Programing\\ООП\\Лабораторна робота №8\\random.txt");
        String str = Files.readString(filePath);
        ArrayList<String> list= new ArrayList<String>();
        for(String tmp: str.split("\\.")){
            list.add(tmp.strip());
        }
        Collections.sort(list);
        for(String tmp: list) {
            System.out.println(tmp + ".");
        }
    }
}