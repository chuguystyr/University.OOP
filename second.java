public class second {
    public static void main(String [] args) {
        System.out.println("FizzBuzz game");
        int number = 1;
    for (int i = 0; i < 100; i++) {
        if (number %3 == 0) {
            if (number %5 == 0) {
                System.out.println("FizzBuzz");
            } else System.out.println("Fizz");
        } else if (number %5 == 0) {
            System.out.println("Buzz");
        }
        else System.out.println(number);
        number++;
    };
};
};