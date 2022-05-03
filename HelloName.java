import java.util.Scanner;


public class HelloName {



    public static void main(String[] args) {



        Scanner reader = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String input = reader.nextLine();
        reader.close();

        System.out.println("Hello " + input + "!");

    }
}
