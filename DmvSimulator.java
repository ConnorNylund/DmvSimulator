import java.util.Random;

public class DmvSimulator {

    public static void main(String[] args) {

        System.out.println("Welcome to the DMV");
        Random random = new Random();
        int userNumber = random.nextInt(100);
        System.out.println("Your number is " + userNumber + ", please wait until your number is called.");

        int currentNumber = userNumber + 1;

        while (true) {
            if (currentNumber == 200)
                currentNumber = 0;
            System.out.println("Now serving number: " + currentNumber);
            if (currentNumber == userNumber)
                break;
            currentNumber++;
            int chance = random.nextInt(100);
            if (chance == 0) { 
                System.out.println("You have all the required paperwork and are all set.");
                break;
            } else if (chance > 0 && chance <= 98) { 
                System.out.println("Are you so incompetent to not have the required paperwork?! Why can't people just bring what is required!?");
            }
        }
        System.out.println("Your number " + userNumber + " is now being served.");
    }
}