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

    public static void collectUserInputDoLogic(){
        System.out.println("Question 1) Is it animal, vegetable, or mineral?");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine().toLowerCase();

        if(input.equals("animal")){

            System.out.println("Question 2) Is it bigger than a breadbox?");

            input = scan.nextLine().toLowerCase();

            if(input.equals("no")){
                System.out.println("\n" +
                        "My guess is that you are thinking of a mouse.\n" +
                        "I would ask you if I'm right, but I don't actually care.");

            }
            if(input.equals("yes")){
                System.out.println("\n" +
                        "My guess is that you are thinking of a moose.\n" +
                        "I would ask you if I'm right, but I don't actually care.");

            }

            else {
                System.out.println("You did'n enter the correct information and now you have to start over");

            }

        }

        if(input.equals("vegetable")){

            System.out.println("Question 2) Is it bigger than a breadbox?");

            input = scan.nextLine().toLowerCase();

            if(input.equals("no")){
                System.out.println("\n" +
                        "My guess is that you are thinking of a carrot.\n" +
                        "I would ask you if I'm right, but I don't actually care.");

            }
            if(input.equals("yes")){
                System.out.println("\n" +
                        "My guess is that you are thinking of a watermelon.\n" +
                        "I would ask you if I'm right, but I don't actually care.");

            }

            else {
                System.out.println("You did'n enter the correct information and now you have to start over");

            }

        }

        if(input.equals("mineral")){

            System.out.println("Question 2) Is it bigger than a breadbox?");

            input = scan.nextLine().toLowerCase();

            if(input.equals("no")){
                System.out.println("\n" +
                        "My guess is that you are thinking of a paper clip.\n" +
                        "I would ask you if I'm right, but I don't actually care.");

            }
            if(input.equals("yes")){
                System.out.println("\n" +
                        "My guess is that you are thinking of a Camaro.\n" +
                        "I would ask you if I'm right, but I don't actually care.");

            }

            else {
                System.out.println("You did'n enter the correct information and now you have to start over");

            }

        }else{
            System.out.println("You did'n enter the correct information and now you have to start over");        }

    }

}
