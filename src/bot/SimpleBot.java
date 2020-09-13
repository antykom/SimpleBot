package bot;

import java.util.Scanner;

public class SimpleBot {
    final static Scanner scanner = new Scanner(System.in); // Do not change this line

    public static void main(String[] args) {
        greet("Red Queen", "2020"); // change it as you need
        remindName();
        guessAge();
        count();
        test();
        end();
    }

    /**
     * greet - a method that allows the BOT to say hello
     *
     * @param assistantName - bot name
     * @param birthYear     - year of creating bot
     */
    static void greet(String assistantName, String birthYear) {
        System.out.println("Hello! My name is " + assistantName + ".");
        System.out.println("I was created in " + birthYear + ".");
        System.out.println("Please, remind me your name.");
    }

    /**
     * remindName - method takes the username and displays it
     */
    static void remindName() {
        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");
    }

    /**
     * guessAge - the method guesses the age of the user after entering three division by 3, 5, and 7 remainders
     */
    static void guessAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Say me remainders of dividing your age by 3, 5 and 7.");
        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }

    /**
     * count - The method shows how to count up to any number that the user enters
     */
    static void count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.printf("%d!\n", i);
        }
    }

    /**
     * test - The method that test user programming knowledge
     */
    static void test() {
        System.out.println("Let's test your programming knowledge.");
        boolean answerIsCorrect = false;
        int answerOption;

        while (!answerIsCorrect) {
            System.out.println("What type of data should be used to store the user's age?");
            System.out.println("1. boolean");
            System.out.println("2. String");
            System.out.println("3. float");
            System.out.println("4. int");
            answerOption = scanner.nextInt();

            if (answerOption == 4) {
                answerIsCorrect = true;
            } else {
                System.out.println("Please, try again");
            }
        }
    }

    static void end() {
        System.out.println("Congratulations, have a nice day!");
    }
}
