import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        displayMessage();


    }

    public static void displayMessage(){

        System.out.println("TWO QUESTIONS!\n" +
                "Think of an object, and I'll try to guess it.");
    }

    public static String collectUserInput(){

        System.out.println("Question 1) Is it animal, vegetable, or mineral?");

        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine().toLowerCase();
        System.out.println(input);
        return  input;
    }

}
