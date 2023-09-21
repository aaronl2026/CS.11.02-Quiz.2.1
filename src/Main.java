import java.util.Scanner;

/* I have neither given nor received any unauthorized aid on this piece of work */

public class Main {
    public static int add(int numOne, int numTwo){
        return (numOne+numTwo);
    }

    public static String greeting(String name){
        return ("Bonjour, "+name+"!");
    }

    public static int add(int numOne, int numTwo, int numThree, int numFour){
        int oneAndTwo = add(numOne, numTwo);
        int threeAndFour = add(numThree, numFour);
        int total = add(oneAndTwo, threeAndFour);
        return total;
    }

    public static String printMe(String toBePrinted){
        System.out.println("The answer to your fourth function is: "+toBePrinted+"!");
        return "";
    }

    public static void main(String[] args) {
        Scanner scannerOneOne = new Scanner(System.in);
        System.out.println("Input the first of two numbers to add to the first function.");
        int userInputOneOne = scannerOneOne.nextInt();
        Scanner scannerTwoTwo = new Scanner(System.in);
        System.out.println("Input the second of two numbers to add to the first function.");
        int userInputOneTwo = scannerTwoTwo.nextInt();
        int resultOne = add(userInputOneOne, userInputOneTwo);


        Scanner scannerTwo = new Scanner(System.in);
        System.out.println("What is your name? This is for the second function.");
        String userInputTwo = scannerTwo.nextLine();
        String resultTwo = greeting(userInputTwo);

        Scanner scannerThreeOne = new Scanner(System.in);
        System.out.println("Input the first of four numbers to add to the third function.");
        int userInputThreeOne = scannerThreeOne.nextInt();
        Scanner scannerThreeTwo = new Scanner(System.in);
        System.out.println("Input the second of four numbers to add to the third function.");
        int userInputThreeTwo = scannerThreeTwo.nextInt();
        Scanner scannerThreeThree = new Scanner(System.in);
        System.out.println("Input the third of four numbers to add to the third function.");
        int userInputThreeThree = scannerThreeThree.nextInt();
        Scanner scannerThreeFour = new Scanner(System.in);
        System.out.println("Input the fourth of four numbers to add to the third function.");
        int userInputThreeFour = scannerThreeFour.nextInt();
        int resultThree = add(userInputThreeOne, userInputThreeTwo,userInputThreeThree,userInputThreeFour);

        Scanner scannerFour = new Scanner(System.in);
        System.out.println("Type in something to print out. This is for the last function.");
        String userInputFour = scannerFour.nextLine();

        System.out.println("The answer to your first function is: "+resultOne+"!");
        System.out.println("The answer to your second function is: "+resultTwo+"!");
        System.out.println("The answer to your third function is: "+resultThree+"!");
        printMe(userInputFour);


    }

}
