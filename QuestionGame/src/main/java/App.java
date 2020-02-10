import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        displayMessage();
        collectUserInputDoLogic();


    }

    public static void displayMessage(){

        System.out.println("TWO QUESTIONS!\n" +
                "Think of an object, and I'll try to guess it.");
    }

    public static String collectUserInputDoLogic(){
        System.out.println("Question 1) Is it animal, vegetable, or mineral?");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine().toLowerCase();

        if(input.equals("animal")){
            System.out.println("Working");
        }else{
            System.out.println("not working");
        }

        return  input;

    }

}
