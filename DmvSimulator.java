import java.util.Random;

public class DmvSimulator {

    public static void main(String[] args) {

        System.out.println("Welcome to the dmv");
        Random random = new Random();
        int userNumber = random. nextInt(100);
        System.out.println("Your number is " + userNumber + ", please wait untill your number is called.");

        int currentNumber = userNumber + 1;

        while (true) {
            if (currentNumber == 100)
                currentNumber = 0;
            System.out.println("Now serving number " + currentNumber);
            if (currentNumber == userNumber)
                break;
            currentNumber++;
        }
        System.out.println("Your number " + userNumber + " is now being served.");
        System.out.println("I'm sorry you do not have the requierd paperwork.");
    }
}
