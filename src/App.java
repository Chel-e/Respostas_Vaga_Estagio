import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Exercicia Fibonacci
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: " );
        Integer num = sc.nextInt();
        if (Fibonacci.contains(num)) {
            System.out.println("This number belongs to the Fibbonaci sequence");
        } else {
            System.out.println("This number does not belongs to the Fibbonaci sequence");
        }
        // Exercicico String 
        System.out.println("Enter a string: " );
        sc.nextLine();
        String string = sc.nextLine();
        System.out.println(MyString.invert(string));
    }
}
