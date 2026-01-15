// import java.util.Scanner;

public class UnitOne { // class name must be the same as file name

    public static void main(String[] args) { // public means the method is available outside of the class, static means the method belongs to the UnitOne class, void means that the method has no value
        System.out.println("Hello, world!"); // println prints a string, then creates a new line
        System.out.print("Hello, world!"); // print continues on the same line without creating a new one
        System.out.print("Hello, world!");

        // primitive data types: int, double, char, boolean
        int age = 16; // int must be a whole number, no decimals
        // long number = 1358923759;

        double gpa = 4; // double can hold decimals or integers
        float weight = 56.89f;

        char letter = 'A'; // holds one letter, must use single quotes

        boolean alive = true; // a boolean is a true or false value. it is primitive because it is stored as a 1 or 0, not as the words "true" or "false"
        
        final int ID = 699663; // final locks the variable, meaning it cannot be reassigned to a new value

        System.out.println(gpa);
        System.out.println(age);
        // System.out.println(number);
        System.out.println(weight);
        System.out.println(letter);
        System.out.println(alive);
        System.out.println(ID);

        // reference (Object) data types

        String firstName = "Name";
        String lastName = new String("McNamerson"); // the 'correct' (AP test) way to create a string object, by calling the string constructor

        System.out.println(firstName + " " + lastName); // can print multiple variables on the same line by using '+'

        // Scanner object is a reference data type

        // Scanner userInput = new Scanner(System.in); // Scanner method 'scans' for input/output

        // System.out.println("Enter your first name: ");
        // firstName = userInput.nextLine(); //nextLine() takes in a String as input. When switching from nextDouble() or nextInt() back to nextLine(), you must 'clear the buffer' by running nextLine without it being assigned to anything.

        // System.out.println("Enter your last name: ");
        // lastName = userInput.nextLine(); //nextLine() takes in a String as input

        // System.out.println("Enter your age: ");
        // age = userInput.nextInt(); //nextInt() takes in an integer as input

        // System.out.println("Enter your GPA: ");
        // gpa = userInput.nextDouble();

        // System.out.println("Name: " + firstName + " " + lastName);
        // System.out.println("Age: " + age);
        // System.out.println("GPA: " + gpa);
        
        // Commenting is a useful way to debug code by commenting out certain sections of code so they don't execute at runtime
        /* This is a
        multi line
        comment
        */

        // Escape sequences
        System.out.println("Hello \\ world!"); // the backslash \ indicates an escape sequence. in order to add a backslash into a string without it being registered as an escape sequence, you must type \\
        System.out.println("Hello \'world\'!"); // to add single or double quotes to a string, you must use \' or \"
        System.out.println("Hello \"world\"!"); 
        System.out.println("Hello \n world!"); // \n creates a new line
        System.out.println("Hell\bo \r w"); // \r is 'carraige return' which does not make a new line, but simply goes back to the start of the line, overwriting previous output. \b is a backspace escape sequence
        System.out.println("Hello \t world!"); // \t is a tab/indent

        System.out.println("This is an edit I made from home, and will push to GitHub to pull when I return to school tomorrow.");

        // arithmetic operators
        // +, -, *, /, %

        System.out.println(7*2); // if an operation contains two integer values, it will return an integer. if an operation contains a double, it will return a double

        System.out.println(5 + 4.5 * (7/2) - 5); // order of operations matters (PEMDAS)

        //Compound assignment operators
        int number = 0;
        System.out.println(number);
        number++; // increase by 1
        System.out.println(number);
        number--; // decrease by 1
        System.out.println(number);
        number+=10; // number = number + 10
        System.out.println(number);
        number-=5; // number = number - 5
        System.out.println(number);
        number*=10; // number = number * 3
        System.out.println(number);
        number/=3; // number = number/2
        System.out.println(number);

        // typecasting
        System.out.println((double)number/4);

        int max = Integer.MAX_VALUE; // 32-bit integer limit, 2,147,483,648
        max++; // overflow error, reverts to negative value
        System.out.println(max);

        int min = Integer.MIN_VALUE;
        System.out.println(min);
        min--;
        System.out.println(min);
    }

}