import java.util.*;
public class Numbers {
    public static List<Integer> list = new ArrayList<Integer>();
    public static void enterList() {
        Random random = new Random();
        for(int i = 0; i < 100; i++)
        {
            int number = random.nextInt(-1000,1000);
            list.add(number);
        }
    }
    public static void printList()
    {
        for(int i = 0; i < list.size(); i++)
        {
            System.out.print(list.get(i) + " ");
        }
    }
    public static void main(String[] args) 
    {        
        enterList();
        System.out.println("Initial list");
        printList();
        System.out.println("\nResulting list");
        int i = 0;
        int res = 0;
        while(i < list.size() - res)
        {
            if(list.get(i) < 0)
            {
                list.add(list.get(i));
                list.remove(list.get(i));
                res++;
            }
            else
                i++;   
        }
        printList();
        System.out.println();
    }
}